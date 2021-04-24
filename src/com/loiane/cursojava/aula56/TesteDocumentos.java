package com.loiane.cursojava.aula56;

public class TesteDocumentos {

	public static void main(String[] args) {

		/*
		 * for (TipoDocumento doc : TipoDocumento.values()) {
		 * System.out.println(doc + " - " + doc.geraNumeroTeste()); }
		 */

		Pessoa pessoaFisica = new Pessoa();
		pessoaFisica.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		pessoaFisica.setNumDocumento(pessoaFisica.getTipoDocumento().geraNumeroTeste());
		System.out.println(pessoaFisica);

		Pessoa pessoaJuridica = new Pessoa();
		pessoaJuridica.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pessoaJuridica.setNumDocumento(pessoaJuridica.getTipoDocumento().geraNumeroTeste());
		System.out.println(pessoaJuridica);

	}
}
