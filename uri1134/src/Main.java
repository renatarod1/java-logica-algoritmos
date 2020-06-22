import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0;

		int tipoCombustivel = sc.nextInt();

		while (tipoCombustivel != 4) {
			switch (tipoCombustivel) {
			case 1:
				alcool++;
				break;

			case 2:
				gasolina++;
				break;

			case 3:
				diesel++;
				break;
			}
			tipoCombustivel = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}
}
