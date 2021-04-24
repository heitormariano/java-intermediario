package com.loiane.cursojava.aula82;

import java.util.Arrays;

public class Aula82 {

	public static void main(String[] args) {
		String alfabeto = String.join(",", "A, B, C, D");
		System.out.println(alfabeto);

		String[] letras = alfabeto.split(", "); // considerar o espaço depios da vírgula
		for (String letra : letras) {
			System.out.println(letra);
		}
		
		String doArquivo = "1;Antônio;30;";
		String[] infos = doArquivo.split(";");
		Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
		System.out.println(pessoa);
		
		String doArquivo2 = "2;Marcos;28;";
		String[] infos2 = doArquivo2.split(";");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setCod(Integer.parseInt(infos2[0]));
		pessoa2.setNome(infos2[1]);
		pessoa2.setIdade(Integer.parseInt(infos2[2]));
		System.out.println(pessoa2);

	}
}
