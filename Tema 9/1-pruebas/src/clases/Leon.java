/*
Enunciado
*/

package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Leon implements Sonido {
	public void voz() {
			System.out.println("¡Grrrr!");
	}
	@Override //Se puede sobreescribir el método creado en la interfaz
	public void vozDurmiendo() {
			System.out.println("Grrr");
	}
}