package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
	//Soit le tableau suivant : 
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
	//Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] > 3) {
				System.out.println(array[i]);
			}
		}
		
		System.out.println("-------------------");
	
	//Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		for (int j = 0; j <= array.length - 1; j++) {
			if (array[j] %2 == 0) {
				System.out.println(array[j]);
			}
		}
		
		System.out.println("-------------------");

	//Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant
	//aux index pairs
		for (int k = 0; k <= array.length - 1; k++) {
			if (k %2 == 0) {
				System.out.println(array[k]);
			}
		}
		
		System.out.println("-------------------");
		
	//Combiner une boucle et un test de manière à n’afficher que les entiers impairs
		for (int m = 0; m <= array.length - 1; m++) {
			if (array[m] %2 == 1 || array[m] %2 == -1) {
				System.out.println(array[m]);
			}
		}
		
		System.out.println("-------------------");

	}

}
