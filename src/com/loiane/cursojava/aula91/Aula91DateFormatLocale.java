package com.loiane.cursojava.aula91;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormatLocale {

	public static void main(String[] args) {
		Date dataHoje = new Date();
		System.out.println(dataHoje);

		Locale locale = Locale.getDefault();
		System.out.println("Locale padrão: " + locale);

		String hojeFormatado = DateFormat.getInstance().format(dataHoje);
		System.out.println(hojeFormatado);

		Locale locale_en_US = new Locale("en", "US");
		Locale.setDefault(locale_en_US);

		System.out.println("Após a mudança do Locale: " + Locale.getDefault());

		String hojeFormatado_en_US = DateFormat.getInstance().format(dataHoje);
		System.out.println("Data Formatada - en (US): " + hojeFormatado_en_US);

		String hojeFormatado_TimeInstance = DateFormat.getTimeInstance().format(dataHoje);
		System.out.println(hojeFormatado_TimeInstance);

		hojeFormatado_TimeInstance = DateFormat.getTimeInstance(DateFormat.SHORT).format(dataHoje);
		System.out.println(hojeFormatado_TimeInstance);

		Locale.setDefault(new Locale("pt", "BR"));
		System.out.println(Locale.getDefault());

		hojeFormatado_TimeInstance = DateFormat.getTimeInstance(DateFormat.SHORT).format(dataHoje);
		System.out.println(hojeFormatado_TimeInstance);

		hojeFormatado_TimeInstance = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(dataHoje);
		System.out.println(hojeFormatado_TimeInstance);

		hojeFormatado_TimeInstance = DateFormat.getTimeInstance(DateFormat.LONG).format(dataHoje);
		System.out.println(hojeFormatado_TimeInstance);

		String hojeFormatado_DateInstance = DateFormat.getDateInstance().format(dataHoje);
		System.out.println(hojeFormatado_DateInstance);

		hojeFormatado_DateInstance = DateFormat.getDateInstance(DateFormat.LONG).format(dataHoje);
		System.out.println(hojeFormatado_DateInstance);

		String hojeFormatado_DateTime = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM)
				.format(dataHoje);
		System.out.println(hojeFormatado_DateTime);

		hojeFormatado_DateTime = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(dataHoje);
		System.out.println(hojeFormatado_DateTime);

		String data = "13/04/2017 21:51:30";
		try {
			Date dataDate = DateFormat.getInstance().parse(data);
			System.out.println(dataDate);

			Calendar calendario = Calendar.getInstance();
			calendario.setTime(dataDate);

			System.out.println(calendario);
			System.out.println(calendario.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
