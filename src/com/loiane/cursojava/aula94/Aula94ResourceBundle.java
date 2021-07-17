package com.loiane.cursojava.aula94;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula94ResourceBundle {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto");

		System.out.println("Olá: " + rb.getString("hello"));
		System.out.println("Mundo: " + rb.getString("world"));
		
		ResourceBundle rb2 = ResourceBundle.getBundle("meu-texto", new Locale("en"));
		System.out.println("Hi: " + rb2.getString("hi"));
		System.out.println("Nice: " + rb2.getString("nice"));

	}

}
