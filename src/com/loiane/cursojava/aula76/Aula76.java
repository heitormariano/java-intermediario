package com.loiane.cursojava.aula76;

public class Aula76 {

	public static void main(String[] args) {
		String curso = "Curso ";
		String java = "JAva";
		String cursoJava = curso + java;

		System.out.println(cursoJava);

		String resultado = "Soma de 2 + 2 = " + (2 + 2);
		System.out.println(resultado);

		String resultado2 = "Soma de 2 + 2 = " + 2 + 2;
		System.out.println(resultado2);

		String dez = String.valueOf(10);
		if (dez instanceof String) {
			System.out.println("Variável dez é do tipo String");
		}
		System.out.println("Imprimindo variável dez: " + dez);

		String numString = String.valueOf(20.35);
		if (numString instanceof String) {
			System.out.println("Variável numString é do tipo String");
		}
		System.out.println("Imprimindo variável numString: " + numString);

		String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
				+ "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad "
				+ "minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea "
				+ "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit "
				+ "essecillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat "
				+ "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

		System.out.println(concatenacao);

		String concatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, ";
		concatenacao2 += "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad ";
		concatenacao2 += "minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea ";
		concatenacao2 += "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit ";
		concatenacao2 += "essecillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat ";
		concatenacao2 += "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

		System.out.println(concatenacao2);
	}
}
