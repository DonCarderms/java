package função;

import java.util.Scanner;

public class SubRotina {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("informe o primeiro valor: ");
		int valor1 = s.nextInt();
		System.out.print("informe o segundo valor: ");
		int valor2 = s.nextInt();
		
		int resultado = somar(valor1, valor2);
		int resultado2 = multipicar(valor1, valor2);
		int c = fatorial(resultado2);
		System.out.println(resultado + " " + resultado2 + " " + c);
	}
	
	public static int somar(int valor01, int valor02) {
		int reslutado = valor01 + valor02;
		
		return reslutado;
	}
	
	public static int multipicar(int valor01, int valor02) {
		int resultado = valor01 * valor02;
		
		return resultado;	
	}
	
	public static int fatorial(int valor) {
//		calcular fatorial 
		int fatorial = valor;		
		for(int i = valor - 1; i > 1; i--)
			fatorial *= i;
		
		return fatorial;
		
	}
		
}
