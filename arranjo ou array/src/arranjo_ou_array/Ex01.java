package arranjo_ou_array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	int a [] = new int [10];
	Scanner sc = new Scanner(System.in);
	
	for(int i = 0; i<a.length; i++) {//lê valores para arrays
		System.out.println("a[" + i + "]? " );
		a[i] = sc.nextInt();//atribuir elemento ao array
	}
	
	System.out.println(Arrays.toString(a));	
	
	int soma = 0;//exibe arrays e soma SEUS ELEMENTOS
	for(int i = 0; i<a.length; i++) {
		System.out.println("a[" + i + "] = " + a[i]);
		soma += a[i];
	}
	System.out.println("soma = " + soma);
	
	sc.close();
}
}
