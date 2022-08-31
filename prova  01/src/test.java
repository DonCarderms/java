
public class test {
	public static void main(String[] args) {
		
		System.out.println(composto(9));
		System.out.println(isPrimo(9));
		System.out.println(proximoPrimo(5));
		System.out.println(primosGemeos(5, 7));
		
	}
	
	public static Boolean composto(int numero) {
		
		int contador = 0;
		for(int i = 2; i < numero; i++) {
			
			if(numero % i == 0) 
				return true;					
		}
				
		return false;	
	}
	
	public static boolean isPrimo(int numero) {
		
		for (int i = 2; i < numero; i++) {
			
			if(numero % i == 0 && numero != 1) 
				return false;		
		}
		return true;	
	}
	
	public static int  proximoPrimo(int numero) {
		
		do {
			numero++;
		} while (!isPrimo(numero));
		return numero;
				
	}
	
	public static int esimoPrimo(int numero) {
		int numeroAtual = 2;
		int quantidadeNumeroPrimo = 0;
		
		while (quantidadeNumeroPrimo != numero) {
			if(isPrimo(numeroAtual)) {
				quantidadeNumeroPrimo++;
			}
			numeroAtual++;
		}	
		return numeroAtual -1;
	}
	
	public static Boolean primosGemeos(int numero1, int numero2) {
		if(isPrimo(numero1) && isPrimo(numero2)) {
			if(numero1 - numero2 == 2 || numero2 - numero1 == 2) {
				return true;
			}
		}
		return false;
			
	}
			
	
}
