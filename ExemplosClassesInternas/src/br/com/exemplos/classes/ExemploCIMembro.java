package br.com.exemplos.classes;

public class ExemploCIMembro {

	public static void main(String[] args) {
		ClasseMembro o1 = new ClasseMembro (1);
		ClasseMembro o2 = new ClasseMembro (2);

		ClasseMembro.ClasseMembroInterna i1 = o1.new ClasseMembroInterna ();
		ClasseMembro.ClasseMembroInterna i2 = o2.new ClasseMembroInterna ();

		i1.imprimir ();
		i2.imprimir ();
	}
}