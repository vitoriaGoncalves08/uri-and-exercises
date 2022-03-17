import java.util.*;
public class Area {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		
		double A = ler.nextDouble();
		double B = ler.nextDouble();
		double C = ler.nextDouble();
		double circuloQuadrado = Math.pow(C, 2);
		
		double triangulo =(A*C)/2;
		double circulo = (3.14159 * circuloQuadrado);
		double trapezio = ((A+B)*C)/2.0;
		double quadrado = B*B;
		double retangulo = (A*B);
		
		
		System.out.printf("TRIANGULO: %.3f\n",triangulo);
		System.out.printf("CIRCULO: %.3f\n",circulo);
		System.out.printf("TRAPEZIO: %.3f\n",trapezio);
		System.out.printf("QUADRADO: %.3f\n",quadrado);
		System.out.printf("RETANGULO: %.3f\n",retangulo);
		ler.close();
		
	}

}
