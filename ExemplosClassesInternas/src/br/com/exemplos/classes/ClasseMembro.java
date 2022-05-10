package br.com.exemplos.classes;

public class ClasseMembro {

	private int valor;

	ClasseMembro(int v) {
		valor = v;
	}

	class ClasseMembroInterna {
	
		void imprimir() {
			System.out.println(valor);
	}

}

}
