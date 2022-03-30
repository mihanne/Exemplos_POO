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
public class ContaPoupança implements Conta {
    private double saldo;
@Override	
    public void depositar(double valor) {
		this.saldo += valor;		
	}
@Override
	public double getSaldo() {
		return this.saldo;
	}
@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}
}
