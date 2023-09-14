package org.lessons.java;

import java.util.Scanner;

public class SnackSette {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci il numero di secondi: ");
		int userSeconds = sc.nextInt();
		
		sc.close();
		
		
		int hours = userSeconds / 3600;
		int minutes = (userSeconds % 3600) / 60;
		int seconds = userSeconds % 60;
		
		System.out.println(userSeconds + " secondi convertiti diventano -> " + String.format("%02d:%02d:%02d", hours, minutes, seconds) + " -> " + hours + " ore " + minutes + " minuti " + seconds + " secondi");
		
	}
}
