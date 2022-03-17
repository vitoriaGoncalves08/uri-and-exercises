import java.util.*;
public class TesteDeSelecao1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int A = ler.nextInt();
		int B = ler.nextInt();
		int C = ler.nextInt();
		int D = ler.nextInt();
		
		int somaCD = C + D;
		int somaAB = A + B;
		
		if(B > C && D > A && somaCD > somaAB && C >=0 && D>=0 && A%2==0) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores nao aceitos");
		}
		
		ler.close();
	}

}
