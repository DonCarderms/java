import java.util.Scanner;
class Main {  
 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr1 [] = {1, 2, 3,};
    int arr2 [] = {4, 5, 6};

    int arr3 [] = new int [arr1.length + arr2.length];
      System.out.print(arr3.length + "\n\n");
   
    int x = 0;
    System.out.print("{");
    for(int i = 0; i < arr3.length; i++){
      if(i < arr1.length){
        arr3[i] = arr1[i]; 
      }else{      
        arr3[i] = arr2[x];
        x++;
      }          
         System.out.print(arr3[i]);
           if(i < 5)
            System.out.print(", ");
    }
   System.out.print("}");
 
  
    
	}
}


