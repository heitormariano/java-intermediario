package com.loiane.cursojava.aula86;

import java.util.Date;

public class Aula86Date {

	public static void main(String[] args) {
		Date hoje = new Date();
		
		System.out.println(hoje);
		System.out.println("Milisegundos desde 1 Jan 1970" + hoje.getTime());
		
		// m�todo depreciado da classe Date 
		System.out.println(hoje.getDate());
		
		// Outros exemplos de m�todos depreciados
		/*System.out.println(hoje.getDay());
		System.out.println(hoje.getMonth());
		System.out.println(hoje.getYear());*/
	}
}
