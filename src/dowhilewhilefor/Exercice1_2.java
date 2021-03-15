package dowhilewhilefor;

public class Exercice1_2 {
	public static void afficher(int n) {
		for(int i = 1;i<=n;i++) {
			System.out.println(i);
		}
	}
	public static void afficherInverse(int n) {
		for(int i = n;i>=1;i--) {
			System.out.println(i);
		}
	}
	public static void main(String [] args) {
		afficherInverse(5);
		
	}
}
