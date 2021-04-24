package com.loiane.cursojava.aula90;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// Internacionalização

		Locale locale = Locale.getDefault();
		System.out.println(locale);

		Locale[] locales = Locale.getAvailableLocales();

		for (int i = 0; i < locales.length; i++) {
			System.out.println("Nome: " + locales[i]);
		}

		for (Locale loc : locales) {
			System.out.println("Nome: " + loc.getDisplayName());
			System.out.println("Código da Língua: " + loc.getLanguage());
			System.out.println("Língua: " + loc.getDisplayLanguage());
			System.out.println("Código do País: " + loc.getCountry());
			System.out.println("País: " + loc.getDisplayCountry());
			System.out.println("**************************************");
		}
		
		Locale br = new Locale("pt", "BR");
		System.out.println(br);
		
		locale.setDefault(br);
		System.out.println(locale);
		
		System.out.println();
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(50000000000000d));
		
		System.out.println();
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf1.format(50000000000000d));
		
		System.out.println();
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf2.format(50000000000000d));
		
		System.out.println();
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.FRENCH);
		System.out.println(nf3.format(50000000000000d));
	}
}
