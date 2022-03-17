import java.util.*;
public class Lanche {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		double total = 0;
		
		int cod = ler.nextInt();
		int quant = ler.nextInt();
		
		if(cod == 1) {
			total = 4.00 * quant;
		}else if(cod == 2) {
			total = 4.50 * quant;
		}else if(cod == 3) {
			total = 5.00 * quant;
		}else if(cod == 4) {
			total = 2.00 * quant;
		}else if(cod == 5) {
			total = 1.50 * quant;
		}else {
			
		}
		 System.out.printf("Total: R$ %.2f\n", total);
		 
		ler.close();
	}

}
