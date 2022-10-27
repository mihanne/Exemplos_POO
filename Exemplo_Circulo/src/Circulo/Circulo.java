package Circulo;

public class Circulo {
	private float raio;
    private Ponto centro; //cria uma variável do tipo Ponto
    
    public Circulo(float x,    float y, float r){
       raio = r;
       centro = new Ponto(x,y);
    }
    
    public void alterarCentro(float x, float y){
       centro.alterarX(x);
       centro.alterarY(y);
    }
    
    public void alterarRaio(float r){
        raio = r;
    }
    
    public float obterCentroX(){
      return centro.obterX();
    }
    
    public float obterCentroY(){
        return centro.obterY();
      }
      
      public float obterRaio(){
        return raio;
      }

}
