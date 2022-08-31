import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("nforme um numero: ");
		int numero = s.nextInt();
//		int numeroPrimo = 0;
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0)			
				System.out.println("\n" + i);
		}
							
	}
}
