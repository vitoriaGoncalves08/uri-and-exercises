import java.util.*;
public class Consumo {
	public static void main (String []args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		
		int XDistancia = ler.nextInt();
		double YCombustivel = ler.nextDouble();
		
		double consumo = (XDistancia/YCombustivel);
		
		System.out.printf("%.3f km/l\n",consumo);
		
		ler.close();
	}
}
