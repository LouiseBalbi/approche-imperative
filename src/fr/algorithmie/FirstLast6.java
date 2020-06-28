package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {

		int[] array = {1, 2, 3, 4, 5, 6};
	
	//On calcule une valeur bool�enne qui contr�le le tableau de la sorte :
	//elle vaut true si le tableau a au moins 1 �l�ment et si le premier �l�ment ou le
	//dernier �l�ment vaut 6.
	//elle vaut false dans les autres cas
		
		boolean controle = false;
		if ((array.length >= 1) && (array[0] == 6 || array[array.length - 1] == 6)) {
			controle = true;
		}
		System.out.println(controle);
	}

	}

