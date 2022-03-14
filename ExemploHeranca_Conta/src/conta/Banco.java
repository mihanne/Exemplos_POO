package conta;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Abertura de Conta Corrente: Digite o número ");
	        long numero = entrada.nextLong();
	        
	    System.out.println("Digite o Saldo ");
	        long saldo = entrada.nextLong();   
	        
		System.out.println("Digite o Limite ");
	        long limite = entrada.nextLong(); 
	        
		System.out.println("Digite o Rendimento ");
        long rendimento = entrada.nextLong();  
	        
	        
	    //cria o objeto do tipo Conta Corrente
	 Conta_corrente CC = new Conta_corrente(numero,saldo, limite);
	 System.out.println("Saldo Total Conta Corrente: " + CC.consultaSaldoTotal());
	 
	 //cria o objeto do tipo Conta Poupança
	 Conta_poupança CP = new Conta_poupança(numero, saldo, rendimento);
	 System.out.println("Saldo Total Conta Poupança: " + CP.calculaSaldo());
	 
	 //depositar em conta Corrente
		System.out.println("Digite o valor de deposito em Conta Corrente ");
        long deposito = entrada.nextLong();  
        CC.depositar(deposito);
        System.out.println("Saldo Total Conta Corrente com deposito: " + CC.consultaSaldoTotal());
        System.out.println("Saldo Real em Conta Corrente: " + CC.getSaldo());
        
	}

}
