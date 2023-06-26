package trabajofinal;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class validacionFormularioValoresBordeBasicoTest {
	
	public validacionFormularioValoresBordeBasicoTest(){
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
		
		validacionFormulario instance = new validacionFormulario ("erkapitan72","a123456", "07/04/1972", 49.99);

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
		
		validacionFormulario instance = new validacionFormulario ("erkapitan72","a123456", "07/04/1972", 50.00);

		String resultadoEsperado = "E2 Registro no permitido por saldo superior a 50,00 €.";

		String sRespuesta = instance.validacionRegistro();

		assertEquals(resultadoEsperado, sRespuesta);
	}
	
}