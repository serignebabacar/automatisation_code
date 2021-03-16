package monProjet;

public class Exercice13_14 {
	public static void beneficePerte(int PA,int PV) {
		int result = PV-PA;
		if(result<0) {
			System.out.println("PERTE : "+result + " euro");
		}else if(result== 0) {
			System.out.println("NI PERTE NI BENEFICE");
		}else {
			System.out.println("BENEFICE : "+result+" euro");
		}
	}
	public static void calculPA(int pv,int beneficePerte) {
		System.out.println("le prix d'achat est : "+ (pv-beneficePerte) +" euro");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		beneficePerte(0, 0);
		beneficePerte(100, 50);
		beneficePerte(50, 99);
		calculPA(20,2);

	}

}
