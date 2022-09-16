package br.com.pratica2.questao2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor inicial do Rendimento:");
		double vrInicial = ler.nextDouble();
		
		System.out.println("Digite a taxa de juros:");
		double txJuros = ler.nextDouble();
		
		System.out.println("Digite o numero de meses para o Rendimento:");
		int numMeses = ler.nextInt();
		
		Rendimento r1 = new Rendimento(vrInicial,txJuros,numMeses); //cria e istancia o objeto r1 com os parâmentros no construtor
		r1.calculaRendimento();

	}

}
