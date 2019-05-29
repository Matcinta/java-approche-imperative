package fr.declaration.variable;

import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre compris entre 1 et 10:");
		int valeur = scanner.nextInt();
		
		if (valeur>10){
			System.out.println("Ce nombre est trop grand, veuillez recommencer");
			System.out.println("Veuillez saisir un nombre compris entre 1 et 10:");
		} 
		else if (valeur<1){
			System.out.println("Ce nombre est trop petit, veuillez recommencer");
			System.out.println("Veuillez saisir un nombre compris entre 1 et 10:");
		} 
		else {
			System.out.println(valeur);
			System.out.println("Au revoir!"); //On sort du programme
		}	
	}

}
