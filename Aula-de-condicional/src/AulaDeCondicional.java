import java.util.Scanner;

public class AulaDeCondicional {
   public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	System.out.print("informe a primeira nota:_ ");
	float nota1 = leitor.nextFloat();
	System.out.print("informe a segunda nota:_ ");
	float nota2 = leitor.nextFloat();
	System.out.print("informe a terceira nota_ ");
	float nota3 = leitor.nextFloat();
	System.out.print("informe a sua frequencia:_ ");
	int frequencia = leitor.nextInt();
	leitor.close();
	float media = (nota1 + nota2 + nota3) / 3;
	
	
	if(media <= 10 ) {		
		System.out.println("\nA sua média é : " + media + "\n" + "A sua frequencia é: " + frequencia);	
		 if(media == 10 && frequencia == 100) {
			System.out.println("\nvoçê foi Aprovado  com louvor !!!!");
		}
	    else if(media >= 7 && frequencia >= 75) {
				System.out.print("\nVoçê foi aprovado (:");		
			}
	    else if (media >= 5 && media <= 6  ) {
			System.out.print("\nVoçê está em recuperação .(");
		}
		else if(media < 7 && frequencia >= 75) {
			System.out.println("\nvoçê foi reprovado por média");
		}
		else if(media >= 7 && frequencia < 75) {
			System.out.println("\nvoçê foi reprovado por frequencia");
		}
		else if(media < 7 && frequencia < 75) {
				System.out.print("\nVoçê foi reprovado por média e frequencia (:");		
			}		
	}else{
		System.out.println("\n As notas estão invalidos");
	}
						
}
}
