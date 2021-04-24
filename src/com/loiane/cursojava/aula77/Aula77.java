package com.loiane.cursojava.aula77;

import java.util.Arrays;

public class Aula77 {

	public static void main(String[] args) {
		String java = "Java";

		for (int i = 0; i < java.length(); i++) {
			System.out.println(java.charAt(i));
		}

		char[] charsJav = new char[3];
		java.getChars(0, 3, charsJav, 0);
		System.out.println("Resultado depois do getChars: " + Arrays.toString(charsJav));

		// imprimindo cada letra do array charsJav
		for (char letra : charsJav) {
			System.out.println(letra);
		}

		// entendendo como funciona o método getChars
		for (int i = 0, j = 0; i < 3; i++, j++) {
			charsJav[j] = java.charAt(i);
		}

		System.out.println(charsJav);

		String python = "Python";
		char[] charsPython = new char[3];
		python.getChars(0, 3, charsPython, 0);
		System.out.println("Resultado depois do getChars: " + Arrays.toString(charsPython));

		byte[] bytesPython = new byte[4];
		python.getBytes(0, 4, bytesPython, 0);
		System.out.println("Resultado depois do getBytes[depreciado]: " + Arrays.toString(bytesPython));

		// percorrendo cada elemento do array de bytes
		for (int i = 0; i < 4; i++) {
			System.out.println((char) bytesPython[i] + " - " + bytesPython[i] + " [Ascii]");
		}

		String programcao = "Programacao";
		byte[] bytesProgramcao = new byte[4];
		programcao.getBytes(0, 4, bytesProgramcao, 0);
		System.out.println("Resultado depois do getBytes[depreciado]: " + Arrays.toString(bytesProgramcao));

		for (byte letra : bytesProgramcao) {
			System.out.println((char) letra + " - " + letra + " [Ascii]");
		}

		String palavra = "Massa";
		char[] letras = palavra.toCharArray();
		System.out.println(letras);
	}
}
