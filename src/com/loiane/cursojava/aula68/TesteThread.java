package com.loiane.cursojava.aula68;

public class TesteThread {
	public static void main(String[] args) {
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 600);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 1200);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 2000);
		
		thread1.run();
		thread2.run();
		thread3.run();
	}

}
