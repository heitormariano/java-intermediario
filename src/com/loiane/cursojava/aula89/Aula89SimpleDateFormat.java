package com.loiane.cursojava.aula89;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89SimpleDateFormat {
	public static void main(String[] args) {

		// Documentacao - SimpleDateFormat
		// https://docs.oracle.com/javase/6/docs/api/java/text/SimpleDateFormat.html

		SimpleDateFormat sdf = new SimpleDateFormat("y");
		Calendar data1 = new GregorianCalendar(2018, 0, 20, 15, 30, 25);
		System.out.println(sdf.format(data1.getTime()));

		SimpleDateFormat sdf2 = new SimpleDateFormat("d/M/y");
		Calendar data2 = new GregorianCalendar(2017, 2, 5, 14, 10, 10);
		System.out.println(sdf2.format(data2.getTime()));

		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");
		Calendar data3 = new GregorianCalendar(2016, 3, 29, 17, 20, 10);
		System.out.println(sdf3.format(data3.getTime()));

		SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss z");
		Calendar data4 = new GregorianCalendar(2015, 11, 20, 23, 30, 28);
		System.out.println(sdf4.format(data4.getTime()));

		SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a z");
		Calendar data5 = new GregorianCalendar(2014, 10, 20, 22, 30, 28);
		System.out.println(sdf5.format(data5.getTime()));

		SimpleDateFormat sdf6 = new SimpleDateFormat("dd/MM/yyyy");
		Date data6 = new Date();
		String dataString = sdf6.format(data6);
		System.out.println(dataString);

		SimpleDateFormat sdf7 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String minhaData = "20/06/2017 12:50:45";

		try {
			Date minhaDataEmDate = sdf7.parse(minhaData);
			System.out.println(minhaDataEmDate);
			System.out.println("Formato mais amigável: " + sdf7.format(minhaDataEmDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
