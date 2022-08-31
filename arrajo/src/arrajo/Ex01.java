package arrajo;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	int a [] = new int [10];
	Scanner sc = new Scanner(System.in);
	for(int i = 0; i<a.length; i++) {//
		System.out.println("a[" + i + "]? " );
		a[i] = sc.nextInt();
	}
	
	System.out.println(Arrays.toString(a));
	
}
}
