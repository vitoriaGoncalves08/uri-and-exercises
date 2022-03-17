
import java.util.*;
public class Media2 {
	public static void main (String []args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		double A = ler.nextDouble();
		double B = ler.nextDouble();
		double C = ler.nextDouble();
		
		double MEDIA = ((A*2)+(B*3)+(C*5))/10.0;
		
		System.out.printf("MEDIA = %.1f\n",MEDIA);
		ler.close();
	}
}