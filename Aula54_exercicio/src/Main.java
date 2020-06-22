import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char repetir;
				
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();
			double fahrenheit = 9.0 * celsius / 5.0 + 32; 
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			System.out.print("Deseja repetir (s/n)? ");
			repetir = sc.next().charAt(0);
		} while (repetir != 'n');
				
		sc.close();

	}

}
