package funcionario;

public class Numeros {
	public static int soma(int ...v) {
		if(v.length > 0) {
			int s = 0;
			for(int i = 0; i < v.length; i++) 
				s += v[i];
			return s;
		}
		else return 0;
		}
		public static int multiplica(int ...v) {
			if(v.length > 0) {
			int m = 1;
			for(int i = 0; i < v.length; i++)
				m *= v[i];
			return m;
		}
		else return 0;
		}
		}