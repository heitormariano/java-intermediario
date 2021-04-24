package com.loiane.cursojava.aula60;

public class Teste {

	public static void main(String[] args) {
		EscopoVariaveis escopo = new EscopoVariaveis();
		escopo.setValor(10);

		System.out.println(escopo.getValor());
		System.out.println(escopo.calcularValor(20));
		System.out.println(escopo.getValor());
		System.out.println(escopo.testeDecremento());
		System.out.println(escopo.getValor());

		System.out.println("Testes diversos");
		escopo.testeFor();
		System.out.println();
		escopo.acessoVariavel();

		System.out.println("Gerando exceção");
		escopo.acessoVariavelDois(20);
	}
}
