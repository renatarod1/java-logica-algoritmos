import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int totC = 0;
		int totR = 0;
		int totS = 0;
		int totCobaias = 0;

		for (int i = 1; i <= n; i++) {
			int qtdCobaias = sc.nextInt();
			char tipo = sc.next().charAt(0);

			if (tipo == 'C') {
				totC += qtdCobaias;
			} else if (tipo == 'R') {
				totR += qtdCobaias;
			} else {
				totS += qtdCobaias;
			}

			totCobaias += qtdCobaias;
		}

		System.out.println("Total: " + totCobaias + " cobaias");
		System.out.println("Total de coelhos: " + totC);
		System.out.println("Total de ratos: " + totR);
		System.out.println("Total de sapos: " + totS);
		System.out.printf("Percentual de coelhos: %.2f %%%n", (double)totC / totCobaias * 100.0);
		System.out.printf("Percentual de ratos: %.2f %%%n", (double)totR / totCobaias * 100.0);
		System.out.printf("Percentual de sapos: %.2f %%%n", (double)totS / totCobaias * 100.0);

		sc.close();
	}
}
