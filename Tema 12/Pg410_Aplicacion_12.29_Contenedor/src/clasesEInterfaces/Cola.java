/*
Define la interfaz cola con parámetros genéricos. A continuación, implementa la interfaz	
Cola genérica en la clase Contenedor (no hace falta suprimir la implementación de Pila	
de la Actividad resuelta 12.3). Por último, escribe un programa donde se utilice un objeto	
Contenedor como cola. En ella encolamos números enteros positivos leídos del teclado	
hasta que se introduzca un -1. Después, mediante un bucle, se desencolan todos los nú-	
meros hasta que la cola esté vacía y los mostramos por consola.	
 */
package clasesEInterfaces;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 * @param <T>
 */
public interface Cola<T> {
	public void encolar(T nuevo);
	public T desencolar();
}