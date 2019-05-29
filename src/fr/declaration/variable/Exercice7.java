package fr.declaration.variable;

import java.util.Scanner;

public class Exercice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre:");
		int valeur = scanner.nextInt();
		
		int sum = 0;
		for (int i=1; i<=valeur; i++) {
			sum = sum + i;
			
			
		}
		System.out.println(sum);
	}

}
