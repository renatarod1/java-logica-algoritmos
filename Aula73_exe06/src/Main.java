import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[][] matQuadrada = new double[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matQuadrada[i][j] = sc.nextDouble();
			}
		}
		
		//Soma dos elementos positivos da matriz
		double soma = 0.0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (matQuadrada[i][j] > 0) {
					soma += matQuadrada[i][j];
				}
			}
		}
		System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);
		
		//Fazer a leitura de um indice de uma linha da matriz
		//Imprimir todos os elementos dessa linha
		int L = sc.nextInt();
		System.out.print("LINHA ESCOLHIDA: ");		
		for (int i = 0; i < N; i++) {
			if (i == L) {
				for (int j = 0; j < N; j++) {
					System.out.printf("%.1f ",matQuadrada[i][j]);				
				}
				System.out.println();
			}
			
		}
		
		//Leitura de um índice de uma coluna
		//Imprimir todos os elementos da coluna
		int C = sc.nextInt();
		System.out.print("COLUNA ESCOLHIDA: ");		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (j == C) {
					System.out.printf("%.1f ",matQuadrada[i][j]);				
				}				
			}			
		}
		System.out.println();
		
		//Imprimir diagonal principal
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < N; i++) {
			System.out.printf("%.1f ", matQuadrada[i][i]);;
		}
		System.out.println();
		
		//Matriz Alterada 
		//Onde os numeros negativos são elevados ao quadrado
		System.out.println("MATRIZ ALTERADA:");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (matQuadrada[i][j] < 0) {
					System.out.printf("%.1f ", Math.pow(matQuadrada[i][j], 2));
				} else {
					System.out.printf("%.1f ", matQuadrada[i][j]);
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
