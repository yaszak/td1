import java.util.Scanner;

public class Exo_4 {

	public static void main(String[] args) {

		// Entrer les valeurs

		Scanner entree = new Scanner(System.in);

		int x = 0;
		int total = 0;
		int j = 0;
		double moyenne = 0;

		// Calcul de la moyenne.
		do {
			System.out.println("donner un nombre");
			x = entree.nextInt();
			if (x >= 0) 
			{
				total += x;
				j++;
			}
		} while (x >= 0);

		moyenne = (double) total / j;
		// Affichage de la moyenne.
		System.out.println("La moyenne est égale à: ");
		System.out.println(moyenne);

		entree.close();

	}
}
