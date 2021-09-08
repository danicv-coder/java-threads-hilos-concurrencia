package org.danicv.hilos.ejemplos.runnable;

import static org.danicv.hilos.ejemplos.SincronizacionThreads.imprimirFrases;

public class InterfaceSincronizacionRunnable implements Runnable {
	private String frase1;
	private String frase2;

	public InterfaceSincronizacionRunnable(String frase1, String frase2) {
		this.frase1 = frase1;
		this.frase2 = frase2;
	}

	@Override
	public void run() {
		imprimirFrases(frase1, frase2);

	}

}
