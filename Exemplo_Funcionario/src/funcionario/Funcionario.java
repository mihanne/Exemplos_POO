package funcionario;

public class Funcionario {
	private String nome;
	private int ID;
	private double salario;
	
	
	public Funcionario(String nome, int iD, double salario) {
		this.nome = nome;
		ID = iD;
		this.salario = salario;
	}
	public void exibir(){
		System.out.printf("O funcionário %s, de número %d recebe %.2f por mês", getNome(),getID(),getSalario());
	}
	public void setNome( String nome ){
	this.nome = nome;
	}
	public void setID( int ID ){
	this.ID = ID;
	}
	public void setSalario( double salario ){
		this.salario = salario;
	}
	public String getNome(){
		return this.nome;
	}
	public int getID(){
		return this.ID;
	}
	public double getSalario(){
		return this.salario;
	}
	}
