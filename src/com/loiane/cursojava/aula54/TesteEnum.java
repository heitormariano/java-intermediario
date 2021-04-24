package com.loiane.cursojava.aula54;

import com.loiane.cursojava.aula54.Formulario.Genero;

public class TesteEnum {

	public static void main(String[] args) {
		DiaSemana diaSemana = DiaSemana.SEGUNDA;
		System.out.println(diaSemana);
		System.out.println(diaSemana.getValor());

		Data data = new Data(30, 5, 2017, DiaSemana.TERCA);
		System.out.println(data.getDiaSemana());
		System.out.println(data.getDiaSemana().getValor());

		Formulario formulario = new Formulario();
		formulario.setNome("Joao da Silva");
		formulario.setGenero(Genero.MASCULINO);

		System.out.println("Formul�rio");
		System.out.println("Nome: " + formulario.getNome());
		System.out.println("G�nero: " + formulario.getGenero());
		System.out.println("G�nero[valor]: " + formulario.getGenero().getValor());
		System.out.println("G�nero[valor convertido]: " + (char) formulario.getGenero().getValor());
	}
}
