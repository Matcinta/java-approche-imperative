package fr.declaration.variable;

import java.util.Scanner;

public class Exercice9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int [] tab = new int[10];
		for(int i = 0; i < 10; i ++) {
			tab[i] = scanner.nextInt();
		}
		int max = tab[0];
		for(int i = 1; i < tab.length; i++) {
			if(tab[i] > max) {
				max = tab[i];
			}
		}
		System.out.println("max : " + max);
		scanner.close();

	}

}