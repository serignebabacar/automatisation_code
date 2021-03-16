package monProjet;

public class Exercice5 {
	public static void testNumber(int n) {
		if(n==0) {
			System.out.println("le nombre est null");
		}else if(n<0) {
			System.out.println("le nombre est negatif");
		}else {
			System.out.println("le nombre est positif");
		}
	}
	public static void main(String [] args) {
		testNumber(-1);
		testNumber(0);
		testNumber(5);
	}
}
