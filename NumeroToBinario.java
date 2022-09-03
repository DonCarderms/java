import java.util.Scanner;

class NumeroToBinario {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int numero = 0;

            do {
              System.out.print("informe um numero ou digite 0 para sair: ");
              numero = sc.nextInt();
              System.out.println(converteNumeroEmBinario(numero));
            }while(numero != 0);

            System.out.println("sessão encerrada...");		
	}
      
    public static String converteNumeroEmBinario(int numero) {//função que converta numero em binários
    	String binary = "";
    	while(numero > 0) {
    		if(numero % 2 == 0) 
    			binary = "0" + binary;
    		else
    			binary = "1" + binary;
    		numero = numero /2;
    	}
    	
    	return binary;
    		
    }
}
