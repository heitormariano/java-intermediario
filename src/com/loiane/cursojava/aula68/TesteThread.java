package com.loiane.cursojava.aula68;

public class TesteThread {
	public static void main(String[] args) {
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 600);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 1200);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 2000);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();
	}

}
