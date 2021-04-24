package com.loiane.cursojava.aula62;

public class ExemploVarargs {

	public static void main(String[] args) {

		System.out.println("Soma:" + soma(2, 5));

		System.out.println("Soma:" + soma(5, 10, 15));

		int[] vetor = { 10, 20, 30, 40, 50 };
		System.out.println("Soma:" + soma(vetor));

		System.out.println("Soma [com Varargs]: " + somaVarargs(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		System.out.println("Soma [com Varargs]: " + somaVarargsDois(50, 50, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}

	static int soma(int a, int b) {
		return a + b;
	}

	static int soma(int a, int b, int c) {
		return a + b + c;
	}

	static int soma(int[] vetor) {
		int total = 0;

		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}

		return total;
	}
	
	// Varargs - Observações
	// 1 - É um recurso para permitir o uso de uma quantidade indefinida de argumentos
	// 2 - Seu uso está associado com classes (Objetos). Pode ser visto como um argumento especial (argumento de certo objeto) 
	// 3 - Caso o método tenha mais de um argumento, o Varargs deve ser aplicado por último
	// 4 - É tratado como uma espécie de "vetor" de elementos
	
	static int somaVarargs(Integer... elementos) {
		int total = 0;

		for (int i = 0; i < elementos.length; i++) {
			total += elementos[i];
		}

		return total;
	}

	static int somaVarargsDois(int a, int b, Integer... elementos) {
		int total = a + b;

		for (int i = 0; i < elementos.length; i++) {
			total += elementos[i];
		}

		return total;
	}
}
