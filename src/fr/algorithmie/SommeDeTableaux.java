package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] secondArray = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
		
	//Créer un tableau qui contient la somme des 2 précédents tableaux
		int[] arraySomme = new int[array.length];
		for (int i = 0; i <= array.length - 1; i++) {
				arraySomme [i] = array[i] + secondArray[i];
		}
		for (int j = 0; j <= array.length - 1; j++) {
			System.out.println(arraySomme[j]);
		}
	}

}
