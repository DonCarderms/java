//(06) Escreva um algoritmo para ler um número inteiro e
//positivo e calcular o seu fatorial.

package lista03;

import java.util.Scanner;

public class Ex06 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	int numero = 0;
	
	do {
		System.out.println("informe um número inteiro e positivo:");
		numero = leitor.nextInt();
	} while (numero <= 0 );
	
	System.out.println(numero);
}
}
