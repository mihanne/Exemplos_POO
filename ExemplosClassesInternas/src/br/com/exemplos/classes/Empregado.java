package br.com.exemplos.classes;

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
		System.out.println(empregadoId + " "+ nome + " " + salario);
	}
	
	public int getIdentificacao() { return empregadoId; }
	public void aumentaSalario() {
	}
}
