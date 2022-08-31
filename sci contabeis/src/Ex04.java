import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("informe a distância total percorrida pelo automóvel:_");
	float distanciaTotal = leitor.nextFloat();
	System.out.println("informe o total de combustível gasto:_");
	float totalCombustivelGasto = leitor.nextFloat();
	
	float consumoMedio = distanciaTotal * totalCombustivelGasto;
	
	System.out.println(consumoMedio);
	
	
}
}
