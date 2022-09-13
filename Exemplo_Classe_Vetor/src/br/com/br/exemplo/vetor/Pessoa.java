package br.com.br.exemplo.vetor;

public class Pessoa {
private String nome;
private String sobrenome;
private int idade;
private float peso;
private float altura;
private float imc;
private Data datanascimento;

public float getImc() {
	return imc;
}

public float getAltura() {
	return altura;
}
public void setAltura(float altura) {
	this.altura = altura;
}
public Pessoa(String nome, String sobrenome, float peso, float altura, Data datanascimento) {
	super();
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.idade = idade;
	this.peso = peso;
	this.altura = altura;
	this.datanascimento = datanascimento;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSobrenome() {
	return sobrenome;
}
public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public float getPeso() {
	return peso;
}
public void setPeso(float peso) {
	this.peso = peso;
}

public void calculaIMC() {
	this.imc= this.peso/(this.altura*this.altura);
}

public String mostra() {
	return "Nome: " + getNome() +"\nSobrenome: " + getSobrenome() + "\nIdade: " + getIdade() + "\nPeso: "+ getPeso()+ "\nAltura" + getAltura()+ "\nIMC: " + getImc();
}

public int calculaIdade() {
	datanascimento.getAno();
	datanascimento.getDia();
	datanascimento.getMes();
	
	return 0;
}
}
