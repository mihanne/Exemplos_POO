package figurageometrica;

public class Quadrado extends FiguraBidimensional{
	private float lado;
	public void calcularArea(){
		area = lado * lado;
	}
	public float getLado(){
		return lado;
	}
	public void mover(){
		// Corpo de método mover
	}
	public void desenhar(){
		// Corpo de método desenhar
	}
	public void setLado(float lado){
		if (lado > 0){
			this.lado = lado;
			calcularArea();
		}
	}
}
