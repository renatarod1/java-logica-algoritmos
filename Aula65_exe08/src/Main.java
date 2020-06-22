import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double menorAltura = 0.0;		
		double maiorAltura = 0.0;		
		double soma = 0.0;
		int qtdHomens = 0;
		
		int n = sc.nextInt();
		double[] alturas = new double[n];
		char[] sexos = new char[n];
		
		for (int i = 0; i < n; i++) {
			alturas[i] = sc.nextDouble();
			sexos[i] = sc.next().charAt(0);
		}
		
		menorAltura = alturas[0];
		for (int i = 0; i < n; i++) {
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];				
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		
		for (int i = 0; i < n; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];				
			}
		}
		
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		
		for (int i = 0; i < n; i++) {
			soma += alturas[i];
		}
		
		double media = soma / n;
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		
		for (char x: sexos) {
			if (x == 'M') {
				qtdHomens++;
			}
		}
		System.out.println("Numero de homens = "+ qtdHomens);
		
		sc.close();

	}

}
