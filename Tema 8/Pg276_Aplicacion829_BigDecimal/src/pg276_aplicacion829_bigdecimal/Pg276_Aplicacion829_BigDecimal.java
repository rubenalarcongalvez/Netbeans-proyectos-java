/*
Calcula la raíz cuadrada de 2 con 100 cifras significativas usando objetos de la clase BigDecimal
*/

package pg276_aplicacion829_bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg276_Aplicacion829_BigDecimal {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(2);
		
		MathContext mc = new MathContext(100);
		
		System.out.println(a.sqrt(mc));
    }
}