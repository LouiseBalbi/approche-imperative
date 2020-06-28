package fr.algorithmie;

	import java.util.Scanner; // import de la classe Scanner
	
public class InteractifTableMult {

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
		
		// affichage de la talbe de multiplication correspondant à nb
		System.out.println("Table de : " + nb);
		for (int i = 0; i <= 10; i++) {
			System.out.println(nb + " * " + i + " = " + (nb*i));				
		}

	}

}
