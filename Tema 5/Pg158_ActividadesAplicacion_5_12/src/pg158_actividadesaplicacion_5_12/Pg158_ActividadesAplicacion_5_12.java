/*
Escribe la función void desordenar (int t[), que cambia de forma aleatoria los ele-	
mentos contenidos en la tabla t. Si la tabla estuviera ordenada, dejaría de estarlo.	
*/

package pg158_actividadesaplicacion_5_12;

import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg158_ActividadesAplicacion_5_12 {

	static void desordenar(int t[]) {
		int contadorAleatorio;
		int elementoAuxiliar;
		
		for (int contador = 0; contador < t.length; contador++) {
			contadorAleatorio = (int) (Math.random() * (t.length-1));
			elementoAuxiliar = t[contador];
			t[contador] = t[contadorAleatorio];
			t[contadorAleatorio] = elementoAuxiliar;
		}
	}
	
    public static void main(String[] args) {
        int [] tabla = new int[10];
		
		for (int contador = 0; contador < tabla.length; contador++) {
			tabla[contador] = (int) (Math.random() * 100);
		}
		
		Arrays.sort(tabla);
		
		System.out.println("Tabla ordenada: " + Arrays.toString(tabla));
		
		//Lo desordenamos
		desordenar(tabla);
		System.out.println("Tabla desordenada: " + Arrays.toString(tabla));
    }
}
