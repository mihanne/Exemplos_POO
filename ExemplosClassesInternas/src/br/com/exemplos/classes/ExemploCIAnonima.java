package br.com.exemplos.classes;

public class ExemploCIAnonima {

	public static void main(String[] args) {
	//	Pessoa novapessoa = new Pessoa();
		Pessoa p = new Pessoa() {
		 int i = 1;
		 double x =0;
		 void comer() {
			 System.out.println(i + " bolo... Nhaac!");
		}
		};
		
		p.comer();

	}

}
