package dowhilewhilefor;

public class Exercice10_11 {
	static boolean estPremier(int n) {
		boolean verif = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				verif = false;
		}
		return verif;
	}

	static void estPremierAN(int n) {
		for (int i = 0; i <= n; i++) {
			if (estPremier(i) == true)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		estPremierAN(100);
	}
}
