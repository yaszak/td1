import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exo_5 {

	public static void main(String[] args) {
		
//M�thode A.
		
		long s =  (long) java.lang.System.currentTimeMillis();
		System.out.println("le nombre de secondes comptabilis�s depuis 1970 : "+s);
		long sec = (1000) * (60);
		long heures = sec * 60;
		long jours = heures * 24;
		long ann�es = jours * 365;
		long nbAnn�e= s/ann�es;
		System.out.println();
		System.out.println("le nombre d'ann�e depuis 1970 est de: "+nbAnn�e);
		System.out.println();
		
		
//M�thode B.
		
		System.out.print("la date d'aujourd'hui � la mani�re anglo-saxons: ");
		Date d = new Date ();
		System.out.println(d);
		System.out.println();
		
//M�thode C
		
		Calendar c = Calendar.getInstance();
		int Ann�e = c.get(Calendar.YEAR);
		int Mois = c.get(Calendar.MONTH);
		int Jour = c.get(Calendar.DAY_OF_MONTH);
		System.out.print("la date d'aujoutd'hui est:  ");
		System.out.print(Jour+"/");
		System.out.print(Mois+"/");
		System.out.print(Ann�e+".");
		System.out.println();
		
//M�thode d
		
		System.out.println();
		Date D = new Date ();
		SimpleDateFormat f = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss");
		System.out.println("Maintenant: "+ f.format(D));
		
	}

}
