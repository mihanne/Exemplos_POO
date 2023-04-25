import java.util.Scanner;

public class AlunoV2Matriz {
    public static void main(String[] args) {
        final int LINHAS = 2, COLUNAS= 3;
        Aluno[][] alunos = new Aluno[LINHAS][COLUNAS];

        Scanner in = new Scanner (System.in);
        for (int i=0; i<LINHAS; i++)
            for(int j=0; j< COLUNAS; j++){
                alunos[i][j] = new Aluno();
                System.out.println("Digite nome:");
                alunos[i][j].setNome(in.nextLine());
                System.out.println("Digite Nota:");
                alunos[i][j].setNota(in.nextFloat());
                in.nextLine();
            }
        for(int i=0; i<LINHAS; i++){
            int maior_col = 0;
            for (int j=1; j<COLUNAS; j++){
                if (alunos[i][j].getNota()> alunos[i][maior_col].getNota())
                    maior_col=j;
            }
            System.out.printf("Maior nota linha %d: %s %.1f%n",i, alunos[i][maior_col].getNome(),alunos[i][maior_col].getNota());
        }


    }
}
