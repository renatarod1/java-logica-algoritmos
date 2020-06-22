package leitura;

import java.util.Locale;
import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		//Lendo uma palavra
		/*Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next(); //Para o programa e aguarda a digitação
		
		System.out.println("Você digitou: "+ x);
		
		//Fecha o recurso Scanner
		sc.close();
		*/
		
		
		//Lendo um valor inteiro
		/*Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt(); //Para o programa e aguarda a digitação
		
		System.out.println("Você digitou: "+ x);
		
		//Fecha o recurso Scanner
		sc.close();*/
		
		
		
		//Lendo um valor com ponto flutuante
		
		//Para ler e imprimir com ponto separando as casa decimais
		//Antes do obj Scanner defina a Localidade
		/*Locale.setDefault(Locale.US);		
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		//Obs: digitar com virgula - pois é o Locale do PC atual senão
		//Gera erro
		x = sc.nextDouble(); //Para o programa e aguarda a digitação
		
		System.out.println("Você digitou: "+ x); //Pega a localidade independente US
		
		//Para imprimir com a virgula use printf
		System.out.printf("Você digitou: %.2f%n", x);
		
		
		//Fecha o recurso Scanner
		sc.close();*/
		
		
		//Lendo um caracter
		/*Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next().charAt(0); //.charAt(0) - pega o primeiro caracter de uma string
		
		System.out.println("Você digitou: "+ x);
		
		//Fecha o recurso Scanner
		sc.close();*/
		
		//Lendo vários dados ao mesmo tempo
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next(); //Lê a String
		y = sc.nextInt(); //Lê o inteiro
		z = sc.nextDouble(); //Lê o double
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		//Fecha o recurso Scanner
		sc.close();
		
	}

}
