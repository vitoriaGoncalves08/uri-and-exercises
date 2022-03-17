import java.util.*;
public class CalculoSimples {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
			int C1 = ler.nextInt();
			int N1 = ler.nextInt();
			double V1 = ler.nextDouble();
			
			int C2 = ler.nextInt();
			int N2 = ler.nextInt();
			double V2 = ler.nextDouble();
			
			double custoTotal = (N1*V1)+(N2*V2);
			
			System.out.printf("VALOR A PAGAR: R$ %.2f\n",custoTotal);
			ler.close();
		
	}

}
