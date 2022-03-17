import java.util.*;
public class Distancia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int distanciaXY = ler.nextInt();
		
		int tempo = distanciaXY * 2;
		
		System.out.println(tempo+" minutos");
		
		ler.close();
	}

}
