package com.loiane.cursojava.aula78;

public class Aula78 {

	public static void main(String[] args) {
		String ola = "Olá";
		String ola2 = "OLÁ";
		String ola3 = "Olá";

		String ola4 = new String(ola); // criação de um novo objeto String

		System.out.println("ola equals ola2: " + ola.equals(ola2)); // false
		System.out.println("ola equals ola3: " + ola.equals(ola3)); // true

		System.out.println("ola equalsIgnoreCase ola2: " + ola.equalsIgnoreCase(ola2)); // true

		System.out.println("ola == ola2: " + (ola == ola2));
		System.out.println("ola == ola3: " + (ola == ola3));

		System.out.println("ola == ola4: " + (ola == ola4)); // false
		System.out.println("ola equals ola4: " + ola.equals(ola4));
		System.out.println("ola equalsIgnoreCase ola4: " + ola.equalsIgnoreCase(ola4));

		String paraguai = "paraguai";
		String para = "para";
		String guai = "guai";

		System.out.println(paraguai.regionMatches(0, para, 0, 4)); // true
		System.out.println(paraguai.regionMatches(0, para, 0, 3)); // true

		String aprovacao = "ApRoVaCao";
		String apr = "apr";
		String acao = "acao";

		System.out.println(aprovacao.regionMatches(false, 0, apr, 0, 3)); // false
		System.out.println(aprovacao.regionMatches(true, 0, apr, 0, 3)); // true

		System.out.println(aprovacao.regionMatches(false, 5, acao, 0, 4)); // false
		System.out.println(aprovacao.regionMatches(true, 5, acao, 0, 4)); // true

		String desenvolvimento = "desenvolvimento";
		String desen = "desen";
		String mento = "mento";

		System.out.println("Resultado: " + desenvolvimento.startsWith(desen));
		System.out.println("Resultado: " + desenvolvimento.endsWith(mento));

		String a = "a";
		String b = "b";
		String aMaisculo = "A";

		System.out.println("Uso de compareTo()");
		
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo(aMaisculo));
		
		System.out.println(a.compareTo(a));
		System.out.println(b.compareTo(b));

	}
}
