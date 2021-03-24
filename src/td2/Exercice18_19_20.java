package td2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice18_19_20 {
	public static void triComptage(int tab[]) {
		for (int i : tab) {
			if (i > 0) {
				System.out.print(i);
			}
		}
	}

	public static void remplirTableau(int tab[], int n) {
		System.out.println("Veuillez choisir la taille du tableau");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		tab = new int[n];
		System.out.println("veuillez saisir les elements du tableau ");
		for (int i = 0; i < n; i++) {
			System.out.print(" saisir element " + (i + 1));
			Scanner st = new Scanner(System.in);
			tab[i] = st.nextInt();
		}
		for (int i : tab) {
			System.out.print(i + " ");
		}
		System.out.println();
		Arrays.sort(tab);
		for (int i : tab) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		triComptage(new int[] { 1, 2, -8, 6, 1 });
		int tab[] = null;
		remplirTableau(tab, 8);
	}
}
