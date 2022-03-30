package figurageometrica;

public abstract class FiguraTridimensional extends Figura {
	protected float volume;
	public 	abstract void calcularVolume();
	public float getVolume() {
		return volume;
	}
}
