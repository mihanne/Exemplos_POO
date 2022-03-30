/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package containterface;

/**
 *
 * @author Hanne
 */
public class ContaInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                ContaCorrente cc = new ContaCorrente();
		cc.depositar(1200.20);
		cc.sacar(300);

		ContaPoupança cp = new ContaPoupança();
		cp.depositar(500.50);
		cp.sacar(25);
		
		
		GeradorExtratos gerador = new GeradorExtratos();
		gerador.geradorConta(cc);
		gerador.geradorConta(cp);
	}

    }
    
