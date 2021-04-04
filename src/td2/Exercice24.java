package td2;

public class Exercice24 {
	public static void inverserTableau(int[] tab) {
		int tab3[] = new int[tab.length];
		int compt = 0;
		for (int i = tab.length - 1; i >= 0; i--) {
			tab3[compt++] = tab[i];
		}
		for (int i : tab3) {
			System.out.print(i + " ");
		}
	}

	public static void changePosition(int tab[]) {
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < tab.length - 1; i++) {
				int c = tab[i];
				tab[i] = tab[i + 1];
				tab[i + 1] = c;
			}
		}
		for (int i : tab)
			System.out.print(i + " ");
	}

	public static void main(String[] args) {
		inverserTableau(new int[] { 85, 2, 5, 4, 4, 7, 8, 7, 8 });
		System.out.println();
		changePosition(new int[] { 85, 2, 5, 4, 4, 7, 8, 7, 8 });
	}
}
