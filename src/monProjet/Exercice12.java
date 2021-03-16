package monProjet;

public class Exercice12 {
	public static void solutionsEquations(int a, int b, int c) {
		double x1, x2;
		double delta = b * b - 4 * a * c;
		if (delta > 0) {
			x1 = (-b - Math.sqrt(delta) / 2 * a);
			x2 = (-b + Math.sqrt(delta) / 2 * a);
			System.out.println("les solutions :" + x1 + " et " + x2);
		} else if (delta == 0) {
			x1 = (-b / 2 * a);
			System.out.println("l'unique solution  :" + x1);
		} else {
			System.out.println("pas de solutions reelles");
		}
	}
	public static void main(String [] args) {
		solutionsEquations(1, 2, 1);
		solutionsEquations(2, 2, 1);
		solutionsEquations(2, 6, 1);
	}
}
