import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempoGasto, velocidadeMedia, distancia;
		double totalLitros;
		
		tempoGasto = sc.nextInt();
		velocidadeMedia = sc.nextInt();
		
		distancia = tempoGasto * velocidadeMedia;
		totalLitros = (double) distancia / 12;
		
		System.out.printf("%.3f%n", totalLitros);
		sc.close();
	}

}
