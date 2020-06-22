import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] soldados = new int[M][N];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				soldados[i][j] = sc.nextInt();
			}
		}
		
		int fila = sc.nextInt();
		int ultimo = 0;
		for (int i = 0; i < M; i++) {
			for (int j = N - 1; j >= 0; j--) {
				if (j < 0) {
					break;
				} else {
					if (i == fila - 1) {
						if (j == N-1) {
							ultimo = soldados[i][j];
							soldados[i][j] = soldados[i][j - 1];
						} else if (j == 0) {
							soldados[i][j] = ultimo;
						} else {
							soldados[i][j] = soldados[i][j - 1];
						}
					}	
				}			
			}
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(soldados[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
