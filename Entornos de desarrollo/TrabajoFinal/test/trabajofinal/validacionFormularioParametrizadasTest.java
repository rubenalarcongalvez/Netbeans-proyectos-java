package trabajofinal;

import java.text.ParseException;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
@RunWith(Parameterized.class)
public class validacionFormularioParametrizadasTest {

	//Hay que pasarle el constructor ya que no podemos
	//usar getters ni setters porque el código no los tiene
	private validacionFormulario instance;
	private String res;

	public validacionFormularioParametrizadasTest(validacionFormulario instance, String res) {
		this.instance = instance;
		this.res = res;
	}

	/**
	 * Test of main method, of class validacionFormulario.
	 *
	 * @return
	 */
	//Lo pongo para que se vea más claro.
	@Parameters
	public static Iterable<Object[]> getData() {
		return Arrays.asList(new Object[][]{
			{new validacionFormulario("erkapitan72", "a123456", "07/04/1972", 40),
				"Registro completado de forma correcta"},
			{new validacionFormulario("erka", "a123456", "07/04/1972", 40),
				"E4 Registro no permitido por cadena de usuario propuesta no válida: Longitud"},
			{new validacionFormulario("72erkapitan", "a123456", "07/04/1972", 40),
				"E4 Registro no permitido por cadena de usuario propuesta no válida: Primer carácter no válido"},
			{new validacionFormulario(".72erkapitan", "a123456", "07/04/1972", 40),
				"E4 Registro no permitido por cadena de usuario propuesta no válida: Formato incorrecto"},
			{new validacionFormulario("erkapitan72", "a1234567890", "07/04/1972", 40),
				"E3 Registro no permitido por contraseña incorrecta: Longitud"},
			{new validacionFormulario("erkapitan72", "a.123456", "07/04/1972", 40),
				"E3 Registro no permitido por contraseña incorrecta: Formato"},
			{new validacionFormulario("erkapitan72", "a123456", "07/04/2015", 40),
				"E1 Registro no permitido a menores de edad."},
			{new validacionFormulario("erkapitan72", "a123456", "07/04/1972", 60),
				"E2 Registro no permitido por saldo superior a 50,00 €."},
			{new validacionFormulario("erkapitan72", "a123456", "07/04/1972", 49.99),
				"Registro completado de forma correcta"},
			{new validacionFormulario("erkapitan72", "a123456", "07/04/1972", 50.00),
				"E2 Registro no permitido por saldo superior a 50,00 €."}
		});
	}

	/**
     * Test of estudio method, of class validacionFormulario.
	 * @throws java.text.ParseException
     */
    @Test
    public void testValidacionRegistro() throws ParseException {
        System.out.println("validacionRegistro");
        String result = instance.validacionRegistro();
        assertEquals(res, result);
    }
	
}