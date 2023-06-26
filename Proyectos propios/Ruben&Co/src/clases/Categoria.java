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
import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Categoria implements Serializable {
	private final String[] ListaCategorias = {"Tabú", "Mímica y Sonido", "Pintar", "Marcas", "Castigo"};
	private final String nombreCategoria;
	private Carta[] cartas;

	public Categoria(int categoria) {		
		this.nombreCategoria = ListaCategorias[categoria];
		cartas = new Carta[0];
	}

	public Carta[] getCartas() {
		return cartas;
	}

	protected void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}
	
	public void insertarCartaTabu(String pregunta, String respuesta, String[] condiciones) {
		cartas = Arrays.copyOf(cartas, cartas.length + 1);
		cartas[cartas.length - 1] = new CartaTabu(pregunta, respuesta, condiciones);
	}
	
	public void insertarCartaMimica(String pregunta) {
		cartas = Arrays.copyOf(cartas, cartas.length + 1);
		cartas[cartas.length - 1] = new CartaMimica(pregunta);
	}
	
	public void insertarCartaPintar(String pregunta) {
		cartas = Arrays.copyOf(cartas, cartas.length + 1);
		cartas[cartas.length - 1] = new CartaPintar(pregunta);
	}
	
	public void insertarCartaMarcas(String pregunta) {
		cartas = Arrays.copyOf(cartas, cartas.length + 1);
		cartas[cartas.length - 1] = new CartaMarcas(pregunta);
	}
	
	public void insertarCartaCastigo(String castigo) {
		cartas = Arrays.copyOf(cartas, cartas.length + 1);
		cartas[cartas.length - 1] = new CartaCastigo(castigo);
	}
	
	public String mostrar5Cartas(int desdeID) {
		desdeID--; //Porque el array empieza en 0 y el ID en 1
		String resultado = "";
		
		resultado += "Categoria: " + nombreCategoria + "\n";
		
		for (int i = desdeID; i < cartas.length && i < desdeID + 5; i++) { //Para que solo muestre las primeras 5 cartas
			resultado += cartas[i] + "\n";
		}
		
		return resultado;
	}
	
	@Override
	public String toString() {
		String resultado = "";
		
		resultado += "Categoria: " + nombreCategoria + "\n";
		
		for (Carta carta : cartas) {
			resultado += carta + "\n";
		}
		
		return resultado;
	}
	
}