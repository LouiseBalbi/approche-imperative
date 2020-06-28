package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {

		// initialisation de scanner
		Scanner scanner = new Scanner(System.in);
		
		// demander à l'utilisateur de choisir un rang
		System.out.println("Choisissez un rang : ");
		int rang = scanner.nextInt();
		
		// création d'un tableau
		int tab[] = new int[rang + 1];
		// initialisation des index 0 et 1 du tableau
				

		if (rang >= 0) {
			tab[0] = 0;
			
			if (tab.length > 1) {
				tab[1] = 1;
				for (int i = 2; i <= rang; i++) {
				tab[i] = tab[i - 2] + tab[i - 1];
			}
			System.out.println(tab[rang]);
		
			}
		}
		else {
			System.out.println("Calcul impossible, un rang positif ou nul.");
		}
					
		scanner.close();
	}

}
