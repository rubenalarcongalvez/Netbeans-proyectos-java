/* 
Vamos a implementar una estructura de pila para Integer usando objetos de la clase	
Lista para guardar los datos que se apilan. Por razón de eficiencia, la cima será el	
final de la 1ista, evitando asi mover los datos apilados previamente.
*/

//8.16 - Diseña la clase Pila heredando de Lista

package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pila extends Lista {
	
	public Pila() {
		this.tabla = new Integer[0];
	}
	
	//apilamos añadiendo el elemento al final de la lista
	public void apilar(Integer elemento) {
		this.insertarFinal(elemento);
	}
	
	//desapilamos extrayendo el elemento de la cima. Si la pila está vacía,
	//es porque la lista también lo está y devuelve null
	public Integer desapilar() {
		return this.eliminar(this.numeroElementos() - 1); //Así el atributo puede ser privado (y solo tenemos que llamar al getter)
	}
}