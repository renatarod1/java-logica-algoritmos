import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x != 0) {
						
			if (x % 2 != 0) {
				x = x + 1;
			}
			
			int soma = x + x + 2 + x + 4 + x + 6 + x + 8; 
			System.out.println(soma);
			
			x = sc.nextInt();
		}
		
		sc.close();
	}

}


/* Minha louca resolução - mas funciona
int cont = 0;
int soma = 0;
int X = sc.nextInt();

while (X != 0) {
	if (X % 2 == 0) {
		soma = X;
		cont = 1;
		while (cont <= 4) {
			X = X + 2;
			soma += X;
			cont++;
		}
		System.out.println(soma);
	} else {
		cont = 1;
		soma = X + 1;
		X = X + 1;
		while (cont <= 4) {
			X = X + 2;
			soma += X;
			cont++;
		}
		System.out.println(soma);
	}
	X = sc.nextInt();
}
*/