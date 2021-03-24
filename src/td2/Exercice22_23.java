package td2;

public class Exercice22_23 {

	public static void changePosition(int tab[]) {
		for (int i = 0; i < tab.length - 1; i++) {
			int c = tab[i];
			tab[i] = tab[i + 1];
			tab[i + 1] = c;
		}
		for (int i : tab)
			System.out.print(i + " ");
	}

	public static int[] supprimeNumber(int tab[], int n) {
		int tab2[] = new int[tab.length - 1];
		int compt = 0;
		for (int i : tab)
			if (i != n) {
				tab2[compt++] = i;
			}
	
		return tab2;
	}

	public static void main(String[] args) {
		int tab [ ] = new int[] { 1, 8, 9, 5, 7, 6, 8, 77 };
		changePosition(tab);
		System.out.println("**************************");
		for(int i : supprimeNumber(tab, 77))
			System.out.print(i+" ");
			
	}
}
