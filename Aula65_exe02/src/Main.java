import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] numeros = new int[n];
		int cont = 0;
		
		for (int i = 0; i < n; i++) {
			numeros[i] = sc.nextInt();
		}
		
		for (int numero : numeros) {
			if (numero % 2 == 0) {
				System.out.print(numero + " ");
				cont++;
			}
		}
		System.out.println();
		System.out.println(cont);
		
		sc.close();
	}

}
