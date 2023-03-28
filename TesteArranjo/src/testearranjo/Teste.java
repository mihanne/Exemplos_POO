package testearranjo;

public class Teste {
	public static void alteraArranjo(int b[]){

		for(int i=0; i<b.length; i++){
		 b[i] = i*2;
		}
		
		System.out.println("\n**Arranjo b**");
	       for (int valor : b)
	           System.out.print(valor + " - ");

	       
	       b = new int[3];

	       System.out.println("\n**Novo arranjo b**");
	       for (int valor : b)
	           System.out.print(valor + " - ");
	    }

	public static void main(String[] args) {
	       int[] a = {1,2,3,4,5};
	       
	       
	       System.out.println("\n**Arranjo a antes da chamada do método**");
	       for (int valor : a)
	           System.out.print(valor + " - ");
	       
	       alteraArranjo(a);

	       System.out.println("\n**Arranjo a após a chamada do método**");
	       for (int valor : a)
	           System.out.print(valor + " - ");


	}

}
