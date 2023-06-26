/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Michelle
 */
@RunWith(Parameterized.class)
public class PrestamoParametrizadasTest {
    private int valor;
    private String res;
    public PrestamoParametrizadasTest(int valor, String res) {
        this.valor = valor;
        this.res = res;
    }

    /**
     * Test of main method, of class Prestamo.
     */
    @Parameters
    public static Iterable<Object[]> getData() {
        return Arrays.asList(new Object[][]{
            {1,"Préstamo no concedido carece de interes"},{1000,"Felicidades, préstamo concedido"},{1220,"Felicidades, préstamo concedido"},{15000,"Felicidades, préstamo concedido"},{20000,"Préstamo no concedido es una operación con demasiado riesgo"} 
        });
    }

    /**
     * Test of estudio method, of class Prestamo.
     */
    @Test
    public void testEstudio() {
        System.out.println("estudio");
        Prestamo instance = new Prestamo();
        String result = instance.estudio(valor);
        assertEquals(res, result);
    }

}
