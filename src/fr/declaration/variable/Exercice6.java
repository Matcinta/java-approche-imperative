package fr.declaration.variable;

import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre entier compris entre 1 et 10:");
		int valeur = scanner.nextInt();
		
		if (valeur<=10 && valeur>=1) {
			System.out.println("Vous avez saisi le nombre "+valeur);
		}
		
		else {
			System.out.println("Le nombre " + valeur + " n'est pas compris entre 1 et 10");
		}
		
	}

}
