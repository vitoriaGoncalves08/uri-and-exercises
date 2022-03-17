import java.util.*;
public class GastoDeCombustivel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		
		int tempoHoras = ler.nextInt();
		int velocidadeMedia = ler.nextInt();
		
		double litros = (tempoHoras*velocidadeMedia)/12.0;
		
		System.out.printf("%.3f\n", litros);
		
		ler.close();
	}

}
