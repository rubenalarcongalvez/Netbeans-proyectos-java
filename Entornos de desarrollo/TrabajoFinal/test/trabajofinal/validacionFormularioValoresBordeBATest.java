package trabajofinal;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class validacionFormularioValoresBordeBATest {
	
	private validacionFormulario instance;
	
	@Before
    public void before() {
        System.out.println("before()"); //Realmente no haría falta el before()
		/*Puesto que no podemos inicializarlo y luego cambiarle los valores
		  al no haber getters ni setters en la clase (y dijiste que no se puede tocar el código)
		*/
    }

    @After
    public void after() {
        System.out.println("after()");
        instance = null;
    }
	
	/**
	 * Test of validacionRegistro method, of class validacionFormulario.
	 * @throws java.lang.Exception
	 */
	
	//Hay una errata en la solución porque pone 49.98 y en el enunciado explicándolo de la solución,
	//pone 49.99
	@Test
	public void testValidacionFormularioSaldoBordeMenor() throws Exception {
		System.out.println("Test saldo borde menor, que es correcto");
		
		instance = new validacionFormulario ("erkapitan72","a123456", "07/04/1972", 49.99);

		String resultadoEsperado = "Registro completado de forma correcta";

		String sRespuesta = instance.validacionRegistro();

		assertEquals(resultadoEsperado, sRespuesta);
	}
	
	/**
	 * Test of validacionRegistro method, of class validacionFormulario.
	 * @throws java.lang.Exception
	 */
	
	@Test
	public void testValidacionFormularioSaldoBordeMayorIncorrecto() throws Exception {
		System.out.println("Test saldo borde mayor (50.00 €)");
		
		instance = new validacionFormulario ("erkapitan72","a123456", "07/04/1972", 50.00);

		String resultadoEsperado = "E2 Registro no permitido por saldo superior a 50,00 €.";

		String sRespuesta = instance.validacionRegistro();

		assertEquals(resultadoEsperado, sRespuesta);
	}
	
}