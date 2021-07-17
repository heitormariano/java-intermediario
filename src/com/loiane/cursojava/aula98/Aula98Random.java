package com.loiane.cursojava.aula98;

import java.util.Random;

public class Aula98Random {

	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(Math.random() * 10 + 1);
		System.out.println(Math.floor(Math.random() * 10 + 1));

		// usando classe Random
		Random random = new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(10));

		int limite = 20;
		System.out.println(random.nextInt(limite + 1));

		System.out.println("Sorteio de números:");
		for (int i = 0; i < 20; i++) {
			System.out.println(random.nextInt(limite + 1));
		}
	}

}
