package br.com.heranca1;

public class B extends A{
    private int k;
    
    public B(int a, int b, int c, int d){
       super (a,b,c);
       k = d;
    }
    public void ImprimeValores(){
        System.out.println("O valor de X é: " + x);
        System.out.println("O valor de Y é: " + y);
        System.out.println("O valor de K é: " + k);
        System.out.println("Z não é visível nesta classe");
        System.out.println("O valor de Z da superclasse é: " + obterZ());
    }


}
