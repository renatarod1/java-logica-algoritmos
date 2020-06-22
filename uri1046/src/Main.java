import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int duracao;
		
		int I = sc.nextInt();
		int F = sc.nextInt();
		
		if (I < F) {
			duracao = F - I;			
		} else {
			duracao = 24 - I + F;
		}
		
		System.out.println("O JOGO DUROU "+ duracao +" HORA(S)");		
		
		sc.close();

	}

}
