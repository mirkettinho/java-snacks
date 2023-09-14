package org.lessons.java;


public class SnackTre {
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,11,12,13,14,15};
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i ++) {
			
			if (i % 2 != 0 ) {
				sum += numbers[i];
			}
		}
		
		System.out.println("La somma dei numeri con posizione dispari é: " + sum);
	}
}
