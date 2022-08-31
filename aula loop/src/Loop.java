import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
			System.out.print("informe um numero: ");
			int num = leitor.nextInt();
			
			int somaDivisores = 0;
						
			for(int i = 0; i < num; i++) {
				
				if(num % i == 0) 
					somaDivisores += i;	
				
			}
			
			if(somaDivisores == num)
				System.out.print(num + " é um numero perfeito. ");
			else 
				System.out.print(num + " não é um numero perfeito. ");
		}		
}

