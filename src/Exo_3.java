

public class Exo_3 {

	public static void main(String[] args) {
		
		int [] t1 = { 1, 2, 3, 4};
		//test
		int [] t2 = { 4, 6, 7, 8};
		int [] t3 = new int [t1.length+t2.length];
		
	// Affichage du tableau 1
		
		System.out.println("Le tableau 1:");
			for (int pos=0; pos<t1.length; pos++)
			{
				System.out.println(t1[pos]);
			}
		System.out.println();
		System.out.println("Le tableau 2:");
		
	// Affichage du tableau 2
		
			for (int pos=0; pos<t2.length; pos++)
			{
				System.out.println(t2[pos]);
			}
		System.out.println();
		System.out.println("Le tableau 3:");
		
	// Affichage du tableau 3
		
			for (int pos=0; pos<t1.length; pos++)
			{
				t3[pos]= t1[pos];
			}
			
			for (int pos=0; pos<t2.length; pos++)
			{
				if (t3[pos] != t2 [pos])
			
					t3[pos+t1.length]=t2[pos];
					
			}
			
			
			for (int pos=0; pos<t1.length+t2.length; pos++)
			{
			
				System.out.println(t3[pos]);		
			}
			
	}

}
