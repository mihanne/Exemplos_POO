package figurageometrica;

public class Figuras {

	public static void main(String[] args) {
		//Figura f = new Figura();
		//FiguraTridimensional t = new FiguraTridimensional();
		//FiguraBidimensional b = new FiguraBidimensional();
		//ERRO: os tr�s comandos anterioroes resultam em erro, pois n�o �
		//poss�vel instanciar objetos de classes abstratas
		Cubo c = new Cubo();
		Quadrado q = new Quadrado();
		c.setLado(10);
		System.out.println(c.getVolume());
		//c.desenhar(); ERRO: a classe Cubo n�o implementou o m�todo desenhar()
		q.setLado(3);
		System.out.println(q.getArea());
		q.desenhar();

	}

}
