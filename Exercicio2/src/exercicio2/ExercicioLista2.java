package exercicio2;
import java.util.Scanner;

public class ExercicioLista2 {

	public static void main(String[] args) {
		int num; //recebe o numero
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		float cont=0, contPar=0, contImpar=0,soma=0; 
		
		Scanner ler= new Scanner(System.in);
		do
		{
				System.out.println("Digite um n�mero ");
				num= ler.nextInt();
				if(num==999)
					break;
				if(num>maior)
					maior=num;
				if(num<menor)
					menor=num;
				cont++; //conta todos os numeros
				soma=soma+num; //equivale a soma+=num;
				if (num%2==0) //valida numero par
					contPar++;
				else //numero impar
					contImpar++;
		}while(num!=999);
		System.out.println("A m�dia dos numeros � " + (soma/cont));
		System.out.println("O maior n�mero � " + maior);
		System.out.println("O menor n�mero � " + menor);
		System.out.println("A qtde de n�meros pares � " + contPar);
		float percentImpar = (contImpar/cont)*100;
		System.out.printf("O percentual de n�meros impares %.2f%%", percentImpar);	
		ler.close();
	}

}
