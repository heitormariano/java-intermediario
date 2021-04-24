package com.loiane.cursojava.aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {
		//aula sobre autoboxing e unboxing
		
		//autoboxing ("transforma��o" de tipos primitivos para Objetos)
		
		Short num7 = 1; //new Short((short) 1);
		Byte num8 = 12; //new Byte((byte) 12);
		Integer num9 = 123;
		Long num10 = 234000L;
		Float num11 = 4.5F; //new Float(4.5F);
		Double num12 = 456.78; //new Double(456.78);
		Boolean flag2 = true;
		Character b = 'b';
		
		//auto unboxing ("transforma��o" de objetos Wrapper para tipos primitivos)
		int num13 = num9; // num9.intValue();
		double num14 = num12; // num12.doubleValue();
		
		//aotoboxing em express�es
		Integer num15 = 23;
		num15++;
		System.out.println(num15);
		
		int num16 = 20;
		Integer num17 = 10;
		
		//unboxing num17 (Integer para int)
		//autoboxing o resultado da divis�o num16/num17 (resultado do tipo int para Integer)
		//atribui��o de resultado (Integer) para vari�vel Integer
		Integer num18 = num16/num17;
		System.out.println(num18);
		
		//uso n�o recomendado (o ideal seria usar vari�veis de tipos primitivos diretamente)
		Double x, y, z;
		x = 10.0;
		y = 12.6;
		z = 4.65;

		Double media = (x + y + z) / 3;
		System.out.println(media);
	}
}
