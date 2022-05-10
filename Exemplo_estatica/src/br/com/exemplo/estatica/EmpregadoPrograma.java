package br.com.exemplo.estatica;

public class EmpregadoPrograma {

	public static void main(String[] args) {
		Empregado gerente, supervisor;
		Empregado assistente;
		gerente = new Empregado("Maria", 3000);
		supervisor = new Empregado("Astolfo", 2500);
		assistente = new Empregado("Anastacio", 2000);

		gerente.imprimeDados ();
		supervisor.imprimeDados ();
		assistente.imprimeDados ();

		//acesso a variavel e constante estatica
		System.out.printf("%d %.2f\n", Empregado.proximoEmpregadoId, Empregado.TAXA_AUMENTO_SALARIO );

		System.out.printf("Salário de Assistente atualizado %.2f\n", assistente.aumentaSalario());
		assistente.imprimeDados();

	}

}
