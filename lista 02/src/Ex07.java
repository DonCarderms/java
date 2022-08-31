/*(07) Escreva um algoritmo para ler a idade de um nadador e classificá-lo em uma das seguintes categorias:

	Infantil A = 5-7 anos

        Infantil B = 8-10 anos

        Juvenil A = 11-13 anos

        Juvenil B = 14-17 anos

        Adulto = maiores de 18 */

import java.util.Scanner;

public class Ex07 {	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("informe a  idade do nadador");
		int idade = leitor.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.println("infantil A");
		}else if(idade >= 8 && idade <= 10) {
			System.out.println("infantil B");
		}else if(idade >= 11 && idade <= 13) {
			System.out.println("Juvenil A");
		}else if(idade >= 14 && idade <= 17) {
			System.out.println("Juvenil B");
		}else if(idade >= 18 ) {
			System.out.println("Adulto ");
		}
			
	}
}
