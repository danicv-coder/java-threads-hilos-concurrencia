package org.danicv.hilos.ejemplos;

import org.danicv.hilos.ejemplos.runnable.Viajes;

public class InterfaceRunnable {

	public static void main(String[] args) {
		Runnable viajes = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("\n" + i + " - " + Thread.currentThread().getName());
				try {
					Thread.sleep((long) (Math.random() * 1000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println("Me voy de viaje a: " + Thread.currentThread().getName());
		};

		new Thread(viajes, "España").start();

		new Thread(viajes, "Chile").start();

		new Thread(viajes, "Italia").start();

		new Thread(viajes, "Alemania").start();

		new Thread(viajes, "Aruba").start();

	}

}
