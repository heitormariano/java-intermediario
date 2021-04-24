package com.loiane.cursojava.aula88;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88GregorianCalendar {
	public static void main(String[] args) {

		GregorianCalendar gc = new GregorianCalendar();
		// System.out.println(hoje);

		// saber se um determinado ano é um ano bissexto
		boolean result2016 = gc.isLeapYear(2016);
		boolean result2017 = gc.isLeapYear(2017);
		boolean result2020 = gc.isLeapYear(2020);

		System.out.println("2016 é ano bissexto? " + result2016);
		System.out.println("2017 é ano bissexto? " + result2017);
		System.out.println("2020 é ano bissexto? " + result2020);

		// crianddo uma data específica.
		// data escolhida: 20/01/2017
		GregorianCalendar gc2 = new GregorianCalendar(2017, 0, 20);
		imprimirData(gc2);

		// crianddo uma data específica (com hora, minutos e segundos).
		// data escolhida: 30/04/2017 23:04:28
		GregorianCalendar gc3 = new GregorianCalendar(2017, 3, 30, 23, 4, 28);
		imprimirData(gc3);
	}

	private static void imprimirData(Calendar data) {
		int dia = data.get(Calendar.DAY_OF_MONTH);
		int mes = data.get(Calendar.MONTH);
		int ano = data.get(Calendar.YEAR);

		int hora = data.get(Calendar.HOUR_OF_DAY);
		int minutos = data.get(Calendar.MINUTE);
		int segundos = data.get(Calendar.SECOND);

		System.out.printf("Hoje é: %02d/%02d/%02d %02d:%02d:%02d", dia, (mes + 1), ano, hora, minutos, segundos);
		System.out.println();
	}
}
