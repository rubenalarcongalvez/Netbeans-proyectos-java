package clases;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public interface Sonido {

	int version = 1;

	void voz();
	//Todos los que implementen la interfaz, tendrán vozDurmiendo() con ese mensaje.

	default void vozDurmiendo() {
		System.out.println("Zzz");
	}
	
	static void bostezo() {
		System.out.println("¡Aaaauuuh!");
	}
}