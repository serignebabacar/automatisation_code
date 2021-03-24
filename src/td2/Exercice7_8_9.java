package td2;

public class Exercice7_8_9 {
	public static int[] sommeTableau(int tab[],int tab2[]) {
		int somme=0;
		for(int i = 0;i<tab.length;i++) {
			somme = tab[i]+tab2[i];
			tab[i]=somme;
		}
		return tab;
	}
	public static int [] sommeTableau2(int tab[],int tab2[]) {
		int tabSomms[] = new int[tab.length];
		for(int i = 0;i<tab.length;i++) {
			tabSomms[i] = tab[i]+tab2[i];
		}
		return tabSomms;
	}
	public static void main(String [] args) {
		int tab[] = new int []{1,2,3,4,5};
		int tab2[] = new int []{1,2,3,4,5};
		sommeTableau(tab, tab2);
	}
	public static boolean contentElement(int tab[],int n) {
		boolean verif = false;
		for(int i = 0;i<tab.length;i++) {
			if(tab[i]==n)
				verif= true;
		}
		return verif;
	}
	public static int  contentElement(int tab[]) {
		int compt=0;
		for(int i = 0;i<10;i++) {
			if(tab[i]>=10)
				compt++;
		}
		return compt;
	}
}
