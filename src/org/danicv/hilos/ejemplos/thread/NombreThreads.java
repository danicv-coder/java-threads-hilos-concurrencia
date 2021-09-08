package org.danicv.hilos.ejemplos.thread;

import java.util.Iterator;

public class NombreThreads extends Thread {

	public NombreThreads(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("El nombre es: " + this.getName());
		System.out.println("");
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName());
		}

	}
	

}
