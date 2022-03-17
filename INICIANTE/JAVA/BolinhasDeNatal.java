import java.util.Scanner;
public class BolinhasDeNatal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int Bo = ler.nextInt();
		int G = ler.nextInt();
		int bolinhas;
		
		if(Bo % 2 == 0 || Bo == 0) {
			bolinhas = (G/2);
			int B = bolinhas - Bo;
			if(B > 0) {
				System.out.println("Faltam "+B+" bolinha(s)");
			}
			else {
				System.out.println("Amelia tem todas bolinhas!");
			}
			
		}else {
			int BB = Bo - 1;
			bolinhas = (G/2);
			int B = bolinhas - BB;
			if(B > 0) {
				System.out.println("Faltam "+B+" bolinha(s)");
			}
			else {
				System.out.println("Amelia tem todas bolinhas!");
			}
		}
		
		ler.close();
	}

}
