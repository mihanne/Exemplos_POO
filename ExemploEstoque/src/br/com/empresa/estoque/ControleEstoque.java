package br.com.empresa.estoque;

public class ControleEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		cria o objeto caneta do tipo Estoque e passa os par�metros para criar este objeto.
		Estoque caneta = new Estoque("caneta",2,100);
		caneta.imprimirEstoque();
		
		Estoque lapis = new Estoque("Lapis",1,100);
		lapis.imprimirEstoque();
	}

}
