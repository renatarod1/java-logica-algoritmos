import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(); //qtd Linhas
		int N = sc.nextInt(); //qtd Colunas
		
		int[][] matriz = new int[M][N];
		
		//Salvando os dados na Matriz
		for (int i = 0; i < M; i++) {//loop linha
			for (int j = 0; j < N; j++) { //loop coluna
				matriz[i][j] = sc.nextInt();
			}
		}
		
		//Percorrendo e imprimindo os dados da Matriz
		for (int i = 0; i < M; i++) {//loop linha
			for (int j = 0; j < N; j++) { //loop coluna
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();

	}

}
