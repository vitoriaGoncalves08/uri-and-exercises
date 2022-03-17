import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
public class teste {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.ENGLISH);

        double N1,N2,N3,N4,exame;
        double MEDIA;

        N1 = ler.nextDouble();
        N2 = ler.nextDouble();
        N3 = ler.nextDouble();
        N4 = ler.nextDouble();

        MEDIA = ((2*N1) + (3*N2) + (4*N3) + (1*N4)) / 10;

        System.out.printf("Media: %.1f\n" , MEDIA);     
        if(MEDIA >= 7) {
            System.out.printf("Aluno aprovado.\n");
        }else if(MEDIA < 5) {
                System.out.printf("Aluno reprovado.\n");

        }else if(MEDIA >= 5) {
        	 System.out.printf("Aluno em exame.\n");
        	 exame = ler.nextDouble();
        	 MEDIA = (MEDIA + exame) /2;
        	 System.out.printf("Nota do exame: %.1f\n", exame);
        	 
        	 if(MEDIA >= 5) {
        		 System.out.printf("Aluno aprovado.\n");
        	 }else {
        		   System.out.printf("Aluno reprovado.\n");
        		 }
        	 System.out.printf("Media final: %.1f\n", MEDIA);
        	 
        	 }
        }

    }