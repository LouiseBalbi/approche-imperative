package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// Exercice : Boucles de base
		//Affichez tous les nombres de 1 � 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
			
		System.out.println("-------------------");	
		
		//Affichez 20 fois votre nom et votre pr�nom
		for (int i = 0; i < 20; i++) {
			System.out.println("Louise");
		}
		
		System.out.println("-------------------");
		
		// Affichez les �l�ments pairs de 2 � 100
		for (int i = 0; i <= 100; i += 2) {
			System.out.println(i);
		}
		
		System.out.println("-------------------");
		
		// Affichez les �l�ments impairs de 1 � 99
		for (int i = 1; i <= 99; i += 2) {
			System.out.println(i); 
		}

	}

}
