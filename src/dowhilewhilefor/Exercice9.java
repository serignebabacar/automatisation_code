package dowhilewhilefor;

public class Exercice9 {

	public static void produitFActeurs(int n) {
		int tab[] = new int[n / 2];
		boolean test = true;
		int result;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				result = n / i;
				if (Exercice10_11.estPremier(i) && Exercice10_11.estPremier(result))
					System.out.println(result + " " + i);
			}

		}
	}

	public static void produitFActeurPremier(int n) {
			int result=n;
			for(int i = 2;i<=n;i++) {
				if(Exercice10_11.estPremier(i)) {
					while(result%i==0) {
						result = n/i;
						n = n/i;
						System.out.println(i);
					}
				}
				
				
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//produitFActeurs(60);
		produitFActeurPremier(600);
	}

}
