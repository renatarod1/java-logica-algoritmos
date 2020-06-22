package processamento;

public class Processamento {

	public static void main(String[] args) {
		
		//Exemplo1
		/*
		int x, y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		*/
		
		//Exemplo2
		/*
		int x;
		double y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		*/
		
		//Exemplo3
		/*
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		*/
		
		//Exemplo4
		/*
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		//resultado = a/b; //Expressao com dois números inteiros
		//Apresenta como resultado = 2.0
		//O compilador da resultado inteiro ele trunca o resultado
		//para fazer com que ele apresente o resultado sem truncar
		//Realizamos um casting
		resultado = (double) a/b; //Agora o resultado é 2.5
		
		System.out.println(resultado);
		*/
		
		//Exemplo5 - passando valores de tipos diferentes
		double a;
		int b;
		
		a = 5.0;
		//b = a; temos que realizar um cast para int senao apresenta erro
		b = (int) a;
		
		System.out.println(b);
	}

}
