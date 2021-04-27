package com.loiane.cursojava.diversos;

public class TesteDiaSemanaV2 {

	public static void main(String[] args) {
		DiaSemanaEnum dia = DiaSemanaEnum.SEGUNDA;
		DiaSemanaEnum diaSeguinte = DiaSemanaEnum.TERCA;

		System.out.println(dia.toString() + " - " + dia.getValor());
		System.out.println(diaSeguinte.toString() + " - " + diaSeguinte.getValor());
	}

}
