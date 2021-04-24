package com.loiane.cursojava.aula87;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance(); // singleton

		System.out.println(hoje);

		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);

		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		System.out.println("Ano: " + ano);
		System.out.println("Mês: " + mes); // os meses com a classe Calendar começam a partir do 0
		System.out.println("Dia: " + dia);
		
		System.out.printf("Hoje é: %02d/%02d/%02d %02d:%02d:%02d", dia, (mes + 1), ano, hora, minutos, segundos);
		
		System.out.println();
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		hoje.add(Calendar.DAY_OF_MONTH, 2); // adicionando 2 dias do mês corrente
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		
		Calendar hoje2 = Calendar.getInstance();
		System.out.println(hoje2.get(Calendar.DAY_OF_MONTH));
		hoje2.add(Calendar.DAY_OF_MONTH, -3); // subtraindo 3 dias do mês corrente
		System.out.println(hoje2.get(Calendar.DAY_OF_MONTH));
	}
}
