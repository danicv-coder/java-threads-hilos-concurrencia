package org.danicv.hilos.ejemplos;

import org.danicv.hilos.ejemplos.thread.NombreThreads;

public class EjemploExntederThreads {

	public static void main(String[] args) throws InterruptedException {
		Thread nombre = new NombreThreads("Daniel Calderon");
		nombre.start();
		System.out.println(nombre.getState());

	}

}
