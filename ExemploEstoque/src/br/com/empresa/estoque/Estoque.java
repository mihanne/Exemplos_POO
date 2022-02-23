package br.com.empresa.estoque;

public class Estoque {
//	Atributos da classe
	String nome; 
	float valor;
	int qtde;
	
//	Método construtor
	Estoque(String nomeEstoque, float valorEstoque, int qtdeEstoque){
		nome=nomeEstoque;
		valor=valorEstoque;
		qtde=qtdeEstoque;
	}
//Método imprimir
	void imprimirEstoque() {
		System.out.println("Nome do Produto: "+ nome);
		System.out.println("Valor do Produto: "+ valor);
		System.out.println("Qtde do Produto: "+ qtde);
	}

}
