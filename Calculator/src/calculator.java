import java.util.Scanner;

public class calculator {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("informe o primeiro numero: ");
	 int numero1 = sc.nextInt();
	 System.out.print("informe o segundo numero: ");
	 int numero2 = sc.nextInt();
	 
	 System.out.println("escolha uma opcão:\n" + "1- adicionar\n" + "2- subtrair\n" + 
			 			"3- multiplicar\n" + "4- dividir");
	 int opcao = sc.nextInt();
	 	 
	 switch (opcao) {
	case 1: System.out.println(adicionar(numero1, numero2));
		break;
	case 2: System.out.println(subtrair(numero1, numero2));
		break;
	case 3: System.out.println(multiplicar(numero1, numero2));
		break;
	case 4: System.out.println(dividir(numero1, numero2));
		break;
	default:
		System.out.println("opção inválida ):.");
	}
	 
}
 
 public static int adicionar(int a, int b) {
	int resultado = a + b;
	return resultado;
}
 
 public static int subtrair(int a, int b) {
		int resultado = a - b;
		return resultado;
	}
 
 public static int multiplicar(int a, int b) {
		int resultado = a * b;
		return resultado;
	}
 
 public static int dividir(int a, int b) {
		int resultado = a / b;
		return resultado;
	}
 
 
 
}
