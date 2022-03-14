package br.com.heranca1;

public class A {
    protected int x, y;
    private int z;

    public A(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }
    
    public int obterX(){
       return (x);
    }
    public int obterY(){
       return (y);
    }
    public int obterZ(){
        return (z);
     }
     public void alterarX(int a){
        x = a;
     }
     public void alterarY(int a){
        y = a;
     }
     public void alterarZ(int a){
        z = a;
     }
     public void ImprimeValores(){
         System.out.println("O valor de X é: " + x);
         System.out.println("O valor de Y é: " + y);
         System.out.println("O valor de Z é: " + z);
     }

}
