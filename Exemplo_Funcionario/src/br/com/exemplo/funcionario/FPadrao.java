package br.com.exemplo.funcionario;

public class FPadrao extends Funcionario {

public FPadrao(int matricula, String nome, double salario) {
	super(matricula, nome, salario);
}

public double calcularProventos() {
	return getSalario();
}

}
