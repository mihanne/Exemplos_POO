package br.com.exemplos.classes;

public class ExemploCILocal {
	static void funcaoMembro(final int a, int b) {
		final String sim = "ok";
		int c = 10;
		
		class ClasseLocal {
			void imprimir() {
				System.out.println(a);
				System.out.println(sim);
				System.out.println(b);
				System.out.println(c);
			}
		 }

		System.out.println(b);

		ClasseLocal local = new ClasseLocal ();
		local.imprimir ();
	}
	public static void main(String[] args) {
		funcaoMembro(10, 20);

	}

}
