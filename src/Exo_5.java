import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exo_5 {

	public static void main(String[] args) {
		
//Méthode A.
		
		long s =  (long) java.lang.System.currentTimeMillis();
		System.out.println("le nombre de secondes comptabilisés depuis 1970 : "+s);
		long sec = (1000) * (60);
		long heures = sec * 60;
		long jours = heures * 24;
		long années = jours * 365;
		long nbAnnée= s/années;
		System.out.println();
		System.out.println("le nombre d'année depuis 1970 est de: "+nbAnnée);
		System.out.println();
		
		
//Méthode B.
		
		System.out.print("la date d'aujourd'hui à la manière anglo-saxons: ");
		Date d = new Date ();
		System.out.println(d);
		System.out.println();
		
//Méthode C
		
		Calendar c = Calendar.getInstance();
		int Année = c.get(Calendar.YEAR);
		int Mois = c.get(Calendar.MONTH);
		int Jour = c.get(Calendar.DAY_OF_MONTH);
		System.out.print("la date d'aujoutd'hui est:  ");
		System.out.print(Jour+"/");
		System.out.print(Mois+"/");
		System.out.print(Année+".");
		System.out.println();
		
//Méthode d
		
		System.out.println();
		Date D = new Date ();
		SimpleDateFormat f = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss");
		System.out.println("Maintenant: "+ f.format(D));
		
	}

}
