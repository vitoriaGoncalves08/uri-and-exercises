import java.util.*;
public class SalarioComBonus {
	public static void main(String[]args) {
	Locale.setDefault(Locale.US);
	
	Scanner ler = new Scanner(System.in);
	
	String nome = ler.next();
	double salaF = ler.nextDouble();
	double totalV = ler.nextDouble();
	
	double TOTAL = salaF +(totalV * 0.15);
	
	System.out.printf("TOTAL = R$ %.2f\n", TOTAL);
	
	ler.close();
	}
}
