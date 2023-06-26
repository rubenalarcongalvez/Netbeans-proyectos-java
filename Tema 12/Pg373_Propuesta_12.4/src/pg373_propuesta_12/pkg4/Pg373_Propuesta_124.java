/*
Implementa una aplicación donde se piden por consola números reales hasta que se in-	
troduce un 0. A medida que se leen del teclado, los valores positivos se insertan en una	
colección y los negativos en otra. Al final, se muestran ambas colecciones y las sumas de	
los elementos de cada una de ellas. Por último, se eliminan de ambas todos los valores	
que sean mayores que 10 o menores de -10 y se vuelven a mostrar.	
*/

package pg373_propuesta_12.pkg4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg373_Propuesta_124 {
	
    public static void main(String[] args) {
		double numero;
		Collection<Double> negativos = new ArrayList<>();
		double sumaNegativos = 0;
		Collection<Double> positivos = new ArrayList<>();
		double sumaPositivos = 0;
		
		do {
			numero = EntradaTeclado.pedirDouble("Introduzca un número real (Ej: 0.45): ");
			
			if (numero < 0) {
				sumaNegativos += numero;
				
				negativos.add(numero);
			} else if (numero > 0) {
				sumaPositivos += numero;
				
				positivos.add(numero);
			}
			
		} while (numero != 0);
		
		System.out.println("\nNegativos:" + negativos);
		
		System.out.println("Suma de todos los elementos negativos: " + sumaNegativos);
		
		System.out.println("\nPositivos:" + positivos);
		
		System.out.println("Suma de todos los elementos positivos: " + sumaPositivos);
		
		System.out.println("\nAhora se eliminarán todos los elementos mayores y menores de 10 y -10 respectivamente");
		
		for (Iterator<Double> it = negativos.iterator(); it.hasNext();) {
			double actual = it.next();
			
			if (actual < -10) {
				sumaNegativos -= actual;
				it.remove();
			}
		}
		
		for (Iterator<Double> it = positivos.iterator(); it.hasNext();) {
			double actual = it.next();
			
			if (actual > 10) {
				sumaPositivos -= actual;
				it.remove();
			}
		}
		
		System.out.println("\nNegativos:" + negativos);
		
		System.out.println("Suma de todos los elementos negativos: " + sumaNegativos);
		
		System.out.println("\nPositivos:" + positivos);
		
		System.out.println("Suma de todos los elementos positivos: " + sumaPositivos);
    }
}