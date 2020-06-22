import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X;
		double Y, total;

		X = sc.nextInt();
		Y = sc.nextDouble();

		total = X / Y;
		System.out.printf("%.3f km/l%n", total);

		sc.close();
	}

}
