package dowhilewhilefor;

public class Exercice6_7 {
	static int somme1aN(int n) {
		int somme = 0;
		for (int i = 0; i < n; i++) {
			somme += i;
		}
		return somme;
	}

	static int somme1aNImpair(int n) {
		int somme = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 != 0)
				somme += i;
		}
		return somme;
	}

	public static void main(String[] args) {
		// System.out.println(somme1aN(6));
		// System.out.println(somme1aNImpair(5));
	}
}
