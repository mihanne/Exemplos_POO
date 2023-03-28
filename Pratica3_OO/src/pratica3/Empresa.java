package pratica3;

public class Empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fpadrao f1 = new Fpadrao(123, "João", 1000);
		System.out.println(f1.toString());
		
		Fcomissionado f2 = new Fcomissionado(14, "Maria", 1000, 500, 10);
		System.out.println(f2.toString());
	}

}
