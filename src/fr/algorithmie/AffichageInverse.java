package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
	//Exercice AffichageInverse
	//Soit le tableau suivant : 
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
	// Afficher l�ensemble des �l�ments du tableau gr�ce � une boucle
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("-------------------");

	// Afficher l�ensemble des �l�ments dans l�ordre inverse du tableau
		for (int i = array.length - 1; i >=0; i--) {
			System.out.println(array[i]);
		}
		
		System.out.println("-------------------");
		
	// Cr�er un tableau arrayCopy et copier tous les �l�ments de array dans arrayCopy
		int[] arrayCopy = new int[array.length];
		for (int j = 0; j <= arrayCopy.length - 1; j++) {
			arrayCopy[j] = array[j];
			System.out.println(arrayCopy[j]);
		}

	}

}
