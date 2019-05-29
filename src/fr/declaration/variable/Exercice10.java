package fr.declaration.variable;

import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//L'objet Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Initialisation des variables
		char reponse = ' ';
		int nombre = ' ';
		int tableauNombres [] = new int [10];

		System.out.println("MENU");
		System.out.println("1. Ajouter un nombre");
		System.out.println("2. Afficher les nombres existants");
		reponse = sc.nextLine().charAt(0);

		if (tableauNombres){//si le tableau n'est pas plein l'utilisateur peut faire les choix 1 et 2 du menu:
			if (reponse == '1'){
				System.out.println("Veuillez saisir un nombre:");
				nombre = sc.nextLine();

			}
			else if (reponse == '2'){
				for(int i = 0; i<tableauNombres.length; i++) {
				System.out.print(tableauNombres[i]+" ");
				}
			}
		}
		else if { // Si le tableau est plein, agrandir le tableau:

		}
	}

}
