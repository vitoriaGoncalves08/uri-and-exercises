import java.util.*;
public class ConversaoDeTempo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		
		int valorSeg = ler.nextInt();
		
		int horas = valorSeg / 3600;
		valorSeg = valorSeg % 3600;
		
		int min = valorSeg / 60;
		valorSeg = valorSeg % 60;
		
		int seg = valorSeg;
	
		
		System.out.println(horas + ":" + min +":" + seg);
		// fromata int
		//System.out.printf("%d:%d:%d\n", horas, min, seg);
		ler.close();
	}

}
