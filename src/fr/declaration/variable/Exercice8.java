package fr.declaration.variable;

import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int nb;
		do {
			System.out.println("entrez un nombre entre 1 et 10");
			nb = scanner.nextInt() ;
			if(nb > 10) {
				System.out.println("Ce nombre est trop grand, veuillez recommencer");
			} else if (nb < 1) {
				System.out.println("Ce nombre est trop petit, veuillez recommencer");
			}
		} while(nb < 1 || nb > 10);
		System.out.println(nb);
		scanner.close();
	}

}