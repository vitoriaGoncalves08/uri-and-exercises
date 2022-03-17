import java.util.*;
public class Intervalo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		double valor = ler.nextDouble();
		
			
		if(valor >= 0 && valor <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		else if(valor > 25 && valor <= 50) {
			System.out.println("Intervalo (25,50]");
		}
		else if(valor > 50 && valor <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		else if(valor > 75 && valor <=100){
			System.out.println("Intervalo (75,100]");
		}
		else if(valor < 0) {
			System.out.println("Fora de intervalo");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		
		ler.close();
	}

}
