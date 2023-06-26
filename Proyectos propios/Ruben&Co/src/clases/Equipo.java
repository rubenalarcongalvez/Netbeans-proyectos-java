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
*/

package clases;

import java.io.Serializable;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Equipo implements Serializable {
	private String nombre;
	private String[] integrantes;
	private int numQuesitos;

	public Equipo(String nombre, String[] integrantes) {
		this.nombre = nombre;
		this.integrantes = integrantes;
	}

	public int getNumQuesitos() {
		return numQuesitos;
	}
	
	public void insertarQuesito() {
		numQuesitos++;
	}

	@Override
	public String toString() {
		String resultado = "";
		
		resultado += nombre + "\n  + Integrantes: " + integrantes[0];
		
		for (int i = 1; i < integrantes.length; i++) {
			resultado += ", " + integrantes[i];
		}
		
		resultado += "\n  + Número de quesitos: " + numQuesitos;
		
		return resultado;
	}
	
	
	
}
