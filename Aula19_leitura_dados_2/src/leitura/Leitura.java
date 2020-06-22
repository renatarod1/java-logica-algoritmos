package leitura;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		//Lê o texto até a quebra de linha
		/*Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);*/
		
		
		//Quebra de linha pendente
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt(); 
		sc.nextLine(); //Consome a quebra de linha pendente
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
