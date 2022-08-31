//(04) Escreva um algoritmo para ler a hora de início de um jogo e a hora do final do jogo 
//(considerando apenas horas inteiras) e calcular a duração do jogo em horas, sabendo-se que o 
//tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

import java.util.Scanner;
public class IniciofinalDoJogo {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("informe a hora inicio do jogo");
		int horaDoComeco = leitor.nextInt();
		System.out.println("informe a hora final do jogo");
		int horaDoFim = leitor.nextInt();
		
		int horasInteiras = 12;
		
		int duracao = 24 - 12;
		
		
		
	}
}
