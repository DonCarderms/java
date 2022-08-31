import java.util.Scanner;

public class Ex07 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	int turma = 20;
	float nota = 0 , somaNota = 0, mediaAluno = 0, somaMeidaAluno = 0, mediaTurma = 0;
	int contador = 0;
	
	for(int i = 0; i < turma; i++) {		
		somaNota = 0;
		for(int j = 0; j < 4; j++) {
//			System.out.println("informe a nota " + (j + 1) + " do " + (i + 1) + " aluno:_");
			nota = leitor.nextFloat();
			somaNota += nota;
		}
		mediaAluno = somaNota / 4;
		if(mediaAluno > mediaTurma)
			contador++;
			
//		System.out.println(somaNota + " " + mediaAluno);
		somaMeidaAluno += mediaAluno;
		
	}
	mediaTurma = somaMeidaAluno / 20;
	System.out.print("A média da turma é " + mediaTurma + " e" + contador + 
			" obtiveram nota acima da média da turma");
}
}
