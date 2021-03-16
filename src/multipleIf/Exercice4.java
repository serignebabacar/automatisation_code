package multipleIf;

public class Exercice4 {
	public static double menu(String plat) {
		double prix = 0;
		switch (plat) {
		case "glace": {
			prix = 0.50;
			System.out.println("Vous avez choisi le menu 1 ,le prix est " + prix);
			break;
		}
		case "gateau": {
			prix = 0.50;
			System.out.println("Vous avez choisi le menu 2 ,le prix est " + prix);
			break;
		}
		case "gele": {
			prix = 0.50;
			System.out.println("Vous avez choisi le menu 3 ,le prix est " + prix);
			break;
		}
		case "creme": {
			prix = 0.80;
			System.out.println("Vous avez choisi le menu 4 ,le prix est " + prix);
			break;
		}
		default:
			System.out.println("Choix invalide");
		}
		return prix;
	}

	public static void main(String[] args) {
		menu("gateau");
		menu("creme");
		menu("ee");
	}
}
