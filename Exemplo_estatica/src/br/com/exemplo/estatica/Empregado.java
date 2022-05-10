package br.com.exemplo.estatica;

public class Empregado {
	public static int proximoEmpregadoId = 0;
	public static final double TAXA_AUMENTO_SALARIO = 1.05;
	private int empregadoId;
	private String nome;
	private double salario;
	
	static { System.out.println("Bloco de inicial. estatico 1"); }
	static { System.out.println("Bloco de inicial. estatico 2"); }
	static { System.out.println("Bloco de inicial. estatico 3"); }

	public Empregado(String nome , double salario) {
		proximoEmpregadoId ++;
		empregadoId = proximoEmpregadoId;
		this.nome = nome;
		this.salario = salario;
		}
	public void imprimeDados() {
		System.out.println("Nome: "+ this.nome + "\nSalário: "+this.salario);
	}
	
	public double aumentaSalario() {
		return salario*TAXA_AUMENTO_SALARIO;
	}
	public int getIdentificacao() { return empregadoId; }
}
