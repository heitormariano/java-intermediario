package com.loiane.cursojava.aula56.labs;

public enum Calculadora {

	SOMA('+') {
		@Override
		public double executarOperacao(double x, double y) {
			return x + y;
		}
	},
	SUBTRACAO('-') {
		@Override
		public double executarOperacao(double x, double y) {
			return x - y;
		}
	},
	MULTIPLICACAO('*') {
		@Override
		public double executarOperacao(double x, double y) {
			return x * y;
		}
	},
	DIVISAO('/') {
		@Override
		public double executarOperacao(double x, double y) {
			if (y != 0) {
				return x / y;
			}
			return 0;
		}
	};

	private char simbOperacao;

	Calculadora(char simbOperacao) {
		this.simbOperacao = simbOperacao;
	}

	public char getSimboloOperacao() {
		return this.simbOperacao;
	}

	public abstract double executarOperacao(double x, double y);

	@Override
	public String toString() {
		return String.valueOf(this.simbOperacao);
	}
}
