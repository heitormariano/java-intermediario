package com.loiane.cursojava.diversos;

public class TesteDiaSemana {

	public static void main(String[] args) {
		System.out.println("Constantes");
		usarConstantes();
		
		System.out.println();
		
		System.out.println("Enum");
		usarEnum();
	}

	private static void usarConstantes() {
		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;

		int[] arrayDias = { segunda, terca, quarta, quinta, sexta, sabado, domingo };

		for (int i = 0; i < arrayDias.length; i++) {
			imprimirDiaSemana(arrayDias[i]);
		}

	}

	private static void usarEnum() {
		DiaSemanaEnum segunda = DiaSemanaEnum.SEGUNDA;
		DiaSemanaEnum terca = DiaSemanaEnum.TERCA;
		DiaSemanaEnum quarta = DiaSemanaEnum.QUARTA;
		DiaSemanaEnum quinta = DiaSemanaEnum.QUINTA;
		DiaSemanaEnum sexta = DiaSemanaEnum.SEXTA;
		DiaSemanaEnum sabado = DiaSemanaEnum.SABADO;
		DiaSemanaEnum domingo = DiaSemanaEnum.DOMINGO;

		DiaSemanaEnum[] arrayDias = { segunda, terca, quarta, quinta, sexta, sabado, domingo };

		for (DiaSemanaEnum dia : arrayDias) {
			imprimirDiaSemanaEnum(dia);
		}

	}

	private static void imprimirDiaSemana(int diaSemana) {
		switch (diaSemana) {
		case 1:
			System.out.println("Segunda-Feira");
			break;
		case 2:
			System.out.println("Terça-Feira");
			break;
		case 3:
			System.out.println("Quarta-Feira");
			break;
		case 4:
			System.out.println("Quinta-Feira");
			break;
		case 5:
			System.out.println("Sexta-Feira");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Dia inválido");
			break;
		}
	}

	private static void imprimirDiaSemanaEnum(DiaSemanaEnum diaSemana) {
		switch (diaSemana) {
		case SEGUNDA:
			System.out.println("Segunda-Feira");
			break;
		case TERCA:
			System.out.println("Terça-Feira");
			break;
		case QUARTA:
			System.out.println("Quarta-Feira");
			break;
		case QUINTA:
			System.out.println("Quinta-Feira");
			break;
		case SEXTA:
			System.out.println("Sexta-Feira");
			break;
		case SABADO:
			System.out.println("Sábado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Dia inválido");
			break;
		}
	}
}
