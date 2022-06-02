/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minibanco;

/**
 *
 * @author Hanne
 */
public class Conta {
    private long numero;
    protected double saldo;
   
    
    
    public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}


//construtor de conta
	public Conta(long n) {
        numero = n;
        saldo = 0;
    }
    
    public void fecharconta() {
    	
    }
    
    public void depositar(double v){
    if (v>0)
        saldo = saldo + v;
    }
   
    public boolean sacar(double v){
    if ( v>0 && ((saldo-v) >= 0) ){
        saldo = saldo - v;
        return true;
    }
    else
        return false;
    }
    
    public double consultarSaldo(){
        return(saldo);
    }
    
    public long obterNumero(){
        return(numero);
    }
}
