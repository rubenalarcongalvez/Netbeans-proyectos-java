/*
Definir la interfaz Pila con parámetros genéricos. A continuación, implementar la interfaz	
Pila genérica en la clase Contenedor. Por último, escribir un programa donde se utilice	
un objeto contenedor como pila. En ella apilamos números enteros positivos leídos del te-	
clado hasta que se introduzca un -1. Después, mediante un bucle, se desapilan todos los	
números hasta que la pila esté vacía y los mostramos por consola.
*/

package clasesEInterfaces;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 * @param <T>
 */
public interface Pila<T> {
	public void apilar(T nuevo);
	public T desapilar();
}