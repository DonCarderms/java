package lista03;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("informe um valor :");
		int n = leitor.nextInt();
		
		int tabuada = 0;
		System.out.print("a tabuada de " + n + " é:\r");
		for (int i = 1; i <= n; i++) {
			tabuada = n * i;
			System.out.println(i + " X " + n + " = " + tabuada);
		}
	}
}
