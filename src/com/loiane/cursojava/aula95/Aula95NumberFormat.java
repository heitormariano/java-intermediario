package com.loiane.cursojava.aula95;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Aula95NumberFormat {

	public static void main(String[] args) {
		Locale english = new Locale("en", "United States");
		NumberFormat nf = NumberFormat.getInstance(english);

		String num = nf.format(2000);
		System.out.println(num);

		Locale brasil = new Locale("pt", "Brazil");
		nf = NumberFormat.getInstance(brasil);
		
		String num2 = nf.format(3500.88);
		System.out.println(num2);
		
		NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
		String valor = moeda.format(1450.66);
		System.out.println(valor);
		
		Currency currency = moeda.getCurrency();
		System.out.println(currency);

	}

}
