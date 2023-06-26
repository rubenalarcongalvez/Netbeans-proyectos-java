/* Ejercicio 2
Utilizando la clase Punto del ejercicio anterior, escribe una clase Polígono.
Esta clase tiene como atributo un array de objetos Punto. 
Se consideran adyacentes los objetos Punto que estén en celdas consecutivas del
array y los puntos que están en la primera y última celda. Esta clase ha de tener los siguientes métodos:

- el constructor, que recibirá por parámetro un array con los objetos Punto que definen el Polígono.
- trasladar(), recibe por parámetro el desplazamiento en la coordenada x y el desplazamiento en la coordenada y.
- escalar(), recibe por parámetro el factor de escala para la coordenada x y el factor de escala para la coordenada y.
- numVértices(), devuelve el número de vértices del Polígono.
- perímetro(), devuelve el perímetro del Polígono.

Algunos consejos:

- En el constructor hay que controlar que el número de vértices del Polígono no es menor que 3. En caso contrario, se lanza una excepción.
- Para trasladar el Polígono, se recorre el array desplazando cada uno de los puntos.
- Para escalar, se hace lo mismo, pero multiplicando su coordenada x por el factor x y su coordenda y por el factor y.
- El perímetro se calcula utilizando el método distancia() de la clase Punto.
  Se calcula y se suma la distancia de cada Punto con su Punto siguiente, sin olvidarse de la distancia entre el Punto de
  la celda 0 y de la última celda.
 */

package clases;

import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Poligono {

	private Punto[] puntos;

	public Poligono(Punto[] puntos) {
		if (puntos.length >= 3) {
			this.puntos = puntos;
		} else {
			this.puntos = new Punto[3];
		}
	}
	
	public void trasladar(int desplazamientoX, int desplazamientoY) {
		for (Punto punto : puntos) {
			punto.setX(punto.getX() + desplazamientoX);
			punto.setY(punto.getY() + desplazamientoY);
		}
	}

	public void escalar(int ejeX, int ejeY) {
		for (Punto punto : puntos) {
			punto.setX(punto.getX() * Math.sqrt(ejeX));
			punto.setY(punto.getY() * Math.sqrt(ejeY));
		}
	}
	
	public int numVertices() {
		return this.puntos.length;
	}
	
	public double perimetro() {
		double perimetro = puntos[0].distancia(puntos[puntos.length - 1]);
		
		for (int i = 1; i < puntos.length; i++) {
			perimetro += puntos[i].distancia(puntos[i - 1]);
		}
		
		return perimetro;
	}

	@Override
	public String toString() {
		return "Polígono: " + Arrays.toString(puntos);
	}
	
}