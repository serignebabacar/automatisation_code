package td2;


public class Exercice5_6 {
	public static void augmente1(int tab[]) {
		for (int i=0;i<tab.length;i++) {
			tab[i]++;
		}
	}
	public static void afficherTableau(int tab[]) {
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
		}
	}
	public static void compareTableau(int tab[],int tab1[]) {
		boolean verif = true;
		if(tab.length!=tab1.length) {
			verif= false;
		}
		for(int i=0;i<tab.length;i++) {
			if(tab[i]!=tab1[i]) {
				verif= false;
			}
		}
		if(verif) {
			System.out.println("tableaux egaux ");
		}else {
			System.out.println("tableaux differents ");
		}
	}
	public static void main(String [] args) {
		int tab[]=new int [] {1,2,3,4,5};
		int tab2[]=new int [] {1,2,3,4,5};
		//augmente1(tab);
		afficherTableau(tab);
		compareTableau(tab, tab2);
	}
}
