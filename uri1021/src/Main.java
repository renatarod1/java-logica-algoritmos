import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		//Este exercicio não foi aceito no URI JUDGE
		//Verificar erro.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double N = sc.nextDouble();

		System.out.println("NOTAS:");

		System.out.println((int)(N / 100.00) + " nota(s) de R$ 100.00");

		N = N % 100.00;

		System.out.println((int)(N / 50.00) + " nota(s) de R$ 50.00");

		N = N % 50.00;

		System.out.println((int)(N / 20.00) + " nota(s) de R$ 20.00");

		N = N % 20.00;

		System.out.println((int)(N / 10.00) + " nota(s) de R$ 10.00");

		N = N % 10.00;

		System.out.println((int)(N / 5.00) + " nota(s) de R$ 5.00");

		N = N % 5.00;

		System.out.println((int)(N / 2.00) + " nota(s) de R$ 2.00");

		N = N % 2.00;

		System.out.println("MOEDAS:");
		System.out.println((int)(N / 1.00) + " moeda(s) de R$ 1.00");

		N = N % 1.00;

		System.out.println((int)(N / 0.50) + " moeda(s) de R$ 0.50");

		N = N % 0.50;

		System.out.println((int)(N / 0.25) + " moeda(s) de R$ 0.25");

		N = N % 0.25;

		System.out.println((int)(N / 0.10) + " moeda(s) de R$ 0.10");

		N = N % 0.10;

		System.out.println((int)(N / 0.05) + " moeda(s) de R$ 0.05");

		N = N % 0.05;

		System.out.println((int)(N / 0.01) + " moeda(s) de R$ 0.01");

		sc.close();

	}

}
