package fr.algorithmie;

import java.util.Scanner; // import de la classe Scanner

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
			// initialisation de scanner
			Scanner scanner = new Scanner(System.in) ;
						
			int nb = 0;

			// demande à l'utilisateur d'entrer un nombre
			System.out.println("Entrez un nombre \n");
			nb = scanner.nextInt() ; 
			
			System.out.println("Les 10 nombres suivants sont : \n");
			for (int i= 1; i <= 10; i++) {
				System.out.println(nb + i);
			}		
			scanner.close();
	}
}
