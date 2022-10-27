package Circulo;

public class Ponto {
private float x, y;
    
    public Ponto(float x, float y){
      this.x = x;
      this.y = y;
    }
    
    public void alterarX(float x){
       this.x = x;
    }

    public void alterarY(float y){
       this.y = y;
    }
    
    public float obterX(){
      return x;
    }
    
    public float obterY(){
      return y;
    }
}
