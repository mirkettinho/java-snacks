package org.lessons.java;

import java.util.Random;

public class SnackDue {
	public static void main(String[] args) {
		
		String[] names = {"Mirko", "Paolo", "Franco", "Emanuele", "Antonio"};
		
		String[] surnames = {"Rossi", "Pallino", "Bolle", "Barone", "Rina"};
		
		String[] invited = new String[8];
		
		for (int i=0; i < invited.length; i++) {
			
			Random rnd = new Random();
			
			int nameI = rnd.nextInt(names.length - 1);
			int surnameI = rnd.nextInt(surnames.length -1);
			
			invited[i] = names[nameI] + " " + surnames[surnameI];
			
			System.out.println(invited[i]);
		}
	}
}
