package com.loiane.cursojava.diversos;

import java.util.Scanner;

public class EnumTeste {

	enum PecaXadrez {
		PEAO("Peão"), TORRE("Torre"), CAVALO("Cavalo"), BISPO("Bispo"), REI("Rei"), RAINHA("Rainha");

		private String nome;

		PecaXadrez(String nome) {
			this.nome = nome;
		}

		public String obterNome() {
			return this.nome;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bricando com Enum");
		System.out.println("Informe o nome de uma peça de Xadrez:");
		String peca = scanner.nextLine();

		if (buscarPeca(peca)) {
			System.out.println("Nome peça: " + peca + " [ presente no Xadrez ]");
		} else {
			System.out.println("Nome peça: " + peca + " [ Não existe no Xadrez]");
		}
	}

	public static boolean buscarPeca(String peca) {
		boolean resultado = false;
		for (PecaXadrez elem : PecaXadrez.values()) {
			if (elem.obterNome().equalsIgnoreCase(peca)) {
				resultado = true;
				break;
			}
		}
		return resultado;
	}
}
