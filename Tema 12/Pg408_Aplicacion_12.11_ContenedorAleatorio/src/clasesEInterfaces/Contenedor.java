/*
Implementar, con tipos genéricos, la clase Contenedor, donde podremos guardar tantos	
objetos como deseemos. Para ello utilizaremos una tabla, que inicialmente tendrá tamaño	
cero y se irá redimensionando según añadamos o eliminemos elementos. La clase, ade	
más del constructor y tostring (), tendrá los siguientes métodos:	
void insertarAIPrincipio(T nuevo)	
void insertarAl Final(T nuevo)	
TextraerDel Principio()	
TextraerDel Final()	
void ordenar()
 */

 /*
Definir la interfaz Pila con parámetros genéricos. A continuación, implementar la interfaz	
Pila genérica en la clase Contenedor. Por último, escribir un programa donde se utilice	
un objeto contenedor como pila. En ella apilamos números enteros positivos leídos del te-	
clado hasta que se introduzca un -1. Después, mediante un bucle, se desapilan todos los	
números hasta que la pila esté vacía y los mostramos por consola.
 */

 /*
Define la interfaz cola con parámetros genéricos. A continuación, implementa la interfaz	
Cola genérica en la clase Contenedor (no hace falta suprimir la implementación de Pila	
de la Actividad resuelta 12.3). Por último, escribe un programa donde se utilice un objeto	
Contenedor como cola. En ella encolamos números enteros positivos leídos del teclado	
hasta que se introduzca un -1. Después, mediante un bucle, se desencolan todos los nú-	
meros hasta que la cola esté vacía y los mostramos por consola.	
 */

/* 12.12
Añade a la clase Contenedor el método
	void ordenar(Comparator<T> c)
que ordena los elementos del contenedor según el criterio de c.
*/

/* 12.14
Añade a la clase Contenedor el método
	T get(int indice)
que devuelve el elemento que ocupa el lugar indice dentro del contenedor
*/

package clasesEInterfaces;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 * @param <T>
 */
public class Contenedor<T extends Comparable<T>> implements Pila<T>, Cola<T> {

	private T[] objetos;

	public Contenedor(T[] objetos) {
		this.objetos = objetos;
	}

	public void insertarAlFinal(T nuevo) {
		objetos = Arrays.copyOf(objetos, objetos.length + 1);
		objetos[objetos.length - 1] = nuevo;
	}
	
	public void insertarAlPrincipio(T nuevo) {
		objetos = Arrays.copyOf(objetos, objetos.length + 1);
		
		//Desplazamos todos los elementos un lugar hacia el final para hacer
		//hueco al principio
		System.arraycopy(objetos, 0, objetos, 1, objetos.length - 1);
		objetos[0] = nuevo;
	}

	public T extraerDelFinal() {
		T res = null;

		if (objetos.length > 0) { //si la tabla no está vacía
			res = objetos[objetos.length - 1];
			objetos = Arrays.copyOf(objetos, objetos.length - 1);
		}

		return res;
	}

	public T extraerDelPrincipio() {
		T res = null;

		if (objetos.length > 0) {
			res = objetos[0];
			objetos = Arrays.copyOfRange(objetos, 1, objetos.length);
		}

		return res;
	}

	public void ordenar() {
		Arrays.sort(objetos);
	}
	
	public void ordenar(Comparator<T> c) {
		Arrays.sort(this.objetos, c);
	}
	
	public T get(int indice) {
		T resultado = null;
		
		if (indice < this.objetos.length && indice >= 0) {
			resultado = this.objetos[indice];
		}
		
		return resultado;
	}

	//Implementación de Pila
	@Override
	public void apilar(T nuevo) {
		this.insertarAlFinal(nuevo);
	}

	@Override
	public T desapilar() {
		return this.extraerDelPrincipio();
	}

	//Implementación de Cola
	@Override
	public void encolar(T nuevo) {
		this.insertarAlPrincipio(nuevo);
	}

	@Override
	public T desencolar() {
		return this.extraerDelFinal();
	}

	@Override
	public String toString() {
		return Arrays.deepToString(objetos);
	}
}