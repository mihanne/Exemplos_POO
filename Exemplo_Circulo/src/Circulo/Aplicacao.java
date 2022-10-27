package Circulo;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x, y, raio;
        
       
        Scanner in = new Scanner (System.in);
      
        System.out.println("Digite as coordenadas do centro: ");
        x = in.nextFloat();
        y = in.nextFloat();
        System.out.println("Digite o raio: ");
        raio = in.nextFloat();
        
        Circulo circ = new Circulo (x, y, raio);
        System.out.println("Circulo criado: ");
        System.out.println("Raio: " + circ.obterRaio());
        System.out.println("Centro: (" + circ.obterCentroX() + ", " + 
                           circ.obterCentroY() + ").");
        System.out.println("");
      //Passando objeto circ como parâmetro
		
		alteraCirculo(circ);
		
		 System.out.println("***Circulo apos a alteração:*** ");
	        System.out.println("Raio: " + circ.obterRaio());
	        System.out.println("Centro: (" + circ.obterCentroX() + ", " + 
	                           circ.obterCentroY() + ").");
	} //fim do método main()
	
	
	
		  //Método 
		  public static void alteraCirculo(Circulo c)
		  {
		  c.alterarCentro(10, 20);
		  c.alterarRaio(5);
		  System.out.println("\n\n**Dados do circulo dentro do método: **");
		  System.out.println("Raio: " + c.obterRaio()); System.out.println("Centro: ("
		  + c.obterCentroX() + ", " + c.obterCentroY() + ").");
		  
		  c = new Circulo(3,3,9);
		  System.out.println("\n\n**Dados do novo circulo dentro do método: **");
		  System.out.println("Raio: " + c.obterRaio()); System.out.println("Centro: ("
		  + c.obterCentroX() + ", " + c.obterCentroY() + ").");
		  
		     }

}
