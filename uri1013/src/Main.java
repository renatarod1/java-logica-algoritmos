import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int D = (A + B + Math.abs(A - B)) / 2;
		int E = (D + C + Math.abs(D - C)) / 2;
		
		System.out.println(E + " eh o maior");
		
		sc.close();
	}

}
