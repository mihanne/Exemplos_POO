package br.com.exemplo.estatica;
import java.text.NumberFormat;

public class ExemploNumberFormat {

	public static void main(String[] args) {
		NumberFormat fmtMoeda = NumberFormat.getCurrencyInstance ();
		NumberFormat fmtPorcento = NumberFormat.getPercentInstance ();
		String str = String.format("%d %.2f", 3, 4.321);

		System.out.println(fmtMoeda.format (12345.6789));
		System.out.println(fmtPorcento.format (15.6789));
		System.out.println(str);

	}

}
