package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		// Exercice : Boucles combin�es avec des tests
		
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		 
		 //Afficher l�ensemble des �l�ments du tableau gr�ce � une boucle
		 for (int i = 0; i <= array.length - 1; i++) {
			 System.out.println(array[i]);
		 }
		 
		 System.out.println("-------------------");
		 
		 //Afficher l�ensemble des �l�ments dans l�ordre inverse du tableau	 
		 for (int i = array.length - 1; i >= 0; i--) {
			 System.out.println(array[i]);
		 }
		 
		 System.out.println("-------------------");
		 
		 //Combiner une boucle et un test de mani�re � n�afficher que les entiers sup�rieurs � 3
		 for (int i = 0; i <= array.length - 1; i++) {
			 if (array[i] > 3) {
			 System.out.println(array[i]);	 
			 }		 
		 }
		 
		 System.out.println("-------------------");
		 
		 //Combiner une boucle et un test de mani�re � n�afficher que les entiers pairs
		 for (int i = 0; i <= array.length - 1; i++) {
			 if (array[i] %2 == 0) {
			 System.out.println(array[i]);	 
			 }		 
		 }
		 
		 System.out.println("-------------------");
		 
		 //Combiner une boucle et un test de mani�re � n�afficher que valeurs des index pairs
		 for (int i = 0; i <= array.length - 1; i++) {
			 if (i %2 == 0) {
			 System.out.println(array[i]);	 
			 }		 
		 }
		 
		 System.out.println("-------------------");
		 
		 //Combiner une boucle et un test de mani�re � n�afficher que les entiers impairs
		 for (int i = 0; i <= array.length - 1; i++) {
			 if (array[i] %2 == 1 || array[i] %2 == - 1) {
			 System.out.println(array[i]);	 
			 }		 
		 }
		 
	}

}
