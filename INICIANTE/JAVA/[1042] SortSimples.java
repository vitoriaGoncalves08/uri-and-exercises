import java.util.*;
public class SortSimples {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int A = ler.nextInt();
		int B = ler.nextInt();
		int C = ler.nextInt();
		
		if(A < B && A < C ) {
			System.out.println(A);
			if(B < C) {
				System.out.println(B);
				System.out.println(C);
			}if(C < B){
				System.out.println(C);
				System.out.println(B);
			}
		}else if(B < A && B< C) {
			System.out.println(B);
			if(A < C) {
				System.out.println(A);
				System.out.println(C);
			}if(C < A) {
				System.out.println(C);
				System.out.println(A);
			}
		}else if(C < A && C< B) {
			System.out.println(C);
			if(A < B) {
				System.out.println(A);
				System.out.println(B);
			}if(B < A) {
				System.out.println(B);
				System.out.println(A);
			}
		}
		System.out.println("");
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
		ler.close();
	}

}
