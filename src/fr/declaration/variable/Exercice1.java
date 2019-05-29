package fr.declaration.variable;

public class Exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		System.out.println("Elements du tableau dans l'ordre");
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		// Passage à la ligne
		System.out.println();
		
		//Question 2: Afficher l’ensemble des éléments dans l’ordre inverse du tableau
		System.out.println("Elements du tableau dans l'ordre inverse");
		for(int j = array.length -1; j>=0; j--) {
			System.out.print(array[j]+" ");
		}
		// Passage à la ligne
				System.out.println();
				
		// Question 3: Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
		System.out.println("Elements du tableau entiers supérieurs à 3");
		for(int i = 0; i<array.length; i++) {
			if (array[i]>3) {
			System.out.print(array[i]+" ");
			}
		
		}
		// Passage à la ligne
		System.out.println();
		
		// Question 4: Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		System.out.println("Elements du tableau entiers pairs");
		for(int i = 0; i<array.length; i++) {
			if (array[i]%2 == 0) {
			System.out.print(array[i]+" ");
			}
		
		}
		// Passage à la ligne
		System.out.println();
		
		// Question 5: Combiner une boucle et un test de manière à n’afficher que les valeurs des index pairs
		System.out.println("Valeurs des index du tableau pairs");
		for(int i = 0; i<array.length; i++) {
			if (i %2 == 0) {
			System.out.print(array[i]+" ");
			}
		
		}
		// Passage à la ligne
		System.out.println();
		
		// Question 6: Combiner une boucle et un test de manière à n’afficher que les entiers impairs
		System.out.println("Entiers du tableau impairs");
		for(int i = 0; i<array.length; i++) {
			if (array[i] %2 != 0) {
			System.out.print(array[i]+" ");
			}
				
		}
		// Passage à la ligne
		System.out.println();
		
		// Question 7: Rechercher le plus grand élément du tableau
		System.out.println("Plus grand élément du tableau");
		int maximum = array[0];
		for(int i = 1; i<array.length; i++) {
			if (array[i]>maximum) {
				maximum=array[i];
			}		
		}
		System.out.print(maximum+" ");
		
		// Passage à la ligne
		System.out.println();
		
		// Question 8: Rechercher le plus petit élément du tableau
		System.out.println("Plus petit élément du tableau");
		int minimum = array[0];
		for (int i = 1; i<array.length; i++) {
			if (array[i]<minimum) {
				minimum=array[i];
			}	
		}
		System.out.print(minimum+" ");
		
		// Passage à la ligne
		System.out.println();
	}

}
