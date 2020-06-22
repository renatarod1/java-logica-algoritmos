import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] num = new double[n];
		double soma = 0;
		
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextDouble();
		}
		
		for (double x : num) {
			soma += x;
		}
		
		double media = soma / n;
		System.out.printf("%.3f%n", media);
		
		for (double x : num) {
			if (x < media) {
				System.out.printf("%.1f%n", x);
			}
		}
		
		
		
		
		
		sc.close();

	}

}
