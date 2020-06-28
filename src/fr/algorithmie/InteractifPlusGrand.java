package fr.algorithmie;

import java.util.Scanner; // import de la classe Scanner

public class InteractifPlusGrand {

	public static void main(String[] args) {

		// initialisation de scanner
		Scanner scanner = new Scanner(System.in);

		int nb = 0;
		int max = 0;

		// demande à l'utilisateur d'entrer 10 nombres	
		for (int i = 1; i <=10; i++) {		
		System.out.println("Entrez un nombre : ");
		nb = scanner.nextInt();
			if (nb > max) {
				max = nb; 
			}
		}	
		
		// Affichage du résultat
		System.out.println("Le plus grand des nombres saisis est : " + max);
		scanner.close();

	}

}
