package fr.declaration.variable;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre entier compris entre 1 et 10:");
		int valeur = scanner.nextInt();
		
		System.out.println("Vous souhaitez obtenir la table de "+valeur);
		
		for (int i=0; i<=10; i++) {
				int j = i*valeur;
				System.out.println(i + "x" + valeur + "=" + j);
		}
		
	}

}
