import java.util.Scanner;

public class ArrayMedia {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("informe a quantidade de alunos:");
		int qtdAlunos = leitor.nextInt();
		int qtdNotas = 0;
		
		float notas = 0;
		float soma = 0;
	
		float media = 0;
		float somaMediaTurma = 0;
		float mediaFinalTurma = 0;

		System.out.print("informe a quantidade de notas: ");
		qtdNotas = leitor.nextInt();

		int turma[] = new int[qtdAlunos];
		
		for (int i = 0; i < turma.length; i++) {
			
			soma = 0;
			for (int j = 0; j < qtdNotas; j++) {
				System.out.print("\ninforme a " + (j + 1) + " nota do aluno " + (i + 1) + ": ");
				notas = leitor.nextFloat();
				soma += notas;
			}
			media = soma / qtdNotas;
			System.out.print("\nA media do aluno " + (i + 1) + " é " + media + "\n") ;
			
			somaMediaTurma += media;
		}
		
		mediaFinalTurma = somaMediaTurma / turma.length;
		System.out.println("\n A média geral da turma é : " + mediaFinalTurma);

	}
}
