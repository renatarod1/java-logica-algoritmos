import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cont = 0;
		
		for (int i = 1; i > 0; i++) {
			if (cont == n) break;
			if (i % 4 == 0) {
				System.out.println("PUM");		
				cont += 1;
			} else {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
