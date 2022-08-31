import java.util.Scanner;

public class Subrotina {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	System.out.println("informe a base");
	int base = leitor.nextInt();
	System.out.println("informe a altura");
	int altura = leitor.nextInt();
	
	System.out.println(areaRectangulo(base, altura));
	
}

public static int areaRectangulo(int base, int altura) {
	
	int area = base * altura;
	
	return area;
	
}

public static float mediaAluno(float nota1, float nota2, float nota3) {
    float mediaFinal = (nota1 + nota2 + nota3) / 3;
    
    
    return mediaFinal;
}

}
