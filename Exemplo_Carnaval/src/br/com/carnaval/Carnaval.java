package br.com.carnaval;
import javax.swing.JOptionPane;

public class Carnaval {

	public static void main(String[] args) {
	double valor, valorAdicional;
	int opcao;
	String localizacao;
	
	Normal ingressoNormal=null;
	Vip ingressoVip = null;
	Camarote ingressoCamarote = null;
	
	do {
	 opcao=Integer.parseInt(JOptionPane.showInputDialog("<1> Ingresso Normal\n<2>Ingresso VIP\n<3>Ingresso Camarote\n<4>Sair"));
	switch (opcao)
	{
	case 1:
		valor=Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso:"));
		ingressoNormal = new Normal(valor);
		JOptionPane.showMessageDialog(null, ingressoNormal.imprimeIngresso(),"Titulo da janela",JOptionPane.ERROR_MESSAGE);
		break;
	case 2:
		valor=Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso:"));
		valorAdicional=Double.parseDouble(JOptionPane.showInputDialog("Valor Adicional do Ingresso:"));
		ingressoVip = new Vip(valor,valorAdicional);
		JOptionPane.showMessageDialog(null, ingressoVip.imprimeIngresso(),"Mensagem",JOptionPane.DEFAULT_OPTION);
		break;
	case 3:
		valor=Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso:"));
		valorAdicional=Double.parseDouble(JOptionPane.showInputDialog("Valor Adicional do Ingresso:"));
		localizacao = JOptionPane.showInputDialog("Localização:");
		ingressoCamarote = new Camarote (valor,localizacao,valorAdicional);
		JOptionPane.showMessageDialog(null, ingressoCamarote.imprimeIngresso(),"Mensagem",JOptionPane.DEFAULT_OPTION);
		break;
	case 4:
		break;
	default:
		JOptionPane.showMessageDialog(null, "Escolha corretamente uma opção","Mensagem",JOptionPane.DEFAULT_OPTION);
		break;
	}
	
	}while(opcao!=4);
	ingressoCamarote.getValorAdicional();
	
	}

}
