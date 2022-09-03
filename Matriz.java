
import java.util.Scanner;

 class Matriz {
	public static void main(String[] args) {
        int numero;
        int quantidade;

       Scanner leitor = new Scanner(System.in);



       System.out.println("Informe o tamanho da matriz ");
        quantidade = leitor.nextInt();



       int matriz[][] = new int[quantidade][quantidade];



       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Informe o número da " + (i + 1) + "ª linha " + " da " + (j + 1) + "ª coluna: ");
                numero = leitor.nextInt();
                matriz[i][j] = numero;
            }
        }
        System.out.println("A soma da diagonal principal é " + somarElementosDiagonalPrincipal(matriz));
    }
    public static int somarElementosDiagonalPrincipal(int matriz[][]) {
        int soma = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(i == j)
                    soma += matriz[i][j];
            }
        }
        return soma;
    }

}
