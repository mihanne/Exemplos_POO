package br.com.exemplo.estatica;

public class ClasseInternaEstatica {
	static int v1 = 10;
	int v2 = 20;

	void msg() {
		System.out.println(v1);
		System.out.println(v2);
		//System.out.println(Interna.v3); //nao e possivel , pois v3 nao e estatica
}

	static class Interna {
		int v3 = 30;
	
		void msgInterna() {
			System.out.println(v1);
			//System.out.println(v2); //nao e possivel , pois v2 nao e estatica
			System.out.println(v3);
		}
	}
}
