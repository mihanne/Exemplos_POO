package conta;

public class Conta_corrente extends Conta {
	
private long limite;

	
	public Conta_corrente(long numero, long saldo,long limite) {
		super(numero, saldo); // chamada do construtor da super classe - Conta
		this.limite=limite;
	}
	
	public long getLimite() {
		return limite;
	}

	public void setLimite(long limite) {
		this.limite = limite;
	}

	public long consultaSaldoTotal() {
		return limite+ getSaldo();
	}

}
