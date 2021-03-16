package monProjet;

public class Exercice11_12_13 {
	public static void verifAngles(int angle1,int angle2,int angle3) {
		if(angle1+angle2+angle3==180) {
			System.out.println("le triangle est valide");
		}else {
			System.out.println("le triangle n'est pas  valide");
		}
	}
	public static void verifCotes(int cote1,int cote2,int cote3) {
		if(cote1+cote2>cote3 && cote1+cote3>cote2 && cote3+cote2>cote1 ) {
			System.out.println("le triangle est valide");
		}else {
			System.out.println("le triangle n'est pas  valide");
		}
	}
	public static void triangleEquiIsoSca(int cote1,int cote2,int cote3) {
		if(cote1==cote2 && cote2 == cote3 ) {
			System.out.println("le triangle est equilateral");
		}else if(cote1==cote2 || cote1==cote3 || cote3==cote2  ) {
			System.out.println("le triangle est isocele ");
		}else {
			System.out.println("le triangle est scalene ");
		}
	}
	public static void main(String [] args) {
//		verifAngles(0, 0, 0);
//		verifAngles(90, 45, 45);
//		verifCotes(0, 0, 0);
//		verifCotes(12,11, 20);
	triangleEquiIsoSca(0, 0, 0);
	triangleEquiIsoSca(12, 12, 0);
	triangleEquiIsoSca(12, 13, 0);
	}
}
