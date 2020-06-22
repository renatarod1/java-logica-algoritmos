import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// Imprimindo um texto qualquer na tela
		System.out.print("Olá Mundo!"); //print não faz quebra de linha
		System.out.println("Bom dia!"); //println faz a quebra
		System.out.print("Tudo Bem!");
		
		//Imprimir conteudo de alguma variável de tipo básico
		int y = 32;
		System.out.println(y);
		
		//Imprimir o conteúdo de uma variável com ponto flutuante
		double x = 10.35784;
		System.out.println(x);
		
		//Imprimir definindo a formatação de casa decimais
		System.out.printf("%.2f%n", x); //Em "%.2f" define-se a qtd de casas decimais, "/n" ou "%n" faz a quebra de linha/ tbm fez arredondamento
		System.out.printf("%.4f%n", x); //Com 4 casas decimais - usa a virgula pois pega a formatação do computador o qual está sendo usado
		
		//A lingua portuguesa usa como separador de decimais a virgula - Para mudar e usar o separador de decimais dos USA Usamos:
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		//Concatenar
		System.out.println("Resultado = "+ x + " metros");
		
		//Concatenar - usando o printf
		System.out.printf("Resultado = %.2f metros%n", x); //%n faz a quebra de linha
		
		//Concatenar - usando o printf - print com formatacao
		//Varios elementos de tipos diferentes
		//%f = ponto flutuante - %d = inteiro - %s = texto %n = quebra de linha
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos ganha R$ %.2f reais%n", nome, idade, renda);
				
		
		
	}

}
