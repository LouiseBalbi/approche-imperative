package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// initialisation du nombre de bâtons de départ
		int batons = 15;

		// valeur boolean qui permettra de sortir de la boucle quand le jeu sera fini
		boolean fin = false;

		while (fin == false) {
			// on demande affiche le nombre de bâtons et on demande à l'utilisateur d'en
			// prendre entre 1 et 3
			System.out.println("Il y a : " + batons + " bâtons, prenez en 1,2 ou 3");
			int nbBatonsJoueur = scan.nextInt();

			if (nbBatonsJoueur > 0 && nbBatonsJoueur < 4) {
				// Si le joueur a pris entre 1 et 3 bâtons on test s'il reste ensuite des bâtons
				if (batons - nbBatonsJoueur <= 0) {

					// le joueur a pris le dernier bâtons :
					System.out.println("vous avez perdu");
					fin = true;
				} else {

					// le joueur n'a pas pris le dernier bâtons
					batons = batons - nbBatonsJoueur;
				}

				// Si la partie n'est pas fini, alors c'est au tour du programme
				if (fin == false) {

					// le programme choisit toujours un nombre de bâtons égal à 4-nbBatonsJoueur
					int tmp = 4 - nbBatonsJoueur;

					// On teste si l'ordinateur a saisi le dernier bâton 
					if (batons - tmp <= 0) {

						// si l'ordinateur a perdu :
						System.out.println("l'ordinateur à perdu");
						fin = true;
					} else {
						// Si l'ordinateur n'a pas perdu, la partie continue
						batons = batons - tmp;
						System.out.println("l'ordinateur a pris " + tmp + " batons");
					}
				}
			} else {
				// Si la saisie du joueur est incorrecte :
				System.out.println("Saisie incorrecte");
			}

			// Affichage de fin de programme
			System.out.println("Fin de programme");

			
		}
		// Fermeture du scanner
			scan.close();
	}

}
