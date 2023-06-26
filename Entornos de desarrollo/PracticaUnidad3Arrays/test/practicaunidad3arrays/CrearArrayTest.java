package practicaunidad3arrays;

import junit.framework.TestCase;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class CrearArrayTest extends TestCase {

	CrearArray array = new CrearArray(); //Creamos array de 0 posiciones
	
	public CrearArrayTest(String testName) {
		super(testName);
	}
	
	public void testCambiarLongitud() throws Exception {
		System.out.println("Prueba del método para cambiar la longitud del array.");
		int longitud = 11;
		array.cambiarLongitud(longitud);
	}
}