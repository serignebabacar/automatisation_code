package monProjet;

public class Exercice2 {
	public static void maximumNumber(int a, int b, int c) {
		if (a < c && b < c) {
			System.out.println(c + " est le maximum ");
		} else if (a > b && a > c) {
			System.out.println(a + " est le maximum ");
		} else if (a < b && b > c) {
			System.out.println(b + " est le maximum ");
		} else {
			System.out.println(a + " == " + b + " == " + c);
		}
	}

	public static void main(String[] args) {
		maximumNumber(-0, +0, 0);
		maximumNumber(+1, -1, 7);
		maximumNumber(-6, 9, 7);
		maximumNumber(2, 1, 0);
		maximumNumber(200, 100, 300);
	}
}
