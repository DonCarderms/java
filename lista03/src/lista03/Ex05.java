package lista03;

public class Ex05 {
	public static void main(String[] args) {
		float chicoMetro = 1.50F;
		float chicoCentimetroPorAno = 0.02F;
		float zeMetro = 1.10F;
		float zeCentimetroPorAno = 0.03F;
		int ano = 0;
		
		while( zeMetro < chicoMetro) {
			ano++;
			 zeMetro += zeCentimetroPorAno;
			 chicoMetro += chicoCentimetroPorAno;		 
		}
		
		System.out.print("Serão necessários " + ano + " anos para que o zé seja maior que Chico.");
	}
}
