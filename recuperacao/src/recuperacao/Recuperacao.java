package recuperacao;
import java.lang.Math;
public class Recuperacao {
public static void main(String[] args) {
	
	System.out.println(crivoEratotenes(150));

}
public static int[] crivoEratotenes(int limite) {
	int[] vetor = new int [limite + 1];
	int y =0 ,contador =0;
	byte raiz = (byte) Math.sqrt(limite);//raiz quadrada do limite

	for(int i =2; i < vetor.length; i++) {//Crie uma lista de todos os números inteiros de 2 até o valor limite
		vetor[i] = i;		
	}
			
   //remove os multiplos de 2 até o último número a ser checado 
	for (int i = 0; i < vetor.length; i++) {
		for (int j = 2; j <= raiz; j++) {
			if (i != 0 && i != 1 && i != j && i % j == 0) {
				vetor[i] = 0;
				}
			}
		}
	
    for (int i = 0; i < vetor.length; i++) {
    	if (vetor[i] != 0 ) {
    		contador++;
    	}
    }
		
 int[] primos = new int  [contador];
 
 for(int i = 0; i < vetor.length; i++) {
	 if(vetor[i] != 0) {	
		 primos[y] = vetor[i];
		 y++;
		
	 }
 }
 
	System.out.println();
	imprimirVetor(primos);
	
return primos;	
}

public static int [] imprimirVetor(int [] vetor) {
	System.out.print("[");
	for(int i = 0; i < vetor.length; i++) {
		if(i+1 < vetor.length)
		   System.out.print(vetor[i] + ", ");
		else
			System.out.print(vetor[i]);
	}
	System.out.print("]");
	return vetor;
}



}
