import java.lang.String;
import java.util.Scanner;
public class Exo_6 {


	public static void main(String[] args) {

// Q1.
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Entrer une valeur pour x");
	int x = sc.nextInt();
	sc.nextLine();
	String j = String.valueOf(x);
	System.out.println("la valeur de notre variable en chaine:"+j);
	System.out.println();
	

// Q2.	
	
	System.out.println("Saisir une chaine");
	sc.nextLine();
	String maChaine = sc.nextLine();
	System.out.print("ma chaine = " +maChaine);
	int chaineEnEntier = Integer.parseInt(maChaine);
	System.out.println(chaineEnEntier);
	
// Q3.
	
	System.out.println("Saisir un entier");
	sc.nextLine();
	String valeur = sc.nextLine();
	System.out.println("la chaine :"+valeur);
	float monFloat = Float.parseFloat(valeur);
	System.out.println("notre valeur"+monFloat);
	
// Q4.
	
	System.out.println("Entrer le nom de la variable");
	sc.nextLine();
	String ville = sc.nextLine();
	System.out.println("Le nom de votre ville est: "+ville);
	System.out.println("Résultat: "+ville.toUpperCase());
	System.out.println("première lettre en MAJ: "+ville.substring(0, 1).toUpperCase() + ville.substring(1)); 
	
// Q5.
	
	System.out.println("lire les deux chaines de caractères s1 et s2");
	//sc.nextLine();
	String s1 = sc.nextLine();
	System.out.println("la prmière chaine: "+s1);
	//sc.nextLine();
	String s2 = sc.nextLine();
	System.out.println("la deuxiéme chaine: "+s2);
	char let1 = s1.charAt(0);
	System.out.println("le premier indice de s1: "+let1);
	char carac = s2.charAt(0);
	System.out.println("le premier indice de s2: "+carac);
	
	if(let1 == carac)
	{
		System.out.println("ces deux chaines commencent-elles par le meme caractére");
	}
	else
	{
		System.out.println("ces deux chaines sont différentes");
	}
	
// Q6. 
	
	System.out.println("lire les deux chaines de caractères c1 et c2");
	//sc.nextLine();
	String c1 = sc.nextLine();
	System.out.println("la prmière chaine: "+c1);
	//sc.nextLine();
	String c2 = sc.nextLine();
	System.out.println("la deuxiéme chaine: "+c2);
	if (c1.equals(c2))
	{
		System.out.println("oui");
	}
	else
	{
		System.out.println("non");
	}
	
	System.out.println("l'ordre lexicographique des deux chaines: "+c1.compareTo(c2));
	
	
	System.out.println("l'ordre lexicographique des deux chaines en ignorons les maj et min: "+c1.compareToIgnoreCase(c2));
	
// Q7.
	
	
	}


}
