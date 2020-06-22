import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] num = new double[n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%.2f%n",num[i]);
		}
		
		sc.close();
	}

}