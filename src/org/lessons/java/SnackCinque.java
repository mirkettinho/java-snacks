package org.lessons.java;

import java.util.Scanner;

public class SnackCinque {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		///Infinite loop
		while(true) {
			
			///I ask the user to enter a string
			System.out.print("Inserisci una stringa ");
			String word = sc.nextLine();
			
			
			///If the user type 0 I end the loop
			if(word.equals("0")) {
				System.out.println("Fine");
				break;
			}
			
			int alphabeticCharacters = 0;
			
			int numbers = 0;
			
			int specialSymbols = 0;
			
			
			for(int i = 0; i < word.length(); i++) {
				
				char characters = word.charAt(i);
				
				if(Character.isLetter(characters)) {
					alphabeticCharacters++;  ///increase alphabeticCharacters
				}else if(Character.isDigit(characters)) {
					numbers++;  ///increase numbers
				}else {
					specialSymbols++;  ///increase specialSymbols
				}
			}
			
			System.out.println("I caratteri alfabatici sono: " + alphabeticCharacters);
			
			System.out.println("I numeri sono: " + numbers);
			
			System.out.println("I caratteri speciali sono: " + specialSymbols);
		}
		
		sc.close();
		
	}
}
