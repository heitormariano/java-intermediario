package com.loiane.cursojava.aula66;

import com.loiane.cursojava.aula61.Contato;

public class ColetorLixo {

	public static int obterMemoriaUsada() {
		// 1024 KB * 1024 KB = 1024 MB
		final int MB = 1024 * 1024;

		Runtime runtime = Runtime.getRuntime(); // singleton
		int memoriaUsada = (int) ((runtime.totalMemory() - runtime.freeMemory()) / MB);

		return memoriaUsada;
	}

	public static void main(String[] args) {
		Contato[] contatos = new Contato[100_000];
		Contato contato;

		for (int i = 0; i < contatos.length; i++) {
			contato = new Contato("Contato" + i, "3234-1234" + i, "contato" + i + "@teste.com");
			contatos[i] = contato;
		}

		System.out.println("Contatos Criados");

		System.out.println(obterMemoriaUsada() + " MB");

		contatos = null;

		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc();

		System.out.println("Contatos removidos da memória");

		System.out.println(obterMemoriaUsada() + " MB");
	}
}
