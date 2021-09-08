package org.danicv.hilos.ejemplos;

import org.danicv.hilos.ejemplos.runnable.InterfaceSincronizacionRunnable;

public class SincronizacionThreads {

	public static void main(String[] args) {
	
		new Thread(new InterfaceSincronizacionRunnable("Hola", "Como estas?")).start();;
		new Thread(new InterfaceSincronizacionRunnable("bien y", "tu?")).start();;
		new Thread(new InterfaceSincronizacionRunnable("de", "nada")).start();;


	}

	public synchronized static void imprimirFrases(String frase1, String frase2) {
		System.out.println(frase1);
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(frase2);
	}

}
