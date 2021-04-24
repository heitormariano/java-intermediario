package com.loiane.cursojava.aula65;

@InformacaoAula(autor = "Loiane Groner", aulaNumero = 65, blog = "loiane.com", site = "loiane.training")
public class TesteAnnotation {

	@InformacaoAula(autor = "Loiane Groner", aulaNumero = 65, blog = "loiane.com", site = "loiane.training")
	public static void main(String[] args) {
		System.out.println("Testes com anotação @InformacaoAula");
	}
}
