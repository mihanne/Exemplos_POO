package figurageometrica;

public class Cubo extends FiguraTridimensional {
	private float lado;
	public void calcularVolume(){
		volume = lado*lado*lado;
	}
	public float getLado(){
		return lado;
	}
	public void setLado(float lado){
		if (lado > 0){
		this.lado = lado;
		calcularVolume();
	}
	}
	public void mover() {}
	public void desenhar() {}

}