package br.com.pratica7;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Menu {

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
		int opcao;
		Funcionario func1 = null;
		Empresa emp1 = null;
		
		ArrayList<Funcionario> funcionarios = new ArrayList<>();

	do {	
		opcao= Integer.parseInt(JOptionPane.showInputDialog("<1> Cadastrar Empresa\n<2>Cadastrar Funcionario e Inserir na Empresa\n<3>Listar Funcionario\n<4>Sair"));
		
		switch (opcao) {
		
		case 1:
			JOptionPane.showMessageDialog(null, "Cadastro da Empresa");
			nome = JOptionPane.showInputDialog("Informe o nome da empresa");
			cnpj = JOptionPane.showInputDialog("Informe o cnpj da empresa");
			qtde_de_funcionario = Integer.parseInt(JOptionPane.showInputDialog("Informe a qtde de funcionarios"));
			
			 emp1 = new Empresa(nome,cnpj,qtde_de_funcionario);
			 JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Cadastro do Funcionario");
			nomeFunc = JOptionPane.showInputDialog("Informe o nome do Funcionario");
			departamento = JOptionPane.showInputDialog("Informe o departamento do Funcionario");
			salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario do Funcionario"));
			dataEntrada = JOptionPane.showInputDialog("Informe a data de entrada do Funcionario");
			RG = JOptionPane.showInputDialog("Informe RG de entrada do Funcionario");
			ativo = Boolean.parseBoolean(JOptionPane.showInputDialog("Informe o status do Funcionario (0 ativo e 1 inativo)"));
			
			func1 = new Funcionario(nomeFunc,departamento,salario, dataEntrada,RG,ativo);
			funcionarios.add(func1); //insere o funcionario no arraylist
			emp1.insereFuncionario(func1);
			break;
		case 3:
			int i = 0;
		    for (Funcionario func: funcionarios) {
		    	JOptionPane.showMessageDialog(null,"Posição: "+ i+ "\n" + func.getNome()+ "\n" +func.getDepartamento()+ "\n" + func.getSalario());
		      i++;
		    }

			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Fim do Programa");
			break;
		
		}
	}while(opcao!=4);
	}
}
