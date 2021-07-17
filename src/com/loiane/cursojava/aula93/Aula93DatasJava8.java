package com.loiane.cursojava.aula93;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Set;

public class Aula93DatasJava8 {

	public static void main(String[] args) {
		// API do java 8 foi baseada na biblioteca Joda-Time

		// data
		LocalDate agora = LocalDate.now();
		System.out.println(agora);

		// passando ano, mês e dia
		LocalDate dataTeste = LocalDate.of(2021, 4, 30);
		System.out.println(dataTeste);

		// passando string no formato esperado
		System.out.println(LocalDate.parse("2018-11-04"));

		// aumentando em 30 dias a data "corrente"
		System.out.println(agora.plusDays(30));

		// diminuindo em um mês a data "corrente"
		// indicando quantidade e unidade (ano, mês, dia, etc)
		System.out.println(agora.minus(1, ChronoUnit.MONTHS));

		// saber dia da semana
		System.out.println(agora.getDayOfWeek());

		// saber dia do mês
		System.out.println(agora.getDayOfMonth());

		// saber dia do ano (considera o primeiro dia do ano até o momento)
		System.out.println(agora.getDayOfYear());

		// saber se estamos em ano bissexto
		System.out.println("Ano Bissexto? " + agora.isLeapYear());

		// verificando ano de 2020
		System.out.println("Ano Bissexto? " + LocalDate.parse("2020-04-30").isLeapYear());

		// usando LocalTime
		LocalTime hAtual = LocalTime.now();
		System.out.println("Hora atual: " + hAtual);

		System.out.println(LocalTime.of(20, 35));
		System.out.println(hAtual.plusMinutes(50));
		System.out.println(hAtual.minusMinutes(10));

		System.out.println(hAtual.getHour());
		System.out.println(hAtual.getMinute());

		System.out.println(LocalTime.parse("23:18"));
		System.out.println(LocalTime.parse("23:18").minus(15, ChronoUnit.MINUTES));

		// data/hora completa
		LocalDateTime dataHoraCompleta = LocalDateTime.now();
		System.out.println(dataHoraCompleta);

		System.out.println(LocalDateTime.of(2031, 12, 10, 13, 25, 30));
		System.out.println(LocalDateTime.parse("2022-11-05T14:30:00"));

		// acrescentando dois anos a data-hora atual
		System.out.println(dataHoraCompleta.plusYears(2));

		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);

		Set<String> fusos = ZoneId.getAvailableZoneIds();

		System.out.println("Fusos:");
		for (String f : fusos) {
			System.out.println(f);
		}

		ZoneId london = ZoneId.of("Europe/London");
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2021-02-10T14:30:00"), london);
		System.out.println(zdt);

		System.out.println(ZonedDateTime.parse("2021-02-10T14:30Z[Europe/London]"));

	}
}
