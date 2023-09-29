package questao3;

public class Main {
    public static void main(String[] args) {
    DistribuicaoAlimento da = new DistribuicaoAlimento("Mesa Brasil","SESC","Belo Horizonte","01/09/2023","30/09/2023","Feijão",10);
    TrabalhoVoluntario tv = new TrabalhoVoluntario("Mesa Brasil","SESC","BH","01/09/2023","30/09/2023","Entragador",6);

        System.out.println("\nDistribuição de alimento\n" + da.imprimeProjeto());
        System.out.println("\nTrabalho voluntario\n" + tv.imprimeProjeto());
    }
}
