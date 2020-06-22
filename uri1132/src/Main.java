import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int maior = y;
		int menor = x;
		
		if (x > y) {
			maior = x;
			menor = y;
		}
		
		int soma = 0;
		for (int i = menor; i <= maior; i++) {
			if (i % 13 != 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);
		
		
		sc.close();
	}

}
