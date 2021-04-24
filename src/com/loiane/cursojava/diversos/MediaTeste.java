package com.loiane.cursojava.diversos;

import java.util.Scanner;

public class MediaTeste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean fim = false;

		do {
			System.out.println("Escolha uma das op��es a seguir:");
			System.out.println("1 - Calcular media simples");
			System.out.println("2 - Calcular m�dia ponderada");
			System.out.println("0 - Encerrar o programa");

			int opcao = scan.nextInt();

			double nota1, nota2, media;
			nota1 = nota2 = media = 0.0; //  Atribui��o de um valor para diversas vari�veis (demonstrando por curiosidade)

			switch (opcao) {
			case 0:
				fim = true;
				System.out.println("Programa finalizado.");
				break;
			case 1:
				System.out.println("Opera��o: M�dia Simples");

				System.out.println("Informe a nota 1");
				nota1 = scan.nextDouble();

				System.out.println("Informe a nota 2:");
				nota2 = scan.nextDouble();

				media = MediaNotas.SIMPLES.calcular(nota1, nota2);
				System.out.println("M�dia obtida: " + media);
				break;
			case 2:
				System.out.println("Opera��o: M�dia Ponderada");

				System.out.println("Informe a nota 1");
				nota1 = scan.nextDouble();

				System.out.println("Informe a nota 2:");
				nota2 = scan.nextDouble();

				media = MediaNotas.PONDERADA.calcular(nota1, nota2);
				System.out.println("M�dia obtida: " + media);
				break;
			default:
				System.out.println("Op��o inv�lida. Digite Novamente");
				break;
			}

		} while (!fim);
	}
}
