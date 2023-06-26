/* Ejercicio 1
Escribe una clase Punto que complete la de esta entrada, para que además de los constructores y
de los métodos getX() y getY(), y distancia(), contenga también los siguientes métodos:

Dos métodos para modificar los valores atributos.
Un método toString() que devuelva la información del Punto de la siguiente manera (x, y).
Una pequeña ayuda: El método toString() concatena los paréntesis y comas como literales 
con los valores de los atributos, en el orden requerido.
 */

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

 /* Ejercicio 3
Escribe una aplicación en la que:

Cree un polígono de cuatro vértices, que serán (0, 0), (2, 0), (2,2), (0, 2).
Muestre la información del polígono y su perímetro por pantalla.
Traslade el polígono 4 en el eje x, y -3 en el eje y.
Muestre la información del polígono de nuevo.
Escale el polígono por 3 en el eje x y por 4 en el eje y.
Vuelva a mostrar información del polígono por pantalla.

Ayuda:
Para crear un Polígono, se necesita un array de objetos Punto,
por lo que lo primero que hay que hacer es crear este array y rellenarlo con los cuatro puntos.
Posteriormente, se creará el objeto de la clase Polígono y se llamará a cada uno de los métodos que sean necesarios.
Para mostrar la información en pantalla, se utilizará el método toString().
 */

package internet_poligonos;

import clases.*;
import java.awt.Color;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Internet_Poligonos {

	public static void main(String[] args) {
		Punto[] puntos = {new Punto(), new Punto(2, 0), new Punto(2, 2), new Punto(0, 2)};
		PoligonoColoreado pol1 = new PoligonoColoreado(puntos, Color.red);
		System.out.println(pol1 + ". Perímetro: " + pol1.perimetro());
		pol1.trasladar(4, -3);
		System.out.println(pol1);
		pol1.escalar(3, 4);
		System.out.println(pol1.toString());
		pol1.setColor(Color.green);
		System.out.println(pol1);
	}
}