import java.text.DecimalFormat;
import java.util.*;
public class Media3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		double N1 = ler.nextDouble();
		double N2 = ler.nextDouble();
		double N3 = ler.nextDouble();
		double N4 = ler.nextDouble();
		
		double media = ((N1*2)+(N2*3)+(N3*4)+(N4*1))/10;
		
		System.out.println("Media: "+ df.format(media));
		
		if(media >= 7) {
			System.out.println("Aluno aprovado.");
		}
		else if(media < 5) {
			System.out.println("Aluno reprovado.");
		}
		else if(media >= 5 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			double exame = ler.nextDouble();
			media = (media + exame)/2;
			System.out.printf("Nota do exame: %.1f\n",exame);
			
				if(media >= 5) {
					System.out.println("Aluno aprovado.");
				}
				else {
					System.out.println("Aluno reprovado.");
				}
				System.out.println("Media final: "+ df.format(media));
		}
		
		ler.close();
	}

}
