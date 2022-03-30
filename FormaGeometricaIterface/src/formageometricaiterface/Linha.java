/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formageometricaiterface;

/**
 *
 * @author Hanne
 */
public class Linha implements Forma {
    private double x1, y1, x2, y2;
    
@Override
    public void desenhar() {
     System.out.println("Linha desenhar");
    }
@Override
public void aumentar(int t) {
 System.out.println("Linha aumentar");
}
}
