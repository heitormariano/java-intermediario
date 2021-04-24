package com.loiane.cursojava.aula79;

public class Aula79 {

	public static void main(String[] args) {
		String evolution = "evolution";

		System.out.println("Índice da letra e: " + evolution.indexOf('e'));
		System.out.println("Índice da letra l: " + evolution.indexOf('l'));
		System.out.println("Índice da letra y [Não presente]: " + evolution.indexOf('y')); // -1

		System.out.println(evolution.indexOf('o'));
		System.out.println(evolution.lastIndexOf('o'));

		System.out.println(evolution.indexOf("lu"));
		System.out.println(evolution.indexOf("mu"));

		System.out.println(evolution.contains("evo"));
		System.out.println(evolution.contains("tion"));
		System.out.println(evolution.contains("bin"));

	}
}
