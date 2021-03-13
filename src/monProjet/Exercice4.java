package monProjet;

public class Exercice4 {
	public static void anneeBissextile(int annee) {
		if ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0) {
			System.out.println(annee + " est bisextille");
		} else {
			System.out.println(annee + " n'est pas bisextille");
		}
	}

	public static void main(String[] args) {
		anneeBissextile(2000);
		anneeBissextile(1994);
		anneeBissextile(2024);
		anneeBissextile(2025);
		anneeBissextile(2021);
		anneeBissextile(1900);
	}

}
