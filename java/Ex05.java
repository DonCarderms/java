import java.util.Scanner;
public class exe5 {
    public static void main(String[] args) {
     //Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo números inteiros. Ao final do algoritmo, um vetor C deve ser criado contendo a interseção de A e B.
    // foi necessário fazer com tanto for pois tenho que usar apenas os comandos que foram ensinados até então.
     int [] A = new int[3];
     int [] B = new int[3];
     int contador = 0;
     Scanner input = new Scanner(System.in);
     for(int i = 0;i<A.length;i++){ 
     System.out.println("Insira o "+(i+1)+"° número do vetor A" );
     A[i] = input.nextInt();
         }
         for(int i = 0;i<B.length;i++){ 
             System.out.println("Insira o "+(i+1)+"° número do vetor B" );
             B[i] = input.nextInt();
                 }
   for(int i = 0; i <A.length;i++){
   for(int j = 0; j <B.length;j++){
    if(A[i] == B[j]){
        contador++;
    }
   }
   }
   int [] C = new int[contador];
   contador = 0;
   for(int i = 0; i <A.length;i++){
    for(int j = 0; j <B.length;j++){
     if(A[i] == B[j]){
        C[contador] = A[i];
        contador++;
     }
     }
    }
 for(int l = 0;l<C.length;l++){
    System.out.print("Este número faz parte da intersseção: "+C[l]+"   ");
 }
   input.close();             }
    }