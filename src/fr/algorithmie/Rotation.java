package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6};
		
		// Effectuer une rotation � droite des �l�ments :
		
		// stockage de la derni�re donn�e du tableau array
		int inter = array[array.length - 1];
		
		// d�calage des valeurs du tableau vers la droite
		for (int i = array.length - 2; i >= 0; i-- ) {
			array[i + 1] = array[i];
		}
		
		// affectation de la premi�re valeur du tableau avec la valeur int
		array[0] = inter;
		
		for (int i = 0; i <= array.length - 1; i++) {
			 System.out.println(array[i]);
		}
	}

}
