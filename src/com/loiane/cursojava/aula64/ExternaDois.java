package com.loiane.cursojava.aula64;

public class ExternaDois {

	public void metodoQualquer(){
		class ClasseLocal{
			private String texto = "texto classe local";
			
			public void imprimeTexto(){
				System.out.println(texto);
			}
		}
		
		ClasseLocal local = new ClasseLocal();
		local.imprimeTexto();
	}
	
	public static void main(String[] args){
		ExternaDois externa = new ExternaDois();
		externa.metodoQualquer();
	}
}
