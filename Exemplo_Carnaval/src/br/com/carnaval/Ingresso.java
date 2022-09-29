package br.com.carnaval;

public class Ingresso {
private double valorIngresso;

public Ingresso(double valorIngresso) {
	this.valorIngresso = valorIngresso;
}

public double getValorIngresso() {
	return valorIngresso;
}

public void setValorIngresso(double valorIngresso) {
	this.valorIngresso = valorIngresso;
}

public String imprimeIngresso() {
	return "Ingresso: " + getValorIngresso();
}

}
