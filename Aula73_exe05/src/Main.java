import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] mat1 = new int[M][N];
		int[][] mat2 = new int[M][N];
		int[][] mat3 = new int[M][N];
		
		//Leitura da matriz 1
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}
		
		//Leitura da matriz2
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		
		//Soma dos elementos matriz1 e matriz2, inserindo todos na matriz3
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mat3[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		
		//Imprimindo a matriz3
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mat3[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
