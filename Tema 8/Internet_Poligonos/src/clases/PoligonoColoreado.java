/* Ejercicio 4
Escribe una clase PolígonoColoreado que herede de la clase Polígono vista en entradas anteriores.
En esta clase debe añadir un atributo color y métodos para cambiar y obtener el color.
El método toString() se tiene que modificar para que devuelva el color del Polígono además de los vértices que lo componen.

Ayudas y un posible planteamiento:
La clase PolígonoColoreado hereda de la clase Polígono. Tenemos que declarar un atributo para representar el color.
El color se declara de la clase Color del paquete awt. Se tienen que implementar los métodos para cambiar y devolver el color.

Además, se sobreescribe el método toString(). Este método añade la información del color y llama al método toString() de la superclase.

El constructor recibe por parámetro el array de puntos. Lo primero que hay que hacer es llamar al constructor de la superclase. 
Posteriormente, se da valor al atributo color, valor que también se recibe por parámetro.
*/

package clases;

import java.awt.Color;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class PoligonoColoreado extends Poligono {
	private Color color;

	public PoligonoColoreado(Punto[] puntos, Color color) {
		super(puntos);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + "\nColor: " + color;
	}
	
}