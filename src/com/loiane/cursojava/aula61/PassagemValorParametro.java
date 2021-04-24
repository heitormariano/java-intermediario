package com.loiane.cursojava.aula61;

public class PassagemValorParametro {

	public static void main(String[] args) {
		Contato contato = new Contato("Contato 1", "1020-3040", "contato1@teste.com");
		int valor = 10;
		
		System.out.println("******** Valores Originais ********");
		
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("******** Exemplo 1 ********");
		testePassagemValorReferencia(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("******** Exemplo 2 ********");
		testePassagemValorReferenciaDois(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);
		
	}
	
	private static void testePassagemValorReferencia(int valor, Contato contato){
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato = new Contato("Contato 2", "2345-5060", "contato2@teste.com");
	}
	
	private static void testePassagemValorReferenciaDois(int valor, Contato contato) {
		int novoValor = valor + 10;
		valor = novoValor;

		contato.setNome("Contato" + valor);
	}
}
