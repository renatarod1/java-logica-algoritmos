import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(N / 365 + " ano(s)");
		
		N = N % 365;
		
		System.out.println(N / 30 + " mes(es)");
		
		N = N % 30;
		
		System.out.println(N + " dia(s)");
				
		sc.close();
	}

}
