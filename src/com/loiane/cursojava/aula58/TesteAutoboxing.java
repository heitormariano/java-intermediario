package com.loiane.cursojava.aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {
		//aula sobre autoboxing e unboxing
		
		//autoboxing ("transformação" de tipos primitivos para Objetos)
		
		Short num7 = 1; //new Short((short) 1);
		Byte num8 = 12; //new Byte((byte) 12);
		Integer num9 = 123;
		Long num10 = 234000L;
		Float num11 = 4.5F; //new Float(4.5F);
		Double num12 = 456.78; //new Double(456.78);
		Boolean flag2 = true;
		Character b = 'b';
		
		//auto unboxing ("transformação" de objetos Wrapper para tipos primitivos)
		int num13 = num9; // num9.intValue();
		double num14 = num12; // num12.doubleValue();
		
		//aotoboxing em expressões
		Integer num15 = 23;
		num15++;
		System.out.println(num15);
		
		int num16 = 20;
		Integer num17 = 10;
		
		//unboxing num17 (Integer para int)
		//autoboxing o resultado da divisão num16/num17 (resultado do tipo int para Integer)
		//atribuição de resultado (Integer) para variável Integer
		Integer num18 = num16/num17;
		System.out.println(num18);
		
		//uso não recomendado (o ideal seria usar variáveis de tipos primitivos diretamente)
		Double x, y, z;
		x = 10.0;
		y = 12.6;
		z = 4.65;

		Double media = (x + y + z) / 3;
		System.out.println(media);
	}
}
