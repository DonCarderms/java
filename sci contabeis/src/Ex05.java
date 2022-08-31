import java.util.Scanner;

public class Ex05 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	System.out.print("informe um numero:_");
	int numero = leitor.nextInt();
	
	System.out.println("A tabuada de " + numero + " é:");
	
	for(int i = 1; i <= 10; i++) {
		System.out.println( numero + " X " + i + " = " + numero * i);
	}
}
}
