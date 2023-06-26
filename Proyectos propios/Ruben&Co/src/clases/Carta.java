/*
Hacer un programa tipo Party & Co básico:

- Poner un fichero dat con preguntas (Array de Strings), respuestas
(otro array de Strings con el mismo número que las preguntas) y otro
array de tipo de pregunta (Tabú, Mímica, Pictionary, Marcas...)

Y añadir las preguntas del party co y poder añadir.

Función barajar para barajar arrays (pero con las mismas coincidencias de número de array).

Las preguntas salen en orden y se anaden al final después de usarlas.

Poder establecer el tiempo para responder, y al mostrar la pregunta,
empezará ese tiempo a mostrarse hasta que llegue a 0, diga TIEMPO! Y muestre la respuesta (si la hubiera)

utilizar DateTime.now()
*/

package clases;

import java.io.Serializable;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public abstract class Carta implements Serializable, Comparable<Carta> {
	private int id; //Para ajustarlo al eliminar registros por ejemplo, no puede ser final
	private final String pregunta;

	public Carta(int id, String pregunta) {
		this.id = id;
		this.pregunta = pregunta;
	}

	public int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	public String getPregunta() {
		return pregunta;
	}
	
	@Override
	public String toString() {
		return "- ID: " + id + "\n  + Pregunta: " + pregunta;
	}
	
	@Override
	public int compareTo(Carta car) {
		int resultado = 0;
		
		if (this.id < car.id) {
			resultado = -1;
		} else if (this.id > car.id) {
			resultado = 1;
		}
		
		return resultado;
	}
	
}
