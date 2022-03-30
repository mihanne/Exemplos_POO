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
public class Retangulo extends Poligono {
 
	public Retangulo() { //construtor
	super(4);
	}


	public void desenhar() {
		System.out.println("Retangulo.desenhar");
		//setLados(3);
		lados=3; //mudar diretamente o conteúdo da variável
	}
	
	public void aumentar(int t) {
		System.out.println("Retangulo.aumentar");
	}
	
	public void pintar(int cor) {
		System.out.println("Retangulo.pintar");
	}   

}
