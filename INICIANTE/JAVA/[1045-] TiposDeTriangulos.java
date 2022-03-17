import java.util.*;
public class TiposDeTriangulos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		double A = ler.nextDouble();
		double B = ler.nextDouble();
		double C = ler.nextDouble();
		double ajd;
		
		if(A < B && B < C) {
			ajd = B;
			B = A;
			A = ajd;
		}else if(C < A) {
			ajd = C;
			C = A;
			A = ajd;
		}
		
		if((A >= B + C)) {
			System.out.println("NAO FORMA TRIANGULO");
		}if((Math.pow(A, 2)) == (Math.pow(B, 2) + Math.pow(C, 2))) {
			System.out.println("TRIANGULO RETANGULO");
		}if((Math.pow(A, 2)) > (Math.pow(B, 2) + Math.pow(C, 2))) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}if((Math.pow(A, 2)) < (Math.pow(B, 2) + Math.pow(C, 2))) {
			System.out.println("TRIANGULO ACUTANGULO");
		}if(A == B && A == C) {
			System.out.println("TRIANGULO EQUILATERO");
		}if(A == B && A != C || A == C && A != B || B == C && B != A) {
			System.out.println("TRIANGULO ISOCELES");
		}
		
		ler.close();
	}

}
