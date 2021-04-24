package com.loiane.cursojava.aula59;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//import static java.lang.Math.*; //acesso a todos os métodos da classe Math

public class StaticImport {

	public static void main(String[] args) {
		double a, b, c;

		a = 3;
		b = 4;
		c = 5;

		System.out.println(Math.pow(a, b));
		System.out.println(Math.sqrt(b));
		
		//uso direto de métodos da classe Math (é possível devido o uso do static import)
		System.out.println(pow(a, b));
		System.out.println(sqrt(b));
	}
}
