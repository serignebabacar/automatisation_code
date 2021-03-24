package td2;

import java.util.Random;

public class Exercice14_15 {
	public static void afficher(int tab[],int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(tab[i]+" ");
		}
		System.out.println("*********************");
	}

	public static void gererTableau(int tab[]) {
		Random rand = new Random(-10);
		for (int i = 0; i < tab.length; i++) {
			tab[i] = (-tab.length) + rand.nextInt(tab.length - (-tab.length));
		}
		afficher(tab,tab.length);
		int tab2 [] = new int[tab.length];
		int compt = 0;
		for (int i = 0; i < tab.length; i++) {
			if(tab[i]<0) {
				tab2[compt++] = Math.abs(tab[i]);
			}
		}
		afficher(tab2,compt);
		int tab3 [] = new int[tab.length];
		int compteur = 0;
		for (int i = 0; i < tab.length; i++) {
			if(tab[i]>0) {
				tab3[compteur++] = (int) Math.pow(tab[i], 2);
			}
		}

		afficher(tab3,compteur);
	}

	public static void main(String[] args) {
		int tab[] = new int[10];
		gererTableau(tab);
		//afficher(tab);
	}

}
