package contabancaria;

 public class ContaBancaria {
    public static void main(String[] args) {
        // TODO code application logic here
    //cria o objeto da classe Conta
    	Conta minhaConta = new Conta(1234,"Michelle", 1000);
    	minhaConta.deposita(500);
    	System.out.println("Saldo da conta com deposito: " + minhaConta.getSaldo() );
    	minhaConta.saca(100);
    	System.out.println("Saldo Atual da conta: " + minhaConta.getSaldo() );
    	
    }
    }

