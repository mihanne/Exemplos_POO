package conta;

public class Conta_poupança extends Conta {
private long rendimento;

	public Conta_poupança(long numero, long saldo, long rendimento) {
		super(numero,saldo);
		this.rendimento=rendimento;
	}

	public long getRendimento() {
		return rendimento;
	}

	public void setRendimento(long rendimento) {
		this.rendimento = rendimento;
	}
	public long calculaSaldo() {
		return rendimento + getSaldo();
	}
}
