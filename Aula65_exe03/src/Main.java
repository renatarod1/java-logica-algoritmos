import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] vet1 = new int[n];
		int[] vet2 = new int[n];
		int[] vet3 = new int[n];
		
		for (int i = 0; i < n; i++) {
			vet1[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			vet2[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			vet3[i] = vet1[i] + vet2[i];
		}
		
		for (int soma : vet3) {
			System.out.print(soma + " ");
		}		
		sc.close();

	}

}
