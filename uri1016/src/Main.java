import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dist, totalMinutos;
		
		dist = sc.nextInt();
		
		totalMinutos = dist * 2;
		System.out.println(totalMinutos + " minutos");
		
		sc.close();
	}
}
