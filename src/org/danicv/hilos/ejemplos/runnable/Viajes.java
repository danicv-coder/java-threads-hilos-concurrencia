package org.danicv.hilos.ejemplos.runnable;

public class Viajes implements Runnable {

	private String nombre;

	public Viajes(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("\n" + i + " - " + nombre);
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Me voy de viaje a: " + nombre);
	}

}
