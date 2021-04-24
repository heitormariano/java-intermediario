package com.loiane.cursojava.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {
		System.out.printf("Hello %s", "World");
		System.out.printf("%n"); // quebra de linha

		System.out.printf("%s", "muito bom!");
		System.out.printf("%n");

		System.out.printf("%S", "letras grandes");
		System.out.printf("%n");

		System.out.printf("%c", 'b');
		System.out.printf("%n");

		System.out.printf("%C", 'b');
		System.out.printf("%n");

		int valor = 123456;
		System.out.printf("Valor: %d (Inteiro)", valor);

		System.out.println();

		double pontoFlutuante = 3.1456789;
		System.out.printf("Valor: %f (Ponto Flutuante)", pontoFlutuante);

		System.out.println();

		String olaGalera = "olá, Galera!";
		System.out.printf("%20s", olaGalera);
		System.out.println();
		System.out.printf("%-20s", olaGalera);

		System.out.println();

		int valor2 = 300;
		System.out.printf("%+d", valor2);

		System.out.println();

		int valor3 = -200;
		System.out.printf("%+d", valor3);
		
		System.out.println();
		
		int valor4 = 256878;
		System.out.printf("%015d", valor4); // número terá 15 dígitos (o que faltar para completar é usado 0)
		System.out.println(); 
		
		System.out.printf("%,d", valor4);
		System.out.println(); 
		
		int valor5 = -500689;
		System.out.printf("% d", valor5);
		System.out.println();
		System.out.printf("% d", valor4);
		System.out.println();
		
		System.out.printf("%.3f", pontoFlutuante);
		System.out.println();
		
		System.out.printf("R$%10.2f", pontoFlutuante);
		System.out.println();

		testeMaisCompleto();
	}
	
	private static void testeMaisCompleto() {

		double[] precos = { 10000, 123.54, 7843.567, 1, 4.56789 };

		for (int i = 0; i < precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i + 1, precos[i]);
		}
	}
}
