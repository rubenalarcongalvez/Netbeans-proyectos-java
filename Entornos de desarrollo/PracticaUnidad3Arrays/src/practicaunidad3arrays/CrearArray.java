package practicaunidad3arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class CrearArray {
	private int[] array;

	public CrearArray() {
		this.array = new int[10];
	}
	
	public void cambiarLongitud(int longitud) {
		if (longitud <= 10) { //Controlamos que solo se pueda cambiar hasta 10
			this.array = new int[longitud];
		} else {
			this.array = new int[10];
		}
	}
}