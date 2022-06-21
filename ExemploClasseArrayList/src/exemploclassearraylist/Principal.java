package exemploclassearraylist;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList <> ();
		
		String nome= JOptionPane.showInputDialog("Digite o Nome");
		int  idade= Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
		String  cpf= JOptionPane.showInputDialog("Digite o CPF");
		Pessoa p1 = new Pessoa(nome, idade, cpf);
		pessoas.add(p1);
		
		
		int i = 0;
	    for (Pessoa contato: pessoas) {
	      System.out.printf("Posição %d- %s %s %d\n", i, contato.getNome(), contato.getCpf(), contato.getIdade() );
	      i++;
	    }

	}

}
