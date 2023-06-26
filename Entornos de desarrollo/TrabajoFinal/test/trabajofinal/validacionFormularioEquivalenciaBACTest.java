package trabajofinal;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class validacionFormularioEquivalenciaBACTest {
	private static validacionFormulario instance;
	
	@BeforeClass
    public static void before() {
        System.out.println("before()"); //Realmente no haría falta el before()
		/*Puesto que no podemos inicializarlo y luego cambiarle los valores
		  al no haber getters ni setters en la clase (y dijiste que no se puede tocar el código)
		*/
    }

    @AfterClass
    public static void after() {
        System.out.println("after()");
        instance = null;
    }
	
	public validacionFormularioEquivalenciaBACTest(){
	}
	
	/**
	 * Test of validacionRegistro method, of class validacionFormulario.
	 * @throws java.lang.Exception
	 */

	@Test
	public void testValidacionFormularioCorrecto() throws Exception {
		System.out.println("Registro completado de forma correcta");
		
		instance = new validacionFormulario ("erkapitan72","a123456", "07/04/1972", 40);

		String resultadoEsperado = "Registro completado de forma correcta";

		String sRespuesta = instance.validacionRegistro();

		assertEquals(resultadoEsperado, sRespuesta);
	}
	
	/**
	 * Test of validacionRegistro method, of class validacionFormulario.
	 * @throws java.lang.Exception
	 */
	
	//Usuario (3)
	@Test
	public void testValidacionFormularioLongitud() throws Exception {
		System.out.println("Test de longitud de la cadena de usuario menor que 5");
		
		instance = new validacionFormulario ("erka","a123456", "07/04/1972", 40);

		String resultadoEsperado = "E4 Registro no permitido por cadena de usuario propuesta no válida: Longitud";

		String sRespuesta = instance.validacionRegistro();

		assertEquals(resultadoEsperado, sRespuesta);
	}

	/**
	 * Test of validacionRegistro method, of class validacionFormulario.
	 * @throws java.lang.Exception
	 */
	
	@Test
	public void testValidacionFormularioPrimerCaracter() throws Exception {
		System.out.println("Test de longitud de la cadena de usuario: primer caracter no válido");
		
		instance = new validacionFormulario ("72erkapitan","a123456", "07/04/1972", 40);

		String resultadoEsperado = "E4 Registro no permitido por cadena de usuario propuesta no válida: Primer carácter no válido";

		String sRespuesta = instance.validacionRegistro();

		assertEquals(resultadoEsperado, sRespuesta);
	}

	/**
	 * Test of validacionRegistro method, of class validacionFormulario.
	 * @throws java.lang.Exception
	 */
	
	//No existe ningún caso de prueba en la solución con este Test (pero es necesario), por lo que lo hacemos
	@Test
	public void testValidacionFormularioFormato() throws Exception {
		System.out.println("Test formato incorrecto en el usuario");
		
		instance = new validacionFormulario (".72erkapitan","a123456", "07/04/1972", 40);

		String resultadoEsperado = "E4 Registro no permitido por cadena de usuario propuesta no válida: Formato incorrecto";

		String sRespuesta = instance.validacionRegistro();

		assertEquals(resultadoEsperado, sRespuesta);
	}

	/**
	 * Test of validacionRegistro method, of class validacionFormulario.
	 * @throws java.lang.Exception
	 */
	
	// Password (2)
	//La longitud de los CP4 y CP5 se pueden unificar en este código puesto que en el código principal está ENTRE
	//y no distingue entre mayor ni menor, aunque si modificamos el código, lo podríamos poner
	//Sin embargo, dijiste que no se modificase el código
	@Test
	public void testValidacionFormularioLongitudContrasena() throws Exception {
		System.out.println("Test longitud de contraseña no está entre 6 y 10");
		
		instance = new validacionFormulario ("erkapitan72","a1234567890", "07/04/1972", 40);

		String resultadoEsperado = "E3 Registro no permitido por contraseña incorrecta: Longitud";

		String sRespuesta = instance.validacionRegistro();

		assertEquals(resultadoEsperado, sRespuesta);
	}

	/**
	 * Test of validacionRegistro method, of class validacionFormulario.
	 * @throws java.lang.Exception
	 */
	
	@Test
	public void testValidacionFormularioFormatoContrasena() throws Exception {
		System.out.println("Test formato incorrecto de la contraseña");
		
		instance = new validacionFormulario ("erkapitan72","a.123456", "07/04/1972", 40);

		String resultadoEsperado = "E3 Registro no permitido por contraseña incorrecta: Formato";

		String sRespuesta = instance.validacionRegistro();

		assertEquals(resultadoEsperado, sRespuesta);
	}

	/**
	 * Test of validacionRegistro method, of class validacionFormulario.
	 * @throws java.lang.Exception
	 */

	//Mayor de Edad (1)
	@Test
	public void testValidacionFormularioEdad() throws Exception {
		System.out.println("Test menor de edad");
		
		instance = new validacionFormulario ("erkapitan72","a123456", "07/04/2015", 40);

		String resultadoEsperado = "E1 Registro no permitido a menores de edad.";

		String sRespuesta = instance.validacionRegistro();

		assertEquals(resultadoEsperado, sRespuesta);
	}

	/**
	 * Test of validacionRegistro method, of class validacionFormulario.
	 * @throws java.lang.Exception
	 */
	
	//Saldo inicial (2, pero entra en él, el formulario correcto que hemos puesto al principio)
	@Test
	public void testValidacionFormularioSaldo() throws Exception {
		System.out.println("Test saldo superior o igual a 50,00 €.");
		
		instance = new validacionFormulario ("erkapitan72","a123456", "07/04/1972", 60);

		String resultadoEsperado = "E2 Registro no permitido por saldo superior a 50,00 €.";

		String sRespuesta = instance.validacionRegistro();

		assertEquals(resultadoEsperado, sRespuesta);
	}
	
}