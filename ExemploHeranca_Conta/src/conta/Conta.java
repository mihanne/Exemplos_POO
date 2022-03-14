/**
 * 
 */
package conta;

/**
 * @author Michelle Note
 *
 */
public class Conta {
	private long numero;
	private long saldo;
	
	public Conta(long numero, long saldo) {
		this.numero=numero;
		this.saldo=saldo;
	}
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public long getSaldo() {
		return saldo;
	}
	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}
	public void depositar(long valor) {
		 this.saldo += valor; 
	}
	
	public boolean sacar(long valor) {
		 if (this.saldo < valor) {
	            return false;
	 
	        } else {
	            this.saldo = this.saldo - valor;
	            return true;
	        }
	}
	

}
