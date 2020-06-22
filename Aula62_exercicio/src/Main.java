import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vet = new double[n];
		double soma = 0;
		double media = 0;
		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(vet[i] + " ");
			soma += vet[i];			
		}
		System.out.println(" ");
		media = soma / n;
		System.out.printf("%.2f%n", soma);
		System.out.printf("%.2f%n", media);
		sc.close();
	}

}
