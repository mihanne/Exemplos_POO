package conta;

public class Conta_poupan�a extends Conta {
private long rendimento;

	public Conta_poupan�a(long numero, long saldo, long rendimento) {
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
