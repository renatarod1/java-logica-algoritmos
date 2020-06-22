import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] numeros = new double[n];
		double maior = 0;
		int posicao = 0;
		
		for (int i = 0; i < n; i++) {
			numeros[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
				posicao = i;				
			}
		}
		System.out.printf("%.2f%n", maior);
		System.out.println(posicao);
		sc.close();
	}

}
