package com.loiane.cursojava.aula81;

public class Aula81 {
	public static void main(String[] args) {
		String texto = "Texto de Teste";
		String textoMaiusc = texto.toUpperCase();
		System.out.println(textoMaiusc);

		String textoMinus = textoMaiusc.toLowerCase();
		System.out.println(textoMinus);

		// uma forma de comparação
		String nome1 = "Lucas";
		String nome2 = "LUCAS";
		if (nome1.toLowerCase().equals(nome2.toLowerCase())) {
			System.out.println("Mesmo nome!");
		}
	}

}
