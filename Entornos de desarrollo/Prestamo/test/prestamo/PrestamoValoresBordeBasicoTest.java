/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michelle
 */
public class PrestamoValoresBordeBasicoTest {

    public PrestamoValoresBordeBasicoTest() {
    }

    /**
     * Test of estudio method, of class Prestamo.
     */
    @Test
    public void valorBordeMenor() {
        System.out.println("Comprobamos el valor borde menor.");
        int cantidad = 1000;
        Prestamo instance = new Prestamo();
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }

    /**
     * Test of estudio method, of class Prestamo.
     */
    @Test
    public void valorBordeMayor() {
        System.out.println("Comprobamos el valor borde mayor.");
        int cantidad = 1000;
        Prestamo instance = new Prestamo();
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }

}
