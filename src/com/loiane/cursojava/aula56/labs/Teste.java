package com.loiane.cursojava.aula56.labs;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao = -1;

		do {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Realizar operação da Calculadora:");
			System.out.println("0 - Finalizar Programa");

			opcao = scan.nextInt();

			if (opcao == 0 || opcao == 1) {
				switch (opcao) {
				case 0:
					System.out.println("Fim do Programa");
					break;
				case 1:
					System.out.println("Informe um símbolo:");
					System.out.println("SOMA = +");
					System.out.println("SUBTRACAO = -");
					System.out.println("MULTIPLICACAO = *");
					System.out.println("DIVISAO = /");

					String simboloInfo = scan.next();

					int tamTexto = simboloInfo.length();

					if (tamTexto == 1) {
						char simbolo = simboloInfo.charAt(0);

						if (simbolo == '+' || simbolo == '-' || simbolo == '*' || simbolo == '/') {

							System.out.println("Informe os dois valores para a operacao:");
							System.out.println("Número 1: ");
							double num1 = scan.nextDouble();

							System.out.println("Número 2: ");
							double num2 = scan.nextDouble();

							double resultado = 0;
							String operacao = "";

							if (simbolo == '+') {
								resultado = Calculadora.SOMA.executarOperacao(num1, num2);
								operacao = Calculadora.SOMA.toString();
							} else if (simbolo == '-') {
								resultado = Calculadora.SUBTRACAO.executarOperacao(num1, num2);
								operacao = Calculadora.SUBTRACAO.toString();
							} else if (simbolo == '*') {
								resultado = Calculadora.MULTIPLICACAO.executarOperacao(num1, num2);
								operacao = Calculadora.MULTIPLICACAO.toString();
							} else if (simbolo == '/') {
								resultado = Calculadora.DIVISAO.executarOperacao(num1, num2);
								operacao = Calculadora.DIVISAO.toString();
							}

							System.out.println("Resultado da operação:");
							System.out.println(num1 + " " + operacao + " " + num2 + " = " + resultado);
						} else {
							System.out.println("Opção inválida. Digite Novamente.");
						}
					} else {
						System.out.println("Número de caracteres maior que o esperado. Digite Novamente");
					}
					break;
				}

			} else {
				System.out.println("Opção inválida. Digite novamente.");
			}
		} while (opcao != 0);
	}
}
