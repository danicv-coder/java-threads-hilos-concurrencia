package org.danicv.hilos.ejemplosSync;

import org.danicv.hilos.ejemplosSync.runnable.Consumidor;

public class EjemploProductoConsumidor {

	public static void main(String[] args) {
		Panaderia p = new Panaderia();
		new Thread(new Panadero(p)).start();
		new Thread(new Consumidor(p)).start();
	}

}
