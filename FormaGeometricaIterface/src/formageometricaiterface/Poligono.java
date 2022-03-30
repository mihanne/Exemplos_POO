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
abstract class Poligono implements Forma {
    private int lados;
   
    public Poligono(int lados) {
    this.lados = lados;
    }
    
    public int getLados() { return lados; }
    
    public abstract void pintar(int cor);
    
    public void desenhar() {
    };
    public void aumentar(int t) {
    	
    };
}

