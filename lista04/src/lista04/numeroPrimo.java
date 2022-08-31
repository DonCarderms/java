package lista04;

public class numeroPrimo {
public static void main(String[] args) {
	
	int numero = 5;
	boolean isPrimo = true;
	
	for(int i = 2; i < numero ; i++){
		if(numero % i == 0) {
			isPrimo = false;
			break;
		}else {
			System.out.println("é primo");
			break;
		}
	}
	
}
}
