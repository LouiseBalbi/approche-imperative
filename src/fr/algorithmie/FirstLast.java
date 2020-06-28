package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6};

	// On calcule une valeur booléenne qui contrôle le tableau de la sorte :
	// elle vaut true si le tableau est de longueur supérieure ou égale à 1 et que le
	// premier et le dernier élément du tableau ont la même valeur
	// elle vaut false dans les autres cas
		
		boolean controle = false;
		if ((array.length >= 1) && (array[0] == array[array.length - 1])) {
			controle = true;
		}
		System.out.println(controle);
	}

}
