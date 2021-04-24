package com.loiane.cursojava.diversos;

public enum MediaNotas {

	SIMPLES {
		@Override
		public double calcular(double x, double y) {
			return (x + y) / 2;
		}
	},
	PONDERADA {
		@Override
		public double calcular(double x, double y) {
			int peso1 = 2;
			int peso2 = 3;

			return (peso1 * x + peso2 * y) / (peso1 + peso2);
		}
	};

	public abstract double calcular(double x, double y);
}
