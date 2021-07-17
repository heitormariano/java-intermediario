package com.loiane.cursojava.aula97;

import java.text.DecimalFormat;

public class Aula97BigDecimalBigInteger {

	public static void main(String[] args) {
		String padrao = "###.##";
		DecimalFormat df = new DecimalFormat(padrao);
		
		System.out.println("Formato: " + df.format(123456.88));
		
		String novoPadrao = "###,###.##";
		DecimalFormat df2 = new DecimalFormat(novoPadrao);
		System.out.println("Novo formato: " + df2.format(123852.98));
	}

}
