package com.loiane.cursojava.aula53;

public class Teste {

	public static void main(String[] args) {
		usarContantes();
		usarEnum();
	}

	private static void usarContantes() {

		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;

		int[] dias = new int[] { segunda, terca, quarta, quinta, sexta, sabado, domingo };

		System.out.println("Imprimindo dias da semana[Constantes]:");
		for (int i = 0; i < dias.length; i++) {
			imprimirDiaSemana(dias[i]);
		}
		System.out.println();
	}

	private static void usarEnum() {
		System.out.println("Imprimindo dias da semana[Enum]");
		DiaSemana[] dias = DiaSemana.values();
		for (int i = 0; i < dias.length; i++) {
			imprimirDiaSemana(dias[i]);
		}
		System.out.println();
	}

	private static void imprimirDiaSemana(int dia) {
		switch (dia) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terça-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		}
	}

	private static void imprimirDiaSemana(DiaSemana dia) {
		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("Terça-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("Sábado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;
		}
	}
}
