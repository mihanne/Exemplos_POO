package figurageometrica;

public class Figuras {

	public static void main(String[] args) {
		//Figura f = new Figura();
		//FiguraTridimensional t = new FiguraTridimensional();
		//FiguraBidimensional b = new FiguraBidimensional();
		//ERRO: os três comandos anterioroes resultam em erro, pois não é
		//possível instanciar objetos de classes abstratas
		Cubo c = new Cubo();
		Quadrado q = new Quadrado();
		c.setLado(10);
		System.out.println(c.getVolume());
		//c.desenhar(); ERRO: a classe Cubo não implementou o método desenhar()
		q.setLado(3);
		System.out.println(q.getArea());
		q.desenhar();

	}

}
