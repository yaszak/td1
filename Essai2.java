package yas;

public class Essai2 {

	public static void main(String[] args) {
	Essai2 ville=new Essai2 ("Tlemcen", 123232, "Algérie");

	System.out.println("("+"le nom de la ville "+ville.getNom()+ "  pour "+ville.getNbHab()+")");
	ville.setNom("Oran");

	System.out.println("("+"le nom de la ville "+ville.getNom()+ "  pour "+ville.getNbHab()+")");
	
	System.out.println("Le nombre d'instances de la classe Ville est : " +ville.nbInstances);
	System.out.println("Le nombre d'instances de la classe Ville est : " + ville.getnombreInstance());
	
	Essai2 ville1 =new Essai2 ("Khenchela", 123213, "Algérie");
	System.out.println("Le nombre d'instances de la classe Ville est : " +ville1.nbInstances);
	System.out.println("Le nombre d'instances de la classe Ville est : " + ville1.getnombreInstance());

	}
	
	String nom;
	int nbHab;
	String pays;
	
	public Essai2 () {
		nom="";
		nbHab=0;
		pays="";
	}

	public static int nbInstances=0;
	private static int nbInstancesBis=0;
	
	
	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public String getNom() {
		return nom;
	}


	public int getNbHab() {
		return nbHab;
	}



	public String getPays() {
		return pays;
	}
	
	public static int getnombreInstance() {
		return nbInstancesBis;
	}

	public Essai2 (String nom, int nbHab, String pays) {
		this.nom=nom;
		this.nbHab=nbHab;
		this.pays=pays;
		nbInstances++;
		nbInstancesBis++;
	}
}
