import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] mercadorias = new String[n];
		double[] compra = new double[n];
		double[] venda = new double[n];
		double[] lucro = new double[n];
		int lucromenor10 = 0;
		int lucroentre10e20 = 0;
		int lucromaior20 = 0;
		double totCompra = 0.0;
		double totVenda = 0.0;
		double lucroTot = 0.0;
		
		
		for (int i = 0; i < n; i++) {
			mercadorias[i] = sc.next();
			compra[i] = sc.nextDouble();
			venda[i] = sc.nextDouble();
		}
			
		for (int i = 0; i < n; i++) {			
			lucro[i] = venda[i] - compra[i];
			
			double percLucro = lucro[i] / compra[i] * 100.0;
			
			if (percLucro < 10.0) {
				lucromenor10++;
			} else if (percLucro >= 10.0 && percLucro <= 20.0) {
				lucroentre10e20++;
			} else {
				lucromaior20++;
			}			
		}
		
		System.out.println("Lucro abaixo de 10%: "+lucromenor10);
		System.out.println("Lucro entre 10% e 20%: "+lucroentre10e20);
		System.out.println("Lucro acima de 20%: "+lucromaior20);

		for (int i = 0; i < n; i++) {
			totCompra += compra[i];
			totVenda += venda[i];
			lucroTot += lucro[i];
		}
		
		System.out.printf("Valor total de compra: %.2f%n", totCompra);
		System.out.printf("Valor total de venda: %.2f%n", totVenda);
		System.out.printf("Lucro total: %.2f%n", lucroTot);
		
		sc.close();
	}

}
