package practicaunidad3;

import junit.framework.TestCase;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class CCuentaTest extends TestCase {

	CCuenta instance = new CCuenta("Juan López", "1000-2365-85-123456789", 2500, 0);

	public CCuentaTest(String testName) {
		super(testName);
	}

	/**
	 * Test of ingresar method, of class CCuenta.
	 */
	public void testRetirar() throws Exception {
		System.out.println("Prueba del método retirar");
		double cantidad = 1000.0;
		instance.retirar(cantidad);
		assertEquals(
				"Debe dar 1500 (2500 que tenía menos 1000 que se retiran)",
				1500.0,
				instance.estado()
		);
	}

	/**
	 * Test of retirar method, of class CCuenta.
	 */
	public void testIngresar() throws Exception {
		System.out.println("Prueba del método ingresar");
		double cantidad2 = 250;
		instance.ingresar(cantidad2);
		assertEquals(
				"Debe dar 2750 (2500 que tenía mas 250 que se ingresan)",
				2750.0,
				instance.estado()
		);
	}
}