import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int cont = 0, somaIdades = 0;
		int idade = sc.nextInt();
		
		while (idade >= 0){
			somaIdades += idade;
			cont++;
			idade = sc.nextInt();
		}
		
		double media = (double) somaIdades / cont;
		System.out.printf("%.2f%n", media);
		
		sc.close();
	}

}
