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
public class PrestamoEquivalenciaBATest {

    private Prestamo instance;

    @Before
    public void before() {
        System.out.println("before()");
        instance = new Prestamo();
    }

    @After
    public void after() {
        System.out.println("after()");
        instance = null;
    }

    public PrestamoEquivalenciaBATest() {
    }

    /**
     * Test of estudio method, of class Prestamo.
     */
    @Test
    public void testValorMenor() {
        System.out.println("Test de un valor menor que el rango");
        int cantidad = 9;

        String expResult = "Préstamo no concedido carece de interes";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }

    /**
     * Test of estudio method, of class Prestamo.
     */
    @Test
    public void testValorEntre() {
        System.out.println("Test de un valor entre el rango");
        int cantidad = 5000;
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }

    /**
     * Test of estudio method, of class Prestamo.
     */
    @Test
    public void testValorMayor() {
        System.out.println("Test de un valor mayor que el rango");
        int cantidad = 15100;
        String expResult = "Préstamo no concedido es una operación con demasiado riesgo";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }

}
