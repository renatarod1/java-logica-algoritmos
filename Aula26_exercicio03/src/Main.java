import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1 = sc.next();
		int idade1 = sc.nextInt();
		
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		
		//Cast para apresentar o resultado quebrado ou dividir por 2.0
		double media = (double) (idade1 + idade2) / 2;
		
		System.out.printf("A idade m�dia de %s e %s � de %.1f anos%n", nome1, nome2, media);
		sc.close();
		
		

	}

}
