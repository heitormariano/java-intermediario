package com.loiane.cursojava.diversos;

import java.util.Scanner;

public class MediaTeste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean fim = false;

		do {
			System.out.println("Escolha uma das opções a seguir:");
			System.out.println("1 - Calcular media simples");
			System.out.println("2 - Calcular média ponderada");
			System.out.println("0 - Encerrar o programa");

			int opcao = scan.nextInt();

			double nota1, nota2, media;
			nota1 = nota2 = media = 0.0; //  Atribuição de um valor para diversas variáveis (demonstrando por curiosidade)

			switch (opcao) {
			case 0:
				fim = true;
				System.out.println("Programa finalizado.");
				break;
			case 1:
				System.out.println("Operação: Média Simples");

				System.out.println("Informe a nota 1");
				nota1 = scan.nextDouble();

				System.out.println("Informe a nota 2:");
				nota2 = scan.nextDouble();

				media = MediaNotas.SIMPLES.calcular(nota1, nota2);
				System.out.println("Média obtida: " + media);
				break;
			case 2:
				System.out.println("Operação: Média Ponderada");

				System.out.println("Informe a nota 1");
				nota1 = scan.nextDouble();

				System.out.println("Informe a nota 2:");
				nota2 = scan.nextDouble();

				media = MediaNotas.PONDERADA.calcular(nota1, nota2);
				System.out.println("Média obtida: " + media);
				break;
			default:
				System.out.println("Opção inválida. Digite Novamente");
				break;
			}

		} while (!fim);
	}
}
