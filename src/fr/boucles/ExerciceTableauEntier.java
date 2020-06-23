package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// Exercice : Parcours d'un tableau d'Entiers
		// Déclarez un tableau d’entiers contenant tous les entiers de 1 à 10
		int [] entiers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// Affichez le premier élément du tableau
		System.out.println(entiers[0]);
		
		System.out.println("-------------------");
		
		// Affichez la longueur du tableau en utilisant la propriété length
		System.out.println(entiers.length);
		
		System.out.println("-------------------");
		
		// Affichez le dernier élément du tableau en utilisant la propriété length
		System.out.println(entiers[entiers.length-1]);
		
		System.out.println("-------------------");
		
		// Modifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8.
		entiers[4] = 8;
		System.out.println(entiers[4]);

	}

}
