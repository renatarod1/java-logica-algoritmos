import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] mat = new int[N][N];
		
		//Leitura dos elementos da Matriz
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt(); 
			}
		}
		
		//Soma de cada linha da matriz
		for (int i =0; i < N; i++) {
			int soma = 0;
			for (int j = 0; j < N; j++) {
				soma += mat[i][j];				
			}
			System.out.println(soma);
		}
		
		sc.close();
	}

}
