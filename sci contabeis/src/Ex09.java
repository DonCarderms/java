import java.util.Scanner;

public class Ex09 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	int numero = 0;
	
	do {
		System.out.println("informe um numero entre 100 e 200:_");
		 numero = leitor.nextInt();
	} while (numero >= 100 && numero <= 200);		
	System.out.println("Valor fora do alcance");	
}		
}
