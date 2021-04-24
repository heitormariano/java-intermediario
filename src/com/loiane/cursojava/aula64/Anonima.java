package com.loiane.cursojava.aula64;

public class Anonima {

	public void imprimeTexto() {
		System.out.println("Qualquer texto");
	}

	public static void main(String[] args) {
		Anonima anonima = new Anonima() {
			@Override
			public void imprimeTexto() {
				System.out.println("Qualquer texto sobrescrito");
			}
		};

		anonima.imprimeTexto();

		// usando interface (instanciando a interface)
		Texto texto = new Texto() {

			@Override
			public void imprimeTexto() {
				System.out.println("Qualquer texto - Interface");

			}
		};

		texto.imprimeTexto();
	}
}
