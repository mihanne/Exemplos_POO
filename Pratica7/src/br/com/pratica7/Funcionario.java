package br.com.pratica7;

public class Funcionario {
	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String RG;
	boolean ativo;
	public Funcionario(String nome, String departamento, double salario, String dataEntrada, String rG, boolean ativo) {
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
		RG = rG;
		this.ativo = ativo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public void bonificar(double aumento) {
		this.salario+= aumento;
	}
	
	public void demitir() {
		this.ativo= false;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: "+getNome() + "\nDepartamento: " + getDepartamento()+ "\nSalario: " + getSalario() + "\nStatus:" + isAtivo());
	}
	
}
