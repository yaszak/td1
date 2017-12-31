import java.util.Scanner;

public class Exo_2 {

	public static void main(String[] args) {
		
	// Création d'un tableau de valeur aléatoire 
		
		Scanner entree = new Scanner(System.in);
		System.out.print("Entrer la taille du tableau: ");
		int taille = entree.nextInt();
		System.out.println();
	
				float [] Tab1 = new float [taille];
				for(int pos=0; pos<Tab1.length; pos++)
				{
					Tab1[pos]=(float) Math.random();
					System.out.println(Tab1[pos]);
				}
				
		entree.close();
		System.out.println();
	
	// calcul de la moyenne et de l'écart-type
			
			float somme=0;
			for(int pos=0; pos<Tab1.length; pos++)
			{
				 somme+=Tab1[pos];	 
			}
			
			float moyenne=0;
			moyenne=somme/taille;
			System.out.println("la moyenne des valeurs de notre tableau: "+moyenne);
			System.out.println();
		
			float variance=0;
			float ecart_type=0;
			float mean=0;
			for(int pos=0; pos<Tab1.length; pos++)
			{
				mean+= (Tab1[pos]-moyenne)*(Tab1[pos]-moyenne);
				variance=mean/Tab1.length;
				ecart_type= sqrt(variance);
	
			}
			System.out.println("La variance est égale :"+variance);
			System.out.println();
			System.out.println("l'écart type est égal à:"+ecart_type);
	}

	private static float sqrt(float variance) {
		
		return 0;
	}

}
