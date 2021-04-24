package com.loiane.cursojava.aula60;

public class EscopoVariaveis {

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int calcularValor(int valor) {
		valor = valor + 10;
		return valor;
	}

	public int testeDecremento() {
		int valor = 5;

		if (true) {
			valor--;
		}

		return valor;
	}

	public void testeFor() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		// i++; //erro de compila��o
	}

	public void testeForDois() {
		int j;
		for (j = 0; j < 10; j++) {
			System.out.println();
		}

		System.out.println(j);
	}

	public void acessoVariavel() {
		boolean flag = true;

		if (flag) {
			int umaVariavel = 10;
			umaVariavel++;
			System.out.println(umaVariavel);
		}

		// System.out.println(umaVariavel); // erro de compila��o
	}

	public void acessoVariavelDois(int numero) {
		int total = 0;

		try {
			int outroNumero = 0;
			total = numero / outroNumero; // divis�o proposital por zero

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			total++;
			// outroNumero++; // erro de compila��o
			// e.printStackTrace(); // erro de compila��o
		}
		numero++;

		// outroNumero++ // erro de compila��o
		// e.printStackTrace(); // erro de compila��o
	}
}
