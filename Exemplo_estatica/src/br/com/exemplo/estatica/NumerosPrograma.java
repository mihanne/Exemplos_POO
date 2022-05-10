package br.com.exemplo.estatica;

public class NumerosPrograma {

	public static void main(String[] args) {
		int[] v = {1, 3, 6, 8, 10};
		System.out.println(Numeros.soma(v) + " " + Numeros.soma(2, 4, 6));
		System.out.println(Numeros.multiplica(v) + " " + Numeros.multiplica(-2, 5, -3));
	}

}
