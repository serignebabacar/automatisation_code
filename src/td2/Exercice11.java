package td2;

public class Exercice11 {

	public static void nombreOccurrences(int tab[],int number) {
		int compt = 0;
		for(int i = 0;i<tab.length;i++) {
			if(tab[i]==number)
				compt++;
		}
		System.out.println("le nombre d'occurrence de "+number+" est "+compt);
	}
	public static void main(String[] args) {
		int tab[] = new int[] {1,2,4,2,2,7,9,10};
		nombreOccurrences(tab, 2);
	}

}
