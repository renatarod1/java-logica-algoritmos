import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v1, v2, PROD;
		
		v1 = sc.nextInt();
		v2 = sc.nextInt();
		
		PROD = v1 * v2;
		
		System.out.println("PROD = "+PROD);
		
		sc.close();
	}

}
