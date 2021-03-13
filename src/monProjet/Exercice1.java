package monProjet;

public class Exercice1 {
	public static void maximumNumber(int a, int b) {
		if (a < b) {
			System.out.println(b + " est le maximum ");
		} else if (a > b) {
			System.out.println(a + " est le maximum ");
		} else {
			//comment
			System.out.println(a + " == " + b);
		}
	}

	public static void main(String[] args) {
		maximumNumber(-0, +0);
		maximumNumber(+1, -1);
		maximumNumber(-6, 5);
		maximumNumber(2, 1);
		maximumNumber(200, 100);
	}

}
