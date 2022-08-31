
public class gabarito {
	
	public static void main(String[] args) {
		System.out.println(isComposto(7));
		System.out.println(isPrimo(7));
		System.out.println(esimoPrimo(9));
		System.out.println(ProximoNumeroPrimo(5));
		System.out.println(isPrimoGemeo(5, 7));
	}

	
	public static boolean isComposto(int numero) {
		for (int i = 2; i < numero; i++) {
		if (numero % i == 0)
		return true;
		}
		return false;
		}
	
	public static boolean isPrimo(int numero) {
		for (int i = 2; i < numero; i++) {
		if (numero % i == 0)
		return false;
		}
		return true;
		}
	
	public static int esimoPrimo(int n) {
		int numeroAtual = 2;

		int quantidadeNumeroPrimo = 0;

		while (quantidadeNumeroPrimo != n) {

		if (isPrimo(numeroAtual)) {
		quantidadeNumeroPrimo++;
		}
		numeroAtual++;
		}

		return numeroAtual - 1;
		}
	
	public static int ProximoNumeroPrimo(int numero) {

		do {

		numero++;

		} while (!isPrimo(numero));
		return numero;

		}
	
	public static boolean isPrimoGemeo(int numero1, int numero2) {
		if (isPrimo(numero1) && isPrimo(numero2)) {
		if (numero1 + 2 == numero2 && numero2 - 2 == numero1) {
		return true;
		}
		}
		return false;

		}
}
