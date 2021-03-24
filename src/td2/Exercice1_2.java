package td2;

public class Exercice1_2 {
	public static void afficherTableau(int tab[]) {
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
		}
	}
	public static void afficherTableau(char tab[]) {
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
		}
	}
	public static void remplirTableau(int tab[]) {
		int compt=1;
		for(int i=0;i<tab.length;i++) {
			tab[i]=compt++;
		}
	}
	public static void remplirTableau(char tab[]) {
		char compt='A';
		for(int i=0;i<tab.length;i++) {
			tab[i]=compt++;
		}
	}
	public static void main(String [] args) {
		int tab[] = new int[10];
		remplirTableau(tab);
		afficherTableau(tab);
		char tab1[] = new char[10];
		remplirTableau(tab1);
		afficherTableau(tab1);
	}

}
