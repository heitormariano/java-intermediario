package com.loiane.cursojava.aula83;

public class Aula83 {

	public static void main(String[] args) {
		String[] letras = { "A", "B", "C", "D", "E" };
		String alfabeto = "";

		// concatenação menos performática
		for (String letra : letras) {
			alfabeto += letra;
		}
		System.out.println("Forma 1: " + alfabeto);

		// concatenação com StringBuffer (Thread safe)
		StringBuffer sBuffer = new StringBuffer();
		for (String letra : letras) {
			sBuffer.append(letra);
		}
		System.out.println("Forma 2 [StringBuffer]: " + sBuffer);

		alfabeto = sBuffer.toString();
		System.out.println(alfabeto);

		alfabeto = new String(sBuffer);
		System.out.println(alfabeto);

		// concatenacao com StringBuilder
		StringBuilder sBuilder = new StringBuilder();
		for (String letra : letras) {
			sBuilder.append(letra);
		}
		alfabeto = sBuilder.toString();
		System.out.println("Forma 3 [StringBuilder]: " + alfabeto);
	}
}
