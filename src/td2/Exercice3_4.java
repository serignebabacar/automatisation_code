package td2;

import java.util.Random;

public class Exercice3_4 {
	public static void generateTab(int n, String type) {
		Random r = new Random();
		switch (type) {
		case "reel": {
			float tab[] = new float[n];
			for (int i = 0; i < tab.length; i++) {
				tab[i] = (r.nextFloat());
				System.out.print(tab[i] + " ");
			}
			break;
		}
		case "entier": {
			int tab[] = new int[n];
			for (int i = 0; i < tab.length; i++) {
				tab[i] = r.nextInt(20);
				System.out.print(tab[i] + " ");
			}
			break;
		}
		case "caractere": {
			char tab[] = new char[n];
			for (int i = 0; i < tab.length; i++) {
				char c = (char) (r.nextInt(26) + 'a');
				tab[i] = c;
				System.out.print(tab[i] + " ");
			}
			break;
		}
		default:
			System.out.println("entré non pris en charge");
		}
	}
	public static void main(String [] args) {
		generateTab(5, "reel");
		System.out.println();
		generateTab(5, "entier");
		System.out.println();
		generateTab(5, "caractere");
		System.out.println();
		generateTab(5, "null");
	}

}
