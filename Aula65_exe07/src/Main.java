import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] nomes = new String[n];
		double[] notas1sem = new double[n];
		double[] notas2sem = new double[n];
		double[] medias = new double[n];
		
 		for (int i = 0; i < n; i++) {
			nomes[i] = sc.next();
			notas1sem[i] = sc.nextDouble();
			notas2sem[i] = sc.nextDouble();			
		}
 		
 		for (int i = 0; i < n; i++) {
			medias[i] = (notas1sem[i] + notas2sem[i]) / 2.0;
		}
 		
 		System.out.println("Alunos aprovados");
 		for (int i = 0; i < n; i++) {
 			if (medias[i] >= 6.0) {
 				System.out.println(nomes[i]);
 			}			
		}	
		sc.close();
	}

}
