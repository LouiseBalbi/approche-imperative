package fr.algorithmie;

		import java.util.Scanner; // import de la classe Scanner

public class InteractifTantQue {

	public static void main(String[] args) {
				
		// initialisation de scanner
		Scanner scanner = new Scanner(System.in) ;
		
		// initialisation de la variable qui permet de sortir de la boucle
		boolean stop = false;
		int nb = 0;
		
		do {
		// demande à l'utilisateur d'entrer un nombre
		System.out.println("Entrez un nombre compris entre 1 et 10 \n");
		nb = scanner.nextInt() ; 
		
			// si le nombre est compris entre 1 et 10, la boucle se termine
			if (nb >= 1 && nb <= 10) {
			stop = true;
			}
		}
		while (stop == false);
	
		// Le nombre final est affiché
		System.out.println(nb);	
		scanner.close();
		}		
	}


