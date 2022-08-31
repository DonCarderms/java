
//(02) Escreva um algoritmo para criar e popular um vetor com os 10 primeiros números primos.

package lista04;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
			
			int [] vector = new int [10];
			
			int numero = 2;
			int quantidade = 0;
			
			boolean isPrimo;
			
			while(quantidade != 10) {
				isPrimo = true;
				
				for(int i = 2; i < numero ; i++){
					if(numero % i == 0) {
						isPrimo = false;
						break;
					}
				}
				
				if(isPrimo) {
					vector[quantidade] = numero;
					quantidade++;
				}
				
				numero++;
			}
			
			System.out.println(Arrays.toString(vector));
							
	}
}
