package com.loiane.cursojava.diversos;

public enum DiaSemanaEnum {

	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

	private int valor;

	DiaSemanaEnum(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
}
