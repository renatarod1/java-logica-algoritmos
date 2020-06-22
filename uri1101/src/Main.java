import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		while(M > 0 && N > 0) {
			int maior = 0;
			int menor = 0;
			
			if (M > N) {
				maior = M;
				menor = N;
			} else {
				maior = N;
				menor = M;
			}
			
			int soma = 0;
			for (int i = menor; i <= maior; i++) {
				System.out.print(i + " ");
				soma += i;
			}
			System.out.println("Sum="+soma);
			
			M = sc.nextInt();
			N = sc.nextInt();
		}
		
		sc.close();
	}

}
