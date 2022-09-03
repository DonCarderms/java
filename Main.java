import java.util.Scanner; 

class Main {   

  public static void main(String args[]) {  

    Scanner leitor = new Scanner(System.in); 
  

    System.out.print("informe sua idade expressa em  dias:_ "); 

    int idadeEmDias = leitor.nextInt();  

    leitor.close(); 

  

    int anos = idadeEmDias / 365 ;  

    int meses = (idadeEmDias % 365) / 30 ; 

    int dias = (idadeEmDias % 365) % 30; 

    System.out.println(" voçê tem " + anos + " anos " + meses + " meses " + dias + " dias. ");  

  }  

}