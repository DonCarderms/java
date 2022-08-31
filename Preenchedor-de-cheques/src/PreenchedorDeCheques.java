import java.util.Arrays;
import java.util.Scanner;
public class PreenchedorDeCheques {
	public static void main(String[] args) {
		
		Scanner leitor = new  Scanner(System.in); 
		System.out.println("informe um Valor em R$:"); 
		int valor =  leitor.nextInt();
		System.out.println(valorPorExtenso(valor));
		int arr1 [] = {1,2,3};
		int arr2 [] = {4,5,6};
		
		int arr3 [][] = juntaVetores(arr1, arr2);
		
		System.out.println(imprimeMatriz(arr3));
		
		
/*		String unidade [] = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
				"onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove", "vinte"};
		
		String dezenas [] = {"", "", "vinte", "trinta", "quarenta", "cincoenta", "sessenta", "setenta", "oitenta", "noventa" , "cem" };

		String um = "um" , dois = "dois", tres = "tres", quatro = "quatro", cinco = "cinco", seis = "seis",  

				sete = "sete" , oito = "oito", nove = "nove", dez = "dez", onze = "onze", doze = "doze", 

				treze = "treze" , quatorze = "quatorze", quinze = "quinze", dezesseis = "dezesseis", dezessete = "dezessete", dezoito = "dezoito", 

				dezenove = "dezenove" , vinte = "vinte", trinta = "trinta", quarenta = "quarenta", cincoenta = "cincoenta", sessenta = "sessenta", 

				setenta = "setenta" , oitenta = "oitenta", noventa = "noventa", cem = "cem", cento = "cinco"; 

//		int unidade = (int) (valor % 10); 
//
//		int dezena = (int) (valor % 100); 
//
//		int centena = (int) (valor / 100);
		
		switch (valor) {
		 case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19:
			 System.out.println(unidade[valor]);
		 		break;
		 case 20,30,40,50,60,70,80,90,100:
			  valor /= 10;
			 System.out.println(dezenas[valor]);
		 				 
		}
 
	 
/*
		switch (valor) { 

			case 0: System.out.println("zero");				 

				break; 

			case 1: System.out.println(um); 

				break; 

			case 2: System.out.println(dois); 

			    break; 

			case 3: System.out.println(tres); 

				break; 

			case 4: System.out.println(quatro); 

				break; 

			case 5: System.out.println(cinco); 

				break; 

				 

			case 6: System.out.println(seis); 

				break; 

			 

			case 7: System.out.println(sete); 

				break; 

			 

			case 8: System.out.println(oito); 

				break; 

			 

			case 9: System.out.println(nove); 

				break; 

			 

			case 10: System.out.println(dez); 

				break; 

			 

			case 11: System.out.println(onze);				 

				break; 

			case 12: System.out.println(doze); 

			    break; 

			case 13: System.out.println(treze); 

				break; 

			case 14: System.out.println(quatorze); 

				break; 

			case 15: System.out.println(quinze); 

				break; 

				 

			case 16: System.out.println(dezesseis); 

				break; 

			 

			case 17: System.out.println(dezessete); 

				break; 

			 

			case 18: System.out.println(dezoito); 

				break; 

			 

			case 19: System.out.println(dezenove); 

				break; 

			 

			case 20: System.out.println(vinte); 

				break; 

				 

			case 21: System.out.print(vinte + " e " ); 
					switch (valor) {
					
					case 21: System.out.print(um);
						break;
						
					}
					

				break; 

			case 22: System.out.println(vinte + " e " + dois); 

			    break; 

			case 23: System.out.println(vinte + " e " + tres); 

				break; 

			case 24: System.out.println(vinte + " e " + quatro); 

				break; 

			case 25: System.out.println(vinte + " e " + cinco); 

				break; 

				 

			case 26: System.out.println(vinte + " e " + seis); 

				break; 

			 

			case 27: System.out.println(vinte + " e " + sete); 

				break; 

			 

			case 28: System.out.println(vinte + " e " + oito); 

				break; 

			 

			case 29: System.out.println(vinte + " e " + nove); 

				break; 

		 

			case 30: System.out.println(trinta); 

				break; 

			 

			case 31: System.out.println(trinta + " e " + um); 

				break; 

			case 32: System.out.println(trinta + " e " + dois); 

			    break; 

			case 33: System.out.println(trinta + " e " + tres); 

				break; 

			case 34: System.out.println(trinta + " e " + quatro); 

				break; 

			case 35: System.out.println(trinta + " e " + cinco); 

				break; 

				 

			case 36: System.out.println(trinta + " e " + seis); 

				break; 

			 

			case 37: System.out.println(trinta + " e " + sete); 

				break; 

			 

			case 38: System.out.println(trinta + " e " + oito); 

				break; 

			 

			case 39: System.out.println(trinta + " e " + nove); 

				break; 

				 

				default:System.out.println("numero não disponivel"); 
		 

		} 	
		
*/
		
	}
	
	public static String valorPorExtenso(int valor) {
		String extenso = "";
		String unidade [] = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
				"onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
		
		String dezenas [] = {"", "", "vinte", "trinta", "quarenta", "cincoenta", "sessenta", "setenta", "oitenta", "noventa" , "cem" };
		
		
		};
		
		switch (valor) {
		 case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19:
			 extenso = unidade[valor];
		 		break;
		 case 20,30,40,50,60,70,80,90,100:
			  valor /= 10;
			 extenso = dezenas[valor];
		 				 
		}
		 return extenso;
	 }
	
	public static int [][] juntaVetores(int arr1[], int arr2[]){
		
		int arr3 [][] = new int [2][3];



		  //junta os dois vetores num matriz
		    for(int i = 0; i < arr3.length; i++){
		      if(i < 1){
		        for(int j = 0; j < 3; j++){
		        arr3 [i][j] = arr1[j];
		        }
		      }else{
		        for(int k = 0; k < 3; k++){
		        arr3 [i][k] = arr2[k];
		        }
		      }  
		    }

		    return arr3;
		  
		
	}
	
	
	public static int [][] imprimeMatriz(int arr3[][]) {
		 System.out.print("{ ");
		   for(int i = 0; i < arr3.length; i++){
		    
		          System.out.print("{");
		          
		         for(int j = 0; j < 3; j++){
		           System.out.print(arr3[i][j]);
		           if(j < 2)
		            System.out.print(", ");
		         }
		          if(i < 1)
		            System.out.print("}, ");
		          else
		            System.out.print("}");
		      }
		   System.out.print(" }");
		   
		   return arr3;
	}
	
	
}
