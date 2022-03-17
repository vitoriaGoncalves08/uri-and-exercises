import java.util.*;
public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		double A = ler.nextDouble();
		double B = ler.nextDouble();
		double C = ler.nextDouble();
		
		if((A < B + C) && (B < A + C) && (C < A + B)) {
			double perimetro = A + B + C;
			System.out.printf("Perimetro = %.1f\n", perimetro);
		}else {
			double areaTrap = ((A + B) * C) / 2; 
			System.out.printf("Area = %.1f\n", areaTrap);
		}
		
		ler.close();
	}

}
