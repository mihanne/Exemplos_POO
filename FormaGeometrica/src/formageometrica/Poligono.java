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
abstract class Poligono extends Forma{
    protected int lados;
    
    public Poligono(int lados) {
        this.lados = lados;
}
   
    
    public int getLados() {
		return lados;
	}


	public void setLados(int lados) {
		this.lados = lados;
	}


	public abstract void pintar(int cor);
    
    public void desenhar() {
    	//metodo de desenho para polígono
    }
}
