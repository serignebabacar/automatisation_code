package td2;

public class Exercice10 {
	public static void afficher(int tab[]) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}

	public static void tab(int tab[]) {
		int comptPair = 0;
		int comptImPair = 0;
		afficher(tab);
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 == 0) {
				comptPair++;
				tab[i] = 10;
			} else {
				comptImPair++;
				tab[i] = 3;
			}
		}
		System.out.println("le nombre de pair est " + comptPair + " et le nombre d'impair: " + comptImPair);
		afficher(tab);

	}

	public static void main(String[] args) {
		int[] tab = new int[] { 1, 2, 3, 4, 8, 10 };
		tab(tab);
	}
}
