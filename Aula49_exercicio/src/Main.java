import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int n = sc.nextInt();
		
		//Estrutura PARA
		//Aqui voc� sabe a qtd de repeti��es	 	
		for (int i = 0; i < n; i++) {
			int numLido = sc.nextInt();
			soma += numLido;			
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
