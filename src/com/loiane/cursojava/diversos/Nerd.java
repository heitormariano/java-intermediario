package com.loiane.cursojava.diversos;

public class Nerd {

	enum GrauEscolaridade {
		GRADUADO("G"), ESPECIALISTA("E"), MESTRE("M"), DOUTOR("D");

		private String sigla;

		GrauEscolaridade(String sigla) {
			this.sigla = sigla;
		}

		public String getSigla() {
			return this.sigla;
		}
	}

	private String nome;
	private GrauEscolaridade escolaridade;

	public Nerd() {

	}

	public Nerd(String nome, GrauEscolaridade escolaridade) {
		this.nome = nome;
		this.escolaridade = escolaridade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public GrauEscolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(GrauEscolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nerd [nome = " + nome);
		sb.append(", ");
		sb.append("Escolaridade = " + escolaridade);
		sb.append("]");

		return sb.toString();
	}

}
