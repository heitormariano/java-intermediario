package com.loiane.cursojava.aula54;

public class Formulario {

	enum Genero {
		MASCULINO('M'), FEMININO('F');

		private char valor;

		Genero(char valor) {
			this.valor = valor;
		}

		public int getValor() {
			return this.valor;
		}
	}

	private String nome;
	private Genero genero;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
}
