/* 
Vamos a implementar una estructura de pila para Integer usando objetos de la clase	
Lista para guardar los datos que se apilan. Por razón de eficiencia, la cima será el	
final de la 1ista, evitando asi mover los datos apilados previamente.
*/

package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pila {
	private Lista lista; //objeto donde almacenaremos los datos
	
	public Pila() {
		lista = new Lista(); //constructor que crea un objeto (lista) de la clase Lista
	}
	
	//apilamos añadiendo el elemento al final de la lista
	public void apilar(Integer elemento) {
		lista.insertarFinal(elemento);
	}
	
	//desapilamos extrayendo el elemento de la cima. Si la pila está vacía,
	//es porque la lista también lo está y devuelve null
	public Integer desapilar() {
		return lista.eliminar(lista.numeroElementos() - 1); //Así el atributo puede ser privado (y solo tenemos que llamar al getter)
	}
	
	public void mostrar() {
		lista.mostrar();
	}
}