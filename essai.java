package yas;
import java.lang.*;
import java.util.Scanner;


public class essai {

	public static void main(String[] args) {

		/*double x= 0.0;
		x=Math.random();
		System.out.print("la valeur de x: "+x);
		double m=2;
		double z=Math.pow(m, 2);
		System.out.print("la valeur de x: "+z);
		int y= (int) z;
		System.out.print("la valeur de x: "+y);*/
		
		String[]tab = {"man", "toto", "tata"};
		String[][]tab1 = {{"man", "toto", "tata"},{"DFEF","fdsqfe","sqdfd"}};
		parcourirTableau(tab1);
		int[]chaine= {1, 2, 3};
		parcourir(tab);
		parcourir(chaine);
		System.out.println(toString(tab));
		//parcourir(chaine);
		Scanner sc = new Scanner (System.in);
		int x= 0;
		x=sc.nextInt();
		String tab3= "";
		tab3=sc.nextLine();
		int e=0XFE;
		System.out.print(e);
	}
	
	 public static void parcourir(String [] chaine)
	{
		for (String str : chaine)
			System.out.println(str);
	}
	 
	 public static void parcourir(int [] ca)
		{
			for (int str : ca)
				System.out.println(str);
		}
	 static void parcourirTableau(String[][] tab)
	 {
	   for(String tab2[] : tab)
	   {
	     for(String str : tab2)
	       System.out.println(str);
	   }
	 }

	 static String toString(String[] tab)
	  {
	    System.out.println("Méthode toString() !\n----------");
	    String retour = "";
	                   
	    for(String str : tab)
	      retour += str + "\n"; 
	                   
	    return retour;
	  }
}
