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
public class ContaCorrente implements Conta{
        private double saldo;
	private double taxaOperacao = 0.45;
	@Override
	public void depositar(double valor) {
            this.saldo += valor - taxaOperacao;
	}
        @Override   
	public double getSaldo() {
		return this.saldo;
	}
        @Override
	public void sacar(double valor) {
		this.saldo -= valor + taxaOperacao;
	}

}
