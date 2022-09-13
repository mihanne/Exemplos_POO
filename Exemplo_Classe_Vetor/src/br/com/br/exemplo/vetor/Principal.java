package br.com.br.exemplo.vetor;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[2];
		Data[] datanasc = new Data[2];
		
		Scanner ler = new Scanner(System.in);
		String nome, sobrenome;
		int dia,mes,ano;
		float peso,altura;
		 //entrada de dados no vetor de Pessoas
		for(int i=0;i<2;i++)
		{
			System.out.println("Digite nome: ");
			nome = ler.next();
			System.out.println("Digite sobrenome: ");
			sobrenome = ler.next();
			
			System.out.println("Digite dia, mês e ano: ");
			dia = ler.nextInt();
			mes = ler.nextInt();
			ano = ler.nextInt();
			
			System.out.println("Digite peso: ");
			peso = ler.nextFloat();
			System.out.println("Digite Altura: ");
			altura = ler.nextFloat();
			
			for(int y=0; y<i-1;y++)
			{
				if(pessoas[y].getNome().equals(nome) && pessoas[y].getSobrenome().equals(sobrenome))
					break;
			}
			datanasc[i]= new Data(dia,mes,ano);
			pessoas[i] = new Pessoa(nome,sobrenome,peso,altura,datanasc[i]);
			
			pessoas[i].calculaIMC();
		}
		//loop para mostrar os resultados
		for(int i=0;i<pessoas.length;i++)
		{
			System.out.println(pessoas[i].mostra());
		}
	}

}
