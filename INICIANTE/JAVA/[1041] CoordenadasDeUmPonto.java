import java.util.*;
public class CoordenadasDeUmPonto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		double x = ler.nextDouble();
		double y = ler.nextDouble();
		
		if(x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if(x == 0) {
			System.out.println("Eixo Y");
		}
		else if(y == 0) {
			System.out.println("Eixo X");
		}
		else if(x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if(x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if(x > 0 && y < 0) {
			System.out.println("Q4");
		}
		
		ler.close();
		
	}

}
