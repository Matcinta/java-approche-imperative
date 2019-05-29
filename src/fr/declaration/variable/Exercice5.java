package fr.declaration.variable;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre:");
		int valeur = scanner.nextInt();
		
		System.out.println("Les dix nombres suivants "+valeur +"sont: ");
		
		for (int i=0; i<=10; i++) {
				int j = i+valeur;
				System.out.println(j);
		}
		
	}

}
