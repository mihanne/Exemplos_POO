/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formageometrica;

/**
 *
 * @author Hanne
 */
public class FormaGeometrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	
        Retangulo r = new Retangulo();
        System.out.println("numero de lados " + r.getLados() );
        r.pintar(50);
        r.aumentar(100);
       // r.desenhar();
        r.setLados(5);
        System.out.println("numero de lados " + r.getLados() );
    }
    
}
