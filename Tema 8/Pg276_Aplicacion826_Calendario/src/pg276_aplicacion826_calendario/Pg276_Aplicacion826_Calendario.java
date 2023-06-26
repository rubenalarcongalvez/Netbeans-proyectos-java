/*
A partir de la clase Calendario, implementada en la Actividad de aplicación 7.15, es-	
cribe la clase CalendarioExacto, que determina un instante de tiempo exacto forma-	
do por un año, un mes, un dia, una hora y un minuto. Implementa los métodos toString(),
equals() y aquellos necesarios para manejar la clase.	
*/

package pg276_aplicacion826_calendario;

import clases.*;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg276_Aplicacion826_Calendario {

    public static void main(String[] args) {
		Calendario c1 = new Calendario(1997, 07, 01);
		System.out.println(c1);
		
		CalendarioExacto ce1 = new CalendarioExacto(1997, 07, 01, 12, 58);
		System.out.println(ce1);
		
		System.out.println("Son iguales los calendarios: " + c1.equals(ce1));
		c1.incrementarDia();
		System.out.println("Y ahora: " + c1.equals(ce1));
    }
}