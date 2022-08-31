//(03) Escreva um algoritmo para ler um número inteiro e mostre uma 
//mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("informe um numero: ");
		int num = leitor.nextInt();
		leitor.close();
		int parImpar = num % 2 ;
		
		if(num < 0 ) {
			System.out.print("Esse numero é negativo e ");
		}else {
			System.out.print("Esse numero é positvo e ");
		}
		if(parImpar == 0) {
			System.out.print(" é par");
		}else {
			System.out.println(" é impar");
		}				
	}
}
