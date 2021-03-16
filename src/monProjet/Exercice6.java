package monProjet;

public class Exercice6 {
	public static void divisible5And11(int n){
		if(n%5==0 && n%11 ==0) {
			System.out.println("le nombre : "+n+" est divisible par 5 et 11");
		}else {
			System.out.println("le nombre : "+n+" n'est pas divisible par 5 et 11");
		}
	}
	public static void main(String [] agrs) {
		divisible5And11(11);
		divisible5And11(55);
	}
}
