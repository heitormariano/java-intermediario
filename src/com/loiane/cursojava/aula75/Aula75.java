package com.loiane.cursojava.aula75;

public class Aula75 {

	public static void main(String[] args) {
		//string vazia
		String vazia = new String();
		System.out.println(vazia);
		
		String java = new String("JAVA");
		System.out.println(java);
		
		String java1 = new String(java);
		System.out.println(java1);
		
		char[] charsJava = new char[]{'J','A','V', 'A'};
		String java2 = new String(charsJava);
		System.out.println(java2);
		
		char[] charsCpp = {'C','+','+'};
		String cpp = new String(charsCpp);
		System.out.println(cpp);
		
		char[] letras = {'A','B','C','D','E'};
		String parteLetras = new String(letras,0,3);
		System.out.println(parteLetras);
		
		byte[] ascii = {65,66,67,68,69};
		String asciiLetras = new String (ascii);
		System.out.println(asciiLetras);
		
		String parteLetrasAscii = new String(ascii,1,3);
		System.out.println(parteLetrasAscii);
		String java3 = "JAVA";
		String Java4 = "JAVA";
		
		System.out.println(java3);
		System.out.println(Java4);
	}
}
