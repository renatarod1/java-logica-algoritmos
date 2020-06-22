import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] nomes = new String[n];
		
		for (int i = 0; i < n; i++) {
			nomes[i] = sc.next();
		}
		
		//Usando a estrutura PARA para imprimir os nomes (FOR)
		/*
		 *for (int i = 0; i < n; i++) {
		 *	System.out.println(nomes[i]);
		 *}
		 */
		
		//Usando a estrutura PARA CADA - (FOREACH)
		System.out.println("Nomes lidos:");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		
		sc.close();

	}

}
