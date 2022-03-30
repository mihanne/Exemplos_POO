package figurageometrica;

public abstract class FiguraBidimensional extends Figura {
	protected float area;
	public abstract void calcularArea();
	public float getArea() {
	return area;
	}
}
