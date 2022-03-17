import java.util.*;
public class Omaior {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int A = ler.nextInt();
		int B = ler.nextInt();
		int C = ler.nextInt();
		
		int maiorAB = (A + B + Math.abs(A - B))/ 2;
		
		int maiorABC = (maiorAB + C+ Math.abs(maiorAB - C))/ 2;
		
		System.out.println(maiorABC + " eh o maior");
		
		ler.close();
	}

}
