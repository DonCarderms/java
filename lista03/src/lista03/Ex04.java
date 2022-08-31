/*(04) Escreva um algoritmo para ler 10 valores inteiros e positivos e:  

	a) encontrar o maior valor;

	b) encontrar o menor valor;

	c) calcular a média dos números lidos.
***/

package lista03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero = 0;
		int contador = 0;
		int maior = 0, menor = 0, somaNumero = 0, media = 0;
		
		do {
			System.out.println("informe um numero:");
			numero = leitor.nextInt();
			contador++;
			somaNumero += numero;
			
			if(numero > maior)
				maior = numero;
			else if(numero < menor)
				menor = numero;
	
			if(contador == 10) 
				break;		
		} while (numero > 0 && numero != -1);
		
		if(contador == 10) {
			media = somaNumero / 10;			
			System.out.println("\nO maior numero é: " + maior + "\nO menor numero é: "
							   + menor + "\nE a média dos numeros é: " + media);		
		}
	
	}
}
