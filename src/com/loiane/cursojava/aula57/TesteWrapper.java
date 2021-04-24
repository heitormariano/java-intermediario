package com.loiane.cursojava.aula57;

public class TesteWrapper {
	public static void main(String[] args) {
		// Tipos primiticos - Integral
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 124000l;
		
		// Tipos primiticos - Ponto Flutuante
		float num5 = 3.5f;
		double num6 = 3.8778;
		
		//Demais tipos primitivos
		boolean flag = true;
		char a = 'a';
		char letra = 78; //passando número inteiro que representa letra 'N' na tabela ASCII
		System.out.println(letra);
		
		// classes Wrapper - Integral
		Short num7 = new Short((short) 1);
		Byte num8 = new Byte((byte) 12);
		Integer num9 = new Integer(123);
		Long num10 = new Long(234000L);
		
		// classes Wrapper - Ponto Flutuante
		Float num11 = new Float(4.5F);
		Double num12 = new Double(456.78);

		// classes Wrapper - Outras
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');
		
		//Criando instâncias de classes Wrapper
		Integer num13 = new Integer("123");
		System.out.println(num13);
		
		Double num15 = new Double("3.7");
		System.out.println(num15);
		
		//Situações que geram exceções
		// Integer num14 = new Integer("123PALAVRA"); // NumberFormatException
		// Double num15 = new Double("3,6"); // NumberFormatException (para quem usar PC Português Brasil)
		
		//Uso de métodos das classes Wrapper
		Integer num18 = Integer.valueOf(456);
		System.out.println(num18);

		Integer num19 = Integer.valueOf("456");
		System.out.println(num19);
		
		//Comparação entre duas referências
		System.out.println(num18 == num19); // == não funciona com wrappers (resultado: false)
		
		//Uso de métodos das classes Wrapper - grupo de operações que recebem uma String e retornam tipos primitivos
		int num16 = Integer.parseInt("1957");
		System.out.println(num16);

		double num17 = Double.parseDouble("65.88");
		System.out.println(num17);

		//Uso de métodos das classes Wrapper - grupo de operações que retornam tipos primitivos
		Integer num20 = new Integer(20);
		int numRetornado = num20.intValue();
		System.out.println(numRetornado);

		Long num21 = new Long(456L);
		long numRetornado2 = num21.longValue();
		System.out.println(numRetornado2);

		Double num22 = new Double(34.66);
		double numRetornado3 = num22.doubleValue();
		System.out.println(numRetornado3);
	}

}
