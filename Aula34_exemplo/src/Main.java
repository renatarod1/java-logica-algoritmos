import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		int x = 5;
		
		//Estrutura condicional composta
		//Regra - Se V, executa somente o bloco if
		//Se F, executa somente o bloco else
		if (x == 5) {
			System.out.println("Bom dia");
		} else {
			System.out.println("Boa noite");
		}
		
		
		//Estrutura condicional simples
		//Regra - Executa caso seja verdadeiro - não executa caso falso
		if (x < 0) {
			System.out.println("Boa tarde");
		}*/
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia");
		} else if (hora < 18){
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
		
		sc.close();
		
	}

}
