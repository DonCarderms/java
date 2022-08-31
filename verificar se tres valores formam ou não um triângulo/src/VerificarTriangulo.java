//(05) Escreva um algoritmo para ler três valores A, B, C e verificar se eles formam ou não um 
//triângulo (se a > b + c não formam triângulo algum).

import java.util.Scanner;
public class VerificarTriangulo {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("informe o primeiro numero");
		int a = leitor.nextInt();
		System.out.println("informe o segundo numero");
		int b = leitor.nextInt();
		System.out.println("informe o terceiro numero");
		int c = leitor.nextInt();
		
		leitor.close();
		
		if(a > b + c) {
			System.out.println("A, B e C não formam triângulo algum");
		}else {
			System.out.println("A, B e C  formaram um triângulo ");
		}
	}
}
