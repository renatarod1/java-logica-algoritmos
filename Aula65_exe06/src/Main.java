import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		int maiorIdade = 0;
		int maiorPosicao = 0;
		
		for (int i = 0; i < n; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				maiorPosicao = i;
			}
		}
		
		System.out.println("Pessoa mais velha: "+ nomes[maiorPosicao]);
		sc.close();
	}

}
