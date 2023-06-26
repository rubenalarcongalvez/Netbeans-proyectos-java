/*
Enunciado
 */
package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
//Clase Perro, a la que se le implementa la interfaz
public class Perro implements Sonido {

	public void voz() {
		System.out.println("¡Guau!");
	}
	
	public void darPata() {
		System.out.println("*Da la pata*");
	}
}
