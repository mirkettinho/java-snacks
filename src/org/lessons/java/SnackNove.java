package org.lessons.java;

import java.util.Scanner;

public class SnackNove {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		do {
			System.out.print("inserisci un numero: ");
			
			int number = sc.nextInt();
			
			sum += number;
			System.out.println("il totale é: " + sum);
			
			if(sum>1000) {
				System.out.println("Sistema in tilt");
			}
			
		}while(sum<=1000);
		
		sc.close();
	}
}
