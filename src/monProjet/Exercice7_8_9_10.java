package monProjet;

public class Exercice7_8_9_10 {
	public static boolean verifAlphabet(char c) {
		boolean test = false;
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			test = true;
		}
		return test;
	}

	public static void testConsonneVoyelle(char c) {
		if (verifAlphabet(c)) {
			if (c == 'a' || c == 'A' || c == 'o' || c == 'O' || c == 'e' || c == 'E' || c == 'y' || c == 'Y' || c == 'u'
					|| c == 'U' || c == 'i' || c == 'I') {
				System.out.println(c + " est une voyelle");
			} else {
				System.out.println(c + " est une consonne");
			}
		} else {
			System.out.println(c + " n'est ni voyelle ni consonne");
		}
	}

	public static void testAlphabetChiffreCaractereSpeciaux(char c) {
		if (verifAlphabet(c)) {
			System.out.println(c + " est alphabet");
		} else if (c >= '0' && c <= '9') {
			System.out.println(c + " est un chiffre ");
		} else {
			System.out.println(c + " un caractere special ");
		}
	}

	public static void majusculeOrMiniscule(char  c) {
		if(c >= 'a' && c <= 'z') {
			System.out.println(c+" est en miniscule");
		}else if (c >= 'A' && c <= 'Z') {
			System.out.println(c+" est en majuscule");
		}else {
			System.out.println(c+" est ni en majuscule ni en miniscule ");
		}
	}

	public static void main(String[] args) {
		System.out.println(verifAlphabet('A'));
		System.out.println(verifAlphabet('ù'));
		System.out.println(verifAlphabet('c'));
		testConsonneVoyelle('A');
		testConsonneVoyelle('ù');
		testConsonneVoyelle('5');
		testConsonneVoyelle('c');
		testAlphabetChiffreCaractereSpeciaux('1');
		testAlphabetChiffreCaractereSpeciaux('a');
		testAlphabetChiffreCaractereSpeciaux('ù');
		testAlphabetChiffreCaractereSpeciaux('@');
		majusculeOrMiniscule('0');
		majusculeOrMiniscule('c');
		majusculeOrMiniscule('E');

	}
}
