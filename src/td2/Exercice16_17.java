package td2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Exercice16_17 {
	public static void afficherTab(int tab[]) {
		for (int i : tab) {
			System.out.print(i + " ");
		}
	}

	public static void sort(int tab[]) {
		Arrays.sort(tab);
		afficherTab(tab);
	}

	public static void trieDecroissant(int tab[]) {
		Integer integerArray[] = new Integer[tab.length];
		for (int i=0;i<tab.length;i++) {
			integerArray[i] =tab[i];
		}
		Arrays.sort(integerArray, Collections.reverseOrder());
		for (int i : integerArray) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int tab [] = { 1, 5, 4, 7, 9, 3, 2, 1, 2 };
	sort(tab);
	System.out.println("*******************");
		trieDecroissant(tab);
	}
}
