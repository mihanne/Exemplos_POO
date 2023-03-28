package br.com.exemplo.funcionario;

public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new FPadrao(123,"Joao",1000);
		
		//FPadrao f2 = new Funcionario(147,"Maria", 1000);
		
		
		FPadrao fp1 = new FPadrao(100,"Maria Fernanda",2000);
		System.out.println("Total Proventos: " + fp1.calcularProventos());
		
		FComissionado fc1 = new FComissionado(101,"Pedro Silva",2000,1,10000);
		System.out.println("Total Provendos Func. Comissionado: " + fc1.calcularProventos());
		
		FProdutividade fp2 = new FProdutividade(102, "Maria Pereira", 2000,0.10,1000);
		System.out.println("Total Provendos Func. Produtividade: " + fp2.calcularProventos());
		
		

	}

}
