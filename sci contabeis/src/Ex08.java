import java.util.Scanner;

public class Ex08 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	int numero = 0;
	
	do {
		System.out.println("informe um numero:_");
		numero = leitor.nextInt();		
	} while (numero != 0);
}
}
