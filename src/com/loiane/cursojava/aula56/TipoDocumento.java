package com.loiane.cursojava.aula56;

public enum TipoDocumento {

	CPF {
		@Override
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cpf();
		}
	},
	CNPJ {
		@Override
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cnpj();
		}
	};

	// declarando m�todo abstrato
	public abstract String geraNumeroTeste();
}
