package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
	//Ecrire le code permettant de compter le nombre d��l�ments en commun dans ces 2
	// tableaux
		int commun = 0;
		for (int i = 0; i <= array1.length - 1; i++) {
			for (int j = 0; j <= array2.length - 1; j++) {
				if(array1[i] == array2[j]) {
					commun += 1;
				}
			}
		}
		System.out.println("Le nombre d'�l�ments communs dans ces 2 tableaux est de : " + commun);
		
	}

}
