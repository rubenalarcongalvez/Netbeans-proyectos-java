/*
Crear una tabla de longitud 10 que se inicializará con numeros aleatorios comprendidos en-	
tre 1 y 100. Mostrar la suma de todos los números aleatorios que se guardan en la tabla.	
*/

package pg135_actividadresuelta_5_1;

import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg135_ActividadResuelta_5_1 {

    public static void main(String[] args) {
        int aleatorios[] = new int [10];
		int sumaAleatorios = 0;
		
		for (int contador = 0; contador < aleatorios.length; contador++) {
			aleatorios[contador] = (int) (Math.random() * 100 + 1);
		}
		
		for (int aleatorio : aleatorios) {
			sumaAleatorios += aleatorio;
		}
		
		System.out.println("La tabla aleatorios, tiene como valores: " + Arrays.toString(aleatorios));
		System.out.println("La suma total de todos sus valores es " + sumaAleatorios);
    }
}