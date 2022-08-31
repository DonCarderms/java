
//(01) Escreva um algoritmo para ler 2 valores A e B e escrever seus valores seguidos da mensagem
// "são múltiplos" ou "não são múltiplos".

import java.util.Scanner;

public class MultiplosNãoMultiplos {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("informe o primeiro numero: ");
		int a = leitor.nextInt();
		System.out.println("informe o segundo numero: ");
		int b = leitor.nextInt();
		leitor.close();
		int m = a % b;
		int y = b % a;
		
		if(m == 0 || y == 0) {
			System.out.println("Esses numeros são múltiplos");
		}else {
			System.out.println("Esses numeros não são múltiplos");
		}				
	}
}
