package br.com.heranca1;

public class B extends A{
    private int k;
    
    public B(int a, int b, int c, int d){
       super (a,b,c);
       k = d;
    }
    public void ImprimeValores(){
        System.out.println("O valor de X �: " + x);
        System.out.println("O valor de Y �: " + y);
        System.out.println("O valor de K �: " + k);
        System.out.println("Z n�o � vis�vel nesta classe");
        System.out.println("O valor de Z da superclasse �: " + obterZ());
    }


}
