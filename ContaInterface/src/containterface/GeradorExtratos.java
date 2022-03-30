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
public class GeradorExtratos{
    public void geradorConta(Conta conta){
		System.out.println("Saldo Atual: " + conta.getSaldo());
	}

}
