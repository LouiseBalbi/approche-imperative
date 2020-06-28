package fr.algorithmie;

import java.util.Scanner; // import de la classe Scanner

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// initialisation de scanner
		Scanner scanner = new Scanner(System.in);

		int nb = 0;

		// demande à l'utilisateur d'entrer un nombre
		System.out.println("Entrez un nombre \n");
		nb = scanner.nextInt();

		// initialisation de la variable somme pour le calcul suivant
		int somme = 0;
		// calcul de la somme
		for (int i = 1; i <= nb; i++) {
			somme += i;
		}
		// Affichage du résultat
		System.out.println("La somme des entiers compris entre le 1 et le nombre saisi est : \n");
		System.out.println(somme);
		scanner.close();
	}
}
