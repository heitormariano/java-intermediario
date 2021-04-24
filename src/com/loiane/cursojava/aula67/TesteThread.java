package com.loiane.cursojava.aula67;

public class TesteThread {
	public static void main(String[] args) {
		
		MinhaThread thread = new MinhaThread("Thread #1", 400);
		//thread.start(); // chama o método run() da Thread
		
		MinhaThread tread2 = new MinhaThread("Thread #2", 1000);
		MinhaThread thread3 = new MinhaThread("thread #3", 1600);
	}
}
