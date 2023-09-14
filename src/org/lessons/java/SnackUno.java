package org.lessons.java;

import java.util.Scanner;

public class SnackUno {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci un numero: ");
		int num = sc.nextInt();
		
		sc.close();
		
		if(num % 2 == 0) {
			System.out.println(num);
		}else {
			System.out.println(num +1);
		}
	}
}
