
package contabancaria;

public class Conta {
    ///atributos que todo conta tem
 
  private  int numero;
  private  String dono;
  private   double saldo;
  private  double limite;
  
 
  //Criar construtor CTRL+ 3 e digitar gcuf
  
  public Conta(int numero, String dono, double limite) {
	  this.numero=numero;
	  this.dono=dono;
	  this.limite=limite;
	  this.saldo=0;
  }
  
  
  
  public int getNumero() {
	return numero;
}



public void setNumero(int numero) {
	this.numero = numero;
}



public String getDono() {
	return dono;
}



public void setDono(String dono) {
	this.dono = dono;
}



public double getSaldo() {
	return saldo;
}



public void setSaldo(double saldo) {
	this.saldo = saldo;
}



public double getLimite() {
	return limite;
}



public void setLimite(double limite) {
	this.limite = limite;
}


	//método que saca uma determinada quantidade.
   public boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
 
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }//fim do método saca.

    //método que deposita uma quantia.
   public  void deposita(double valor) {
        this.saldo += valor; //ou this.saldo = saldo + valor;
        // *soma quantidade ao valor antigo do saldo
        // e guarda no próprio saldo.
    }//fim do método deposita.
}//fim da classe Conta.
