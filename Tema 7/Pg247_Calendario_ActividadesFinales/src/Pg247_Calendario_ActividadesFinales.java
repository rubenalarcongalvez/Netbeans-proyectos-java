
import newpackage.*;

/*
Diseña la clase Calendario que representa una fecha concreta (año, mes y día). La cla-	
se debe disponer de los métodos:	

- Calendario(int año, int mes, int dia): que crea un objeto con los datos pasados	
como parámetros, siempre y cuando, la fecha que representen sea correcta.	

- void incrementarDia(): que incrementa en un dia la fecha del calendario.	

- void incrementarMes(): que incrementa en un mes la fecha del calendario.	

- void incrementarAño(int cantidad): que incrementa la fecha del calendario en el	
número de años especificados. Ten en cuenta que el año 0 no existió.	

- void mostrar(): muestra la fecha por consola.	

- boolean iguales(Calendario otraFecha): que determina si la fecha invocante y la	
que se pasa como parámetro son iguales o distintas.	
*/



/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg247_Calendario_ActividadesFinales {
	
    public static void main(String[] args) {
        Calendario c1 = new Calendario(2000, 1, 28);
		
		System.out.println("Mostramos c1:");
		c1.mostrar();
		
		System.out.println("Incrementamos un día:");
		c1.incrementarDia();
		c1.mostrar();
		
		System.out.println("Incrementamos un mes:");
		c1.incrementarMes();
		c1.mostrar();
		
		System.out.println("Incrementamos un año:");
		c1.incrementarAno();
		c1.mostrar();
		
		Calendario c2 = new Calendario(2001, 2, 28);
		
		System.out.println("Mostramos c2:");
		c2.mostrar();
		
		System.out.println();
		
		System.out.print("Días totales de c1: ");
		System.out.println(c1.diasTotales());
		
		System.out.print("Días totales de c2: ");
		System.out.println(c2.diasTotales());
		
		System.out.println("Son iguales c1 y c2: " + c1.iguales(c2));
		c1.compararCalendarios(c2);
    }
}