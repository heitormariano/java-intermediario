package com.loiane.cursojava.aula80;

public class Aula80 {

	public static void main(String[] args) {
		String teste = "Isso é um teste";
		System.out.println(teste);

		// substring
		System.out.println(teste.substring(10));
		System.out.println(teste.substring(5, 15));

		// concat
		String ola = "olá ";
		String mundo = "mundo!";
		String olaMundo = ola.concat(mundo); // ola + mundo
		System.out.println(olaMundo);

		// replace
		String trocar = "GrAnde DEus";
		System.out.println(trocar);
		String novoTexto = trocar.replace("A", "a").replace("E", "e");
		System.out.println(novoTexto);

		String espacos = "e s p a c o s";
		System.out.println(espacos);
		String semEspacos = espacos.replaceAll(" ", "");
		System.out.println(semEspacos);

		// trim
		String frease = "    Texto para novos testes    ";
		System.out.println(frease);
		System.out.println(frease.trim());

	}
}
