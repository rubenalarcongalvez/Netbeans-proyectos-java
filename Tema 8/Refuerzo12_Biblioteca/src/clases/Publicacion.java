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
public abstract class Publicacion {
	private String isbn;
	private String titulo;
	private int anoPublicacion;

	public Publicacion(String isbn, String titulo, int anoPublicacion) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.anoPublicacion = Math.abs(anoPublicacion);
	}

	@Override
	public String toString() {
		return "ISBN: " + isbn + ", título: " + titulo + ", año de publicación: " + anoPublicacion;
	}
	
}
