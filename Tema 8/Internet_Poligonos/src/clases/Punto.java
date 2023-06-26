/* Ejercicio 1
Escribe una clase Punto que complete la de esta entrada, para que además de los constructores y
de los métodos getX() y getY(), y distancia(), contenga también los siguientes métodos:

Dos métodos para modificar los valores atributos.
Un método toString() que devuelva la información del Punto de la siguiente manera (x, y).
Una pequeña ayuda: El método toString() concatena los paréntesis y comas como literales 
con los valores de los atributos, en el orden requerido.
 */

package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Punto {

	private double x;
	private double y;

	public Punto(double puntoX, double puntoY) {
		this.x = Math.abs(puntoX);
		this.y = Math.abs(puntoY);
	}

	public Punto() {
		this(0, 0);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distancia(Punto p) {
		double distanciaX = p.getX() - x;
		double distanciaY = p.getY() - y;
		
		return Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2));
	}

	public void setX(double puntoX) {
		this.x = Math.abs(puntoX);
	}

	public void setY(double puntoY) {
		this.y = Math.abs(puntoY);
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}