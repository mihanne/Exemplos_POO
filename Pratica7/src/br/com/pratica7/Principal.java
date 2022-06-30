package br.com.pratica7;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String nome;
		String cnpj;
		int qtde_de_funcionario;
		
		String nomeFunc;
		String departamento;
		double salario;
		String dataEntrada;
		String RG;
		boolean ativo;
		
		ArrayList<Funcionario> funcionarios = new ArrayList<>();

		JOptionPane.showMessageDialog(null, "Cadastro da Empresa");
		nome = JOptionPane.showInputDialog("Informe o nome da empresa");
		cnpj = JOptionPane.showInputDialog("Informe o cnpj da empresa");
		qtde_de_funcionario = Integer.parseInt(JOptionPane.showInputDialog("Informe a qtde de funcionarios"));
		
		Empresa emp1 = new Empresa(nome,cnpj,qtde_de_funcionario);
		
		
		JOptionPane.showMessageDialog(null, "Cadastro do Funcionario");
		nomeFunc = JOptionPane.showInputDialog("Informe o nome do Funcionario");
		departamento = JOptionPane.showInputDialog("Informe o departamento do Funcionario");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario do Funcionario"));
		dataEntrada = JOptionPane.showInputDialog("Informe a data de entrada do Funcionario");
		RG = JOptionPane.showInputDialog("Informe RG de entrada do Funcionario");
		ativo = Boolean.parseBoolean(JOptionPane.showInputDialog("Informe o status do Funcionario (0 ativo e 1 inativo)"));
		
		Funcionario func1 = new Funcionario(nomeFunc,departamento,salario, dataEntrada,RG,ativo);
		funcionarios.add(func1); //insere o funcionario no arraylist
		func1.bonificar(1000);
		func1.demitir();
		func1.mostrarDados();
	}

}
