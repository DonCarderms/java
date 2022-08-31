import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in); 
	int numero = 0;
	int  vector [] = new int [20];
	
	for(int i = 0; i < vector.length; i++) {
		System.out.println("informe o " + (i + 1) + " numero:_ ");
		vector[i] = leitor.nextInt();
	}
	
	int x = 20;
	
	System.out.print("[");
	for(int i = 0 ; i < vector.length; i++ ) {
		x --;
		System.out.print(vector[x] + ", ");
	}
	System.out.print("]");	
		
}
}
