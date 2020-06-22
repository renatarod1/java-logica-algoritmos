import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int soma = 0;
		int qtdPares = 0;
		int[] num = new int[n];
		
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		
		for (int x: num) {
			if (x % 2 == 0) {
				soma += x;
				qtdPares++;
			}
			
		}
		
		double media = soma / qtdPares;
		System.out.printf("%.1f%n", media);
		
		
		sc.close();
	}

}
