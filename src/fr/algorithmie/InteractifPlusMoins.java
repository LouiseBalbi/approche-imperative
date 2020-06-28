package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {

		// initialisation de scanner
		Scanner scanner = new Scanner(System.in);
		
		// choix aléatoire d'un nombre entre 0 et 100
		int nb = new Random().nextInt(100) + 1;
		boolean trouve = false;
		int nbCoups = 0;

		while (trouve == false) {
		System.out.println("Entrez un nombre : ");
		int nbSaisi = scanner.nextInt();
		// le nombre de coups est augmenté de 1 à chaque fois que l'utilisateur entre un nombre
		nbCoups += 1;
			if (nb == nbSaisi) {
				// si le nombre saisi correspond au nombre choisi par le jeu, la boucle est finie
				trouve = true;				
				System.out.println("Bravo, vous avez trouvé en " + nbCoups + " Coups");
			} else { 
				if (nbSaisi > nb) {
					System.out.println("Trop grand !");}
				else {
					if (nbSaisi < nb) {
					System.out.println("Trop petit !");
						}
					}
			}									
			
		}	
		scanner.close();
	}

}
