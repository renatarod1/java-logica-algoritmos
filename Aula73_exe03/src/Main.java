import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Lendo a qtd de elementos da matriz
		int N = sc.nextInt();
		
		//Criação da matriz
		int[][] matQuadrada = new int[N][N];
		
		//Lendo a matriz
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matQuadrada[i][j] = sc.nextInt();
			}
		}
				
		//Mostrando qual o maior elemento de cada linha da Matriz
		for (int i = 0; i < N; i++) {
			int maiorElemento = 0;
			for (int j = 0; j < N; j++) {
				if (matQuadrada[i][j] > maiorElemento) {
					maiorElemento = matQuadrada[i][j]; 
				}				
			}
			System.out.println(maiorElemento);
		}
		
		sc.close();
	}

}
