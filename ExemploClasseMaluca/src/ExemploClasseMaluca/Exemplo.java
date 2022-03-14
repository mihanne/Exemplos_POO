package ExemploClasseMaluca;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClasseMaluca objA, objB;//criando 2 objetos do tipo ClasseMaluca
       int x=10;
       
        //atribuição dos objetos com o seu conteúdo
        objA = new ClasseMaluca(10,20);
        objB = new ClasseMaluca(50,100);
        
        
        ClasseMaluca  objC = new ClasseMaluca();
        objC.setDado1(80);
        objC.setDado2(90);
        
        System.out.println(objA.getDado1() + " " + objA.getDado2()); //o símbolo + é utilizado para concatenar
        System.out.println(objB.getDado1() + " " + objB.getDado2());
        System.out.println(objA.soma(10, 20));
        
       objA = new ClasseMaluca(30,60);
        System.out.println(objA.getDado1() + " " + objA.getDado2());
        
        objB = objA;
        System.out.println(objB.getDado1() + " " + objB.getDado2());
        
       System.out.println(objC.getDado1() + " " + objC.getDado2());

	}

}
