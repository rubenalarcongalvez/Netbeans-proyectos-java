/*
Se quiere informatizar una biblioteca. Crea las clases Publicacion, Libro y
Revista. Las clases deben estar implementadas con la jerarquía correcta. Las
características comunes de las revistas y de los libros son el código ISBN, el
título, y el año de publicación. Los libros tienen además un atributo prestado.
Cuando se crean los libros, no están prestados. Las revistas tienen un número.
La clase Libro debe implementar la interfaz Prestable que tiene los métodos
presta, devuelve y estaPrestado.
*/

package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Libro extends Publicacion implements Prestable {
	private String prestado = "no prestado";

	public Libro(String isbn, String titulo, int anoPublicacion) {
		super(isbn, titulo, anoPublicacion);
	}

	@Override
	public void presta() {
		if (prestado.equals("prestado")) {
			System.out.println("Lo siento, ese libro ya está prestado.");
		} else {
			prestado = "prestado";
		}
	}

	@Override
	public void devuelve() {
		this.prestado = "no prestado";
	}

	@Override
	public boolean estaPrestado() {
		return !prestado.equals("no prestado");
	}

	@Override
	public String toString() {
		return super.toString() + " (" + prestado + ")";
	}
	
}
