import java.util.Scanner;
class Main {  
 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr1 [] = {1, 2, 3,};
    int arr2 [] = {4, 5, 6};

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

   
    //imprime os elementos do matriz
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
	}
}