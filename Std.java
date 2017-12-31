package yas;

public class Std {

	public static void main(String[] args) {
		
		Essai2 ville = new Essai2("manathan", 1234, "USA");
		System.out.println(ville.nom);
		ville.nom="batna";
		ville.setNom("oran");
		System.out.println("la ville "+ville.getNom());
		System.out.println(ville.nom);

	}
	

}

