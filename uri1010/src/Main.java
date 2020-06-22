import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double vl1, vl2, total;
		
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		vl1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		vl2 = sc.nextDouble();
		
		total = vl1 * qtd1 + vl2 * qtd2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
