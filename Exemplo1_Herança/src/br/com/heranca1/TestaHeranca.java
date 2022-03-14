package br.com.heranca1;

public class TestaHeranca {

	public static void main(String[] args) {
		A obj2 = new A(1,1,2);
		B obj1 = new B(10,20,30,40);
	       
	       obj1.ImprimeValores();
	       
	       obj1.alterarY(100);
	       
	       obj1.ImprimeValores();
	       obj2.x=10;
	       obj2.alterarZ(20);
	       obj2.ImprimeValores();
	    
	    
	}

}
