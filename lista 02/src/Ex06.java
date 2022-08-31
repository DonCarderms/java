/*(06) Escreva um algoritmo para ler as medidas dos lados de um triângulo e escrever se ele é Equilátero,
Isósceles ou Escaleno. Sendo que:

	−Triângulo Equilátero: possui os 3 lados iguais;
	
	−Triângulo Isósceles: possui 2 lados iguais;
	
	−Triângulo Escaleno: possui 3 lados diferentes.*/
 

import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("informe o primeiro lado do triangulo");
		int a = leitor.nextInt();
		System.out.println("informe o segundo lado do triangulo");
		int b = leitor.nextInt();
		System.out.println("informe o terceiro lado do triangulo");
		int c = leitor.nextInt();
		
		if(a == b && a == c &&  b == c ) {
			System.out.println(" Triângulo Equilátero ");
		}else if(a == b || b == c || a == c){
			System.out.println("Triângulo Isósceles");
		}else if(a != b && b != c && a != c){
			System.out.println("Triângulo Escaleno");
		}
		
	}
	
}

