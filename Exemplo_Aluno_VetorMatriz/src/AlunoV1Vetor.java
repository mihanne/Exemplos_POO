import java.util.Scanner;
public class AlunoV1Vetor {
    public static void main(String[] args) {
        final int TOT_ALUNOS = 5;
        Aluno [] vet_alunos = new Aluno[TOT_ALUNOS];
        double med_notas = 0;

        Scanner in = new Scanner (System.in);
        for(int i=0; i< TOT_ALUNOS; i++)
            vet_alunos[i] = new Aluno();
        for(int i=0; i<TOT_ALUNOS; i++){
            System.out.println("Digite nome:");
            vet_alunos[i].setNome(in.nextLine());
            System.out.println("Digite nota:");
            vet_alunos[i].setNota(in.nextFloat());
            in.nextLine();
            med_notas += vet_alunos[i].getNota();
        }
        med_notas /= TOT_ALUNOS;
        System.out.println("Média:" + med_notas);
        in.close();
    }
}
