import java.util.*;
public class IdadeEmDias {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int idadeDias = ler.nextInt();
		
		int ano = idadeDias / 365;
		idadeDias = idadeDias % 365;
		int mes = idadeDias / 30;
		idadeDias = idadeDias % 30;
		int dia = idadeDias;
		
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
		
		ler.close();
	}

}
