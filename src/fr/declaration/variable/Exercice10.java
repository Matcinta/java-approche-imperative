package fr.declaration.variable;

import java.util.Scanner;

public class Exercice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//L'objet Scanner
				Scanner scanner = new Scanner(System.in);
				
				//Initialisation des variables
				int reponse = 0;
				int indexTab = 0;
				int [] tab = new int [41];

				while (reponse != 3) {
					do {
						System.out.println("Choisissez une action ci-dessous: ");
						System.out.println("1. Ajouter un nombre");
						System.out.println("2. Afficher les nombres existants");
						reponse = scanner.nextInt();
						
						if (reponse < 1 || reponse >2) {
							System.out.println("Ce nombre n'est pas reconnu, veuillez recommencer");
						}
					} while (reponse < 1 || reponse >2);
				
					switch (reponse){
						case 1 :
							if (indexTab >= tab.length) {
								int[] newTab = new int[tab.length + 4];
								for(int i = 0; i < tab.length; i++) {
									newTab[i] = tab[i];
								}
								tab = newTab;
							}
							System.out.println("entrez un nombre a ajouter au tableau :");
							tab[indexTab] = scanner.nextInt();
							indexTab ++;
							break;
						case 2 :
							System.out.println("contenu du tableau :");
							for(int i = 0; i < indexTab; i++) {
								System.out.print(tab[i] + " ");
							}
							System.out.println("");
							break;
						default :
							break;
					}
				}
			}
		}