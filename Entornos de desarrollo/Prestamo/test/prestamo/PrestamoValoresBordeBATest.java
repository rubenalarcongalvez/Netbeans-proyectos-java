/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Michelle
 */
public class PrestamoValoresBordeBATest {

    Prestamo instance;

    @Before
    public void before() {
        System.out.println("Before()");
        instance = new Prestamo();
    }

    @After
    public void after() {
        System.out.println("After()");
        instance = null;
    }

    public PrestamoValoresBordeBATest() {
    }

    /**
     * Test of estudio method, of class Prestamo.
     */
    @Test
    public void valorBordeMenor() {
        System.out.println("Comprobamos el valor borde menor.");
        int cantidad = 1000;
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
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }

}
