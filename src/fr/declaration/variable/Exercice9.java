package fr.declaration.variable;

import java.util.Scanner;

public class Exercice9{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int [] tab = new int [10];
		
		System.out.println("Veuillez saisir 10 nombres en les séparant par des espaces \n(si vous en saisissez plus, ceux-ci ne seront pas pris en compte):");
		
		for (int i = 0; i < 10; i++) {
			tab [i] = scanner.nextInt();
		}
		
		int maximum = tab [0];
		for(int i = 1; i < tab.length; i++) {
			if (tab[i] > maximum) {
				maximum = tab[i];
			}
		}
		
		System.out.println("Le plus grand élément choisi est le: " + maximum);
		
			
	}

}
