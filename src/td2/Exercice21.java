package td2;

import java.util.Arrays;

public class Exercice21 {
	public static void entierXOrderTableau(int tab[], int x) {
		Arrays.sort(tab);
		int tab2[] = new int[tab.length + 1];
		int compt= 0;
		boolean verif = true;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] >= x && verif) {
				tab2[compt++] = x;
				tab2[compt++] = tab[i];
				verif = false;
			} else {
				tab2[compt++] = tab[i];
			}
			//System.out.print(tab2[i]+" ");
		}
		for (int i : tab2) {
			System.out.print(i + " ");
		}
			
	}

	public static void main(String[] args) {
		entierXOrderTableau(new int[] { 1, 2, 5, 1, 4, 7, 9, 80 }, 80);

	}
}
