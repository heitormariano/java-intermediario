package com.loiane.cursojava.aula92;

import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		TimeZone tz = calendar.getTimeZone();
		System.out.println("Time Zone:");
		System.out.println(tz);
		
//		String[] fusos = TimeZone.getAvailableIDs();
//		for (String fuso : fusos) {
//			System.out.println(fuso);
//		}
		
		TimeZone tzSP = TimeZone.getTimeZone("Ametica/Sao_Paulo");
		
		System.out.println("Display Name: " + tzSP.getDisplayName());
		System.out.println("ID: " + tzSP.getID());
	}
}
