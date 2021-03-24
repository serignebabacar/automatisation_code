package td2;

public class Exercice12_13 {
	public static void occurenceNumberMaximum(int[] unTab) {
		int max = unTab[0];
		int indix = 0;
		for (int i = 0; i < unTab.length; i++) {
			if (max < unTab[i]) {
				max = unTab[i];
				indix = i;
			}
		}
		System.out.println(" le maximum de ses numbers est " + max + " et sa postion est " + indix);

	}
	public static void occurenceNumberMinimum(int[] unTab) {
		int min = unTab[0];
		int indix = 0;
		for (int i = 0; i < unTab.length; i++) {
			if (min >unTab[i]) {
				min = unTab[i];
				indix = i;
			}
		}
		System.out.println(" le maximum de ses numbers est " + min + " et sa postion est " + indix);

	}
	public static void main(String [] args) {
		int tab[] = new int [] {1,1,8,4,5,8};
		occurenceNumberMaximum(tab);
		occurenceNumberMinimum(tab);
	}
}
