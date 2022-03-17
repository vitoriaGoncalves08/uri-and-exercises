import java.util.*;
public class Multiplos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int A = ler.nextInt();
		int B = ler.nextInt();
		
		
		if(B % A == 0 || A % B == 0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Não sao Multiplos");
		}
		
		ler.close();
	}

}
