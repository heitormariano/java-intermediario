package com.loiane.cursojava.aula85;

public class Aula85Math {

	public static void main(String[] args) {
		System.out.println(Math.sqrt(25)); // raiz quadrada
		System.out.println(Math.cbrt(8)); // raiz cúbica
		
		System.out.println(Math.PI);
		
		System.out.println(Math.round(4.5)); // igual a 4.5
		System.out.println(Math.round(4.7)); // superior a 4.5
		System.out.println(Math.round(4.4)); //inferior a 4.5
		
		System.out.println(Math.random());
		System.out.println(Math.random() * 10);

		// números aleatórios arredondados
		System.out.println(Math.round(Math.random() * 10));
		System.out.println(Math.round(Math.random() * 100));
		
		// trabalhando com seno, conseno e tangente
		// os valores finais não são precisos
		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.sin(Math.toRadians(45)));
		System.out.println(Math.sin(Math.toRadians(90)));
		
		System.out.println(Math.cos(Math.toRadians(30)));
		System.out.println(Math.cos(Math.toRadians(45)));
		System.out.println(Math.cos(Math.toRadians(90)));
		
		System.out.println(Math.tan(Math.toRadians(30)));
		System.out.println(Math.tan(Math.toRadians(45)));
		System.out.println(Math.tan(Math.toRadians(90)));
		
		
	}
}
