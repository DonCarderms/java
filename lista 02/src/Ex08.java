/*(08) Escreva um algoritmo para ler o código de um aluno e suas três notas. Calcule a média ponderada do aluno,
considerando que o peso para a maior nota seja 4 e para as duas restantes, 3. Mostre o código do aluno, suas três notas,
a média calculada e uma mensagem "APROVADO" se a média for maior ou igual a 7 e "REPROVADO" se a média for menor que 7.*/

import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("informe o código do aluno: ");
		int codigoAluno = leitor.nextInt();
		System.out.print("informe a primeira nota:_ ");
		float nota1 = leitor.nextFloat();
		System.out.print("informe a segunda nota:_ ");
		float nota2 = leitor.nextFloat();
		System.out.print("informe a terceira nota_ ");
		float nota3 = leitor.nextFloat();
		System.out.print("informe a sua frequencia:_ ");
		leitor.close();
		float mediaPonderada = (nota1 + nota2 + nota3) / 4 + 3 + 3;
		
		

		
;	}
}
