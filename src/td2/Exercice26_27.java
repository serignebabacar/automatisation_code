package td2;

public class Exercice26_27 {
	public static void rotation(int tab[], int nombre) {
		for (int j = 0; j < nombre; j++) {
			for (int i = tab.length - 1; i > 0; i--) {
				int c = tab[i];
				tab[i] = tab[i - 1];
				tab[i - 1] = c;
			}
		}
		afficherTableau(tab);
	}

	public static void afficherTableau(int tab[]) {
		for (int i : tab) {
			System.out.print(i + " ");
		}
	}

	public static void deleteInPositionP(int[] tab, int p) {
		int tab2[] = new int[tab.length-1];
		int compteur=0;
		for (int i = 0; i < tab.length; i++) {
			if (p != i) {
				tab2[compteur++]=tab[i];
			}
		}
		tab=tab2;
		afficherTableau(tab);
	}

	public static void main(String[] args) {
		rotation(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 4);
		System.out.println();
		deleteInPositionP(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 2);
	}
}
