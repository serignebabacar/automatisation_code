package monProjet;

public class Exercice3 {
	public static void pair(int p) {
		if (p % 2 == 0) {
			System.out.println(p + " est pair ");
		} else {
			System.out.println(p + " est impair ");
		}
	}

	public static void main(String[] args) {
		pair(2);
		pair(-24);
		pair(0);
		pair(3);
		pair(-13);
	}
}
