import java.util.Scanner;

public class MostrarMaiorDeTresNumeros {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("informe o primeiro numero");
		int num1 = leitor.nextInt();
		System.out.println("informe o segundo numero");
		int num2 = leitor.nextInt();
		System.out.println("informe o terceiro numero");
		int num3 = leitor.nextInt();
		leitor.close();
		if(num1 > num2 && num1 > num3) {
			System.out.println(" o primeiro numero é o maior");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println(" o segundo numero é o maior");
		}else if(num3 > num1 && num3 > num2) {
			System.out.println(" o terceiro numero é o maior");
		}				
	}
}
