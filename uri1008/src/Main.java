import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFunc, horasTrab;
		double valorHoraTrab, salary;
		
		numFunc = sc.nextInt();
		horasTrab = sc.nextInt();
		valorHoraTrab = sc.nextDouble();
		salary = horasTrab * valorHoraTrab;
		
		System.out.println("NUMBER = "+ numFunc);
		System.out.printf("SALARY = U$ %.2f%n", salary);		
		
		sc.close();

	}

}
