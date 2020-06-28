package fr.algorithmie;

import java.util.Scanner; // import de la classe Scanner

public class InteractifStockageNombre {

	public static void main(String[] args) {

		// initialisation de scanner
		Scanner scanner = new Scanner(System.in);
		// initialisation du tableau
		int tab[] = new int[0];
		boolean fin = false;

		while (fin == false) {
			// menu affiché à l'utilisteur :
			System.out.println("Options : ");
			System.out.println("1 : ajouter un nombre à un tableau");
			System.out.println("2 : afficher le contenu du tableau");
			System.out.println("3 : quitter le programme");

			// l'utilisateur choisi une option parmi les 3
			System.out.println("Entrez une option : ");
			int option = scanner.nextInt();

			switch (option) {
			case 1:
				// l'utilisateur entre un nombre à ajouter au tableau
				System.out.println("Entrez un nombre à ajouter au tableau : ");
				int nb = scanner.nextInt();

				// création d'un tableau temporaire pour ajouter une case au tableau précédent
				int temp[] = new int[tab.length + 1];

				for (int i = 0; i < tab.length - 1 && tab.length > 0; i++) {
					temp[i] = tab[i];
				}
				temp[temp.length - 1] = nb;
				tab = temp;
				break;
			case 2:
				// le programme affiche le contenu du tableau
				for (int i = 0; i <= tab.length - 1; i++) {
					System.out.println(tab[i] + " ");					
				}
				System.out.println();
				break;
			case 3:
				// pour sortir de la boucle
				fin = true;
				break;
			default:
				// pas d'action dans les autres cas
				break;
			}
		}

		scanner.close();

	}

}
