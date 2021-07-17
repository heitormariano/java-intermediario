package com.loiane.cursojava.aula96;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Aula96DecimalFormat {

	public static void main(String[] args) {
		double num01 = 0.03;
		double num02 = 0.04;
		double resultado = num02 - num01;
		System.out.println(resultado);
		
		BigDecimal _num01 = new BigDecimal("0.03");
		BigDecimal _num02 = new BigDecimal("0.04");
		BigDecimal _resultado = _num02.subtract(_num01);
		System.out.println("BigDecimal Resultado: " + _resultado);
		
		BigDecimal val01 = new BigDecimal("123456.789");
		BigDecimal val02 = new BigDecimal("789456.123");
		BigDecimal novoResultado = val01.add(val02);
		System.out.println("BigDecimal novo resultado: " + novoResultado);
		
		System.out.println("Multiplicação: " + val01.multiply(val02));
		System.out.println("Divisão: " + val01.divide(new BigDecimal(4)));
		
		BigInteger bi01 = new BigInteger("102350000000000000000");
		BigInteger bi02 = new BigInteger("234500001200000000000");
		System.out.println("Resultado BigInteger: " + bi01.add(bi02));
	}

}
