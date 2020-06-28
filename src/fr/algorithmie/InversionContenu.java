package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
	// Exercice InversionContenu
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
	//Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais
	//dans l’ordre inverse.
		int[] arrayCopy = new int[array.length];
		int m = array.length -1;
		for (int i = 0; i <= array.length - 1 ; i++) {
			arrayCopy[i] = array[m];
			m -=1;			
			System.out.println(arrayCopy[i]);
		}
		
		System.out.println("-------------------");
		
	//Afficher l’ensemble des éléments des 2 tableaux
		for (int j = 0; j <= array.length - 1; j++) {
			System.out.println(array[j]);
		}
		System.out.println("-------------------");
		
		for (int k = 0; k <= arrayCopy.length - 1; k++) {
			System.out.println(arrayCopy[k]);
		}
	}

}
