import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] matQuadrada = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matQuadrada[i][j] = sc.nextInt();
			}
		}
		
		int soma = 0;
		//Soma dos elementos acima da diagonal Principal
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (j > i) {
					soma += matQuadrada[i][j];
				}
			}
		}
		
		System.out.println(soma);
		
		
		
		
		
		sc.close();

	}

}
