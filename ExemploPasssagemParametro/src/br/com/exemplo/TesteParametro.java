package br.com.exemplo;

public class TesteParametro {
	public static void m(A obj){
		obj.setA(10);
		obj.setB(20);
		obj = new A(35, 45, 55);
		}
	
	public static void main(String[] args) {
		A obj1, obj2;
		obj1 = new A(1,2,3);
		obj2 = new A(7,8,9);
		obj1.imprimeValores();
		obj2.imprimeValores();
		m(obj1);
		obj1.imprimeValores();

	}

}
