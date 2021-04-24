package com.loiane.cursojava.diversos;

import java.util.Arrays;
import java.util.List;

import com.loiane.cursojava.diversos.Nerd.GrauEscolaridade;

public class TesteNerd {

	public static void main(String[] args) {
		Nerd nerd1 = new Nerd();
		nerd1.setNome("João");
		nerd1.setEscolaridade(GrauEscolaridade.MESTRE);

		System.out.println("Dados do Nerd 1:");
		System.out.println("Nome: " + nerd1.getNome());
		System.out.println("Grau Escolaridade: " + nerd1.getEscolaridade());
		System.out.println("Sigla Escolaridade: " + nerd1.getEscolaridade().getSigla());
		System.out.println();

		Nerd nerd2 = new Nerd("Lucas", GrauEscolaridade.GRADUADO);
		System.out.println("Dados do Nerd 2:");
		System.out.println(nerd2.toString());
		System.out.println();

		// criar uma lista a partir dos elementos de um array
		List<GrauEscolaridade> escolaridades = Arrays.asList(GrauEscolaridade.values());

		System.out.println("Escolaridades da Enum:");
		for (GrauEscolaridade grau : escolaridades) {
			System.out.println(grau);
		}
	}
}
