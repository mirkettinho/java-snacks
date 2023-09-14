package org.lessons.java;

import java.util.Scanner;

public class SnackQuattro {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		///I ask the user to enter a word
		System.out.print("Inserisci una parola: ");
		String word = sc.nextLine().toLowerCase().trim();
		
		sc.close();
		
		///I create an array of characters of the same length as the word entered by the user
		char[] wordArray = new char[word.length()];
		///I take the single character
		for (int i = 0; i < word.length(); i++ ) {
			wordArray[i] = word.charAt(i);
		}
		
		///reverse the word
		String wordRevers = "";
		for (int i = wordArray.length -1; i > -1; i--) {
			wordRevers += wordArray[i];
		}
		
		if(word.equals(wordRevers)) {
			System.out.println("é palindroma");
		}else {
			System.out.println("Non é palindroma");
		}
	}
}
