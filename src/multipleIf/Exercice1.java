package multipleIf;

public class Exercice1 {
	public static void mois(int n) {
		switch (n) {
		case 1: {
			System.out.println("Janvier");
			break;
		}
		case 2: {
			System.out.println("Fevrier");
			break;
		}
		case 3: {
			System.out.println("Mars");
			break;
		}
		case 4: {
			System.out.println("Avril");
			break;
		}
		case 5: {
			System.out.println("Mai");
			break;
		}
		case 6: {
			System.out.println("Juin");
			break;
		}
		case 7: {
			System.out.println("Juillet");
			break;
		}
		case 8: {
			System.out.println("Aout");
			break;
		}	case 9: {
			System.out.println("Septembre");
			break;
		}
		case 10: {
			System.out.println("Octobre");
			break;
		}
		case 11: {
			System.out.println("Novembre");
			break;
		}
		case 12: {
			System.out.println("Decembre");
			break;
		}
		default:
			System.out.println("Erreur ");
			break;
		}
	}

	public static void main(String[] args) {
		mois(2);
		mois(12);
		mois(123);
		
	}
}
