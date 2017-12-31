import java.util.Scanner;
import java.math.BigInteger;

public class Exo_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer un nombre entier");
		int nbr = sc.nextInt();

		System.out.println("le factoriel du nombre " + factoriel(nbr));
		// System.out.println("le factoriel du nombre "+factoriel(nbr)/factoriel(nbr -
		// 1));
		System.out.println("entrer un nouveau nombre entier");
		int nbr2 = sc.nextInt();
		System.out.println("le factoriel du nombre " + factoriel1(nbr2));
		sc.close();
	}

	// Q1.

	public static int factoriel(int n) {

		if (n < 1) {
			System.out.println("le nombre doit etre superieur à 0");
			return 1;
		} else {
			int res = 1;
			for (int i = 1; i <= n; i++) {
				res = res * i;
			}
			return res;
		}

	}

	// Q2.

	static BigInteger factoriel1(int n) {

		BigInteger res = BigInteger.valueOf(1);

		for (int i = 1; i < n; i++) {

			res = res.multiply(BigInteger.valueOf(i));

		}
		return res;
	}

}