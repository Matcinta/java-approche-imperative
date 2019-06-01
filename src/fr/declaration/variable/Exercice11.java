package fr.declaration.variable;

import java.util.Scanner;

public class Exercice11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("entrez un nombre");
		int nb = scanner.nextInt() ;
		int n1 = 0;
		int n2 = 1;
		int resultat = 0;
		for(int i = 0; i < nb; i++) {
			resultat = n1+n2;
			n1 = n2;
			n2 = resultat;
		}
		System.out.println(resultat);
		scanner.close();

	}

}