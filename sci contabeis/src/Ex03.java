import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	System.out.println("informe um valoir em reais:_");
	float valorEmReias = leitor.nextFloat();
	
	float us = 1.0f;
	float reias = 2.40f;
	
	float valorEmDolar = (valorEmReias * us) / reias;
	System.out.println(valorEmDolar);
	
}
}
