import java.util.*;
public class Esfera {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int raio = ler.nextInt();
		
		double raioCubo = Math.pow(raio, 3);
		double VOLUME = ((4.0/3)*3.14159*raioCubo);
		 
		System.out.printf("VOLUME = %.3f\n",VOLUME);
	}
}
