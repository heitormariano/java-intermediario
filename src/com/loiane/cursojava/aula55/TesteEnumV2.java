package com.loiane.cursojava.aula55;

import com.loiane.cursojava.aula53.DiaSemana;

public class TesteEnumV2 {

	public static void main(String[] args) {
		System.out.println(Enum.valueOf(DiaSemana.class, "SEGUNDA"));

		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
		System.out.println(dia);

		DiaSemana dia2 = DiaSemana.valueOf(DiaSemana.class, "SABADO");
		System.out.println(dia2);

		//ocorre uma exceção (java.lang.IllegalArgumentException) com o código abaixo
		//DiaSemana dia3 = DiaSemana.valueOf(DiaSemana.class, "TESTE");
		//System.out.println(dia3);

		DiaSemana dia4 = DiaSemana.valueOf("QUINTA");
		System.out.println(dia4);
	}
}
