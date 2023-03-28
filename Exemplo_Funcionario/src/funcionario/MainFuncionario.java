package funcionario;

public class MainFuncionario {

	public static void main(String[] args) {
		String nome = "Neil Peart";
		int ID=2112;
		double salario = 1000000;
		Funcionario chefe = new Funcionario(nome, ID, salario);
		chefe.exibir();

	}

}
