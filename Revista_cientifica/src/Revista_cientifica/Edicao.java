package Revista_cientifica;
import java.util.ArrayList;

public class Edicao {
	    private int numero;
	    private int volume;
	    private String dataEdicao;
	    private int tiragem;
	    private ArrayList<Artigo> artigos;
	    

	    public Edicao(int numero, int volume, String dataEdicao, int tiragem) {
	        super();
	        this.numero = numero;
	        this.volume = volume;
	        this.dataEdicao = dataEdicao;
	        this.tiragem = tiragem;
	        artigos = new ArrayList<>();
	    }
	    
	    
	    public int getNumero() {
			return numero;
		}


		public void setNumero(int numero) {
			this.numero = numero;
		}


		public int getVolume() {
			return volume;
		}


		public void setVolume(int volume) {
			this.volume = volume;
		}


		public String getDataEdicao() {
			return dataEdicao;
		}


		public void setDataEdicao(String dataEdicao) {
			this.dataEdicao = dataEdicao;
		}


		public int getTiragem() {
			return tiragem;
		}


		public void setTiragem(int tiragem) {
			this.tiragem = tiragem;
		}


		public void imprime() {
	    	System.out.println(this.numero+ " " + this.volume + " "+ this.dataEdicao);
	    }

	    public void adicionaArtigo(Artigo artigo) {
	        // adicionar o artigo no arraylist
	    	artigos.add(artigo);
	      
	    }
}
