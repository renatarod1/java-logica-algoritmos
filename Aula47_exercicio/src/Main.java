import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int soma = 0, contador = 0;
		double media = 0.0;
		int N = sc.nextInt();
		
		
		if (N < 0) {
			System.out.println("impossivel calcular");
		} else {
			while(N >= 0) {				
				soma += N;
				contador++;
				N = sc.nextInt();
			}
			media = (double) soma / contador;
			System.out.printf("%.2f%n", media);
		}
		
		sc.close();
	}

}
