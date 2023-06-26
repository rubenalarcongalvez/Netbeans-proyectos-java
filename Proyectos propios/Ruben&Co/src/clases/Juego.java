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
//TAMBIÉN AÑADIR FUNCIÓN DE BUSCAR CARTA POR CATEGORÍA Y LUEGO PREGUNTA O RESPUESTA (parte de ellas) y que muestre
//todas las coincidencias
package clases;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Juego implements Serializable {

	private final String[] listaCategorias = {"Tabú", "Mímica y Sonido", "Pintar", "Marcas", "Castigo"};
	private final Categoria[] categorias;
	private Equipo[] equipos;

	public Juego() {
		equipos = new Equipo[0];

		categorias = new Categoria[listaCategorias.length];

		for (int i = 0; i < listaCategorias.length; i++) {
			categorias[i] = new Categoria(i);
		}
	}

	public void insertarEquipo(String nombre, String[] integrantes) {
		equipos = Arrays.copyOf(equipos, equipos.length + 1);
		equipos[equipos.length - 1] = new Equipo(nombre, integrantes);
	}

	public String mostrarCategoria(int categoria) {
		return categorias[categoria].toString();
	}

	public String mostrar5CartasCategoria(int categoria, int desdeID) {
		return categorias[categoria].mostrar5Cartas(desdeID);
	}

	//Acordarse que muestra que empieza en 1 pero eso solo para el usuario, para el programador empieza en 0
	public String mostrarCategorias() {
		String resultado = "Categorías:";

		for (int i = 0; i < listaCategorias.length; i++) {
			resultado += "\n" + (i + 1) + "- " + listaCategorias[i];
		}

		return resultado;
	}

	public String mostrarEquipo(int equipo) {
		return equipos[equipo].toString();
	}

	public String mostrarEquipos() {
		Arrays.sort(equipos, new CompararPorQuesitos()); //Lo ordenamos por número de quesitos

		String resultado = "Equipos: ";

		for (Equipo equipo : equipos) {
			resultado += "\n- " + equipo;
		}

		return resultado;
	}

	public void insertarQuesito(int equipo) {
		equipos[equipo].insertarQuesito();
	}

	public void insertarCartaTabu(String pregunta, String respuesta, String[] condiciones) {
		categorias[0].insertarCartaTabu(pregunta, respuesta, condiciones);
	}

	public void insertarCartaMimica(String pregunta) {
		categorias[1].insertarCartaMimica(pregunta);
	}

	public void insertarCartaPintar(String pregunta) {
		categorias[2].insertarCartaPintar(pregunta);
	}

	public void insertarCartaMarcas(String pregunta) {
		categorias[3].insertarCartaMarcas(pregunta);
	}

	public void insertarCartaCastigo(String castigo) {
		categorias[4].insertarCartaCastigo(castigo);
	}

	//Solo baraja la categoría que le digamos
	public void barajarPorCategoria(int categoria) {
		int posicionAleatoria = 0; //No hace falta que tenga valor por ahora
		Carta cartaAuxiliar = null;

		for (int i = 0; i < categorias[categoria].getCartas().length; i++) {
			posicionAleatoria = (int) (Math.random() * (categorias[categoria].getCartas().length)); //asignamos un valor aleatorio para coger una carta aleatoria
			cartaAuxiliar = categorias[categoria].getCartas()[i];

			categorias[categoria].getCartas()[i] = categorias[categoria].getCartas()[posicionAleatoria];
			categorias[categoria].getCartas()[posicionAleatoria] = cartaAuxiliar;
		}
	}

	public void ordenarCartasPorID(int categoria) {
		Arrays.sort(categorias[categoria].getCartas());
	}

	public void barajarTodo() { //Reutilizamos la otra función para hacerlo con todas las categorías
		for (int i = 0; i < categorias.length; i++) {
			this.barajarPorCategoria(i);
		}
	}

	public Carta buscarPorID(int categoria, int id) {
		Carta car = null;

		if (categoria >= 0) {
			for (Carta carta : categorias[categoria].getCartas()) {
				if (carta.getId() == id) {
					car = carta;
				}
			}
		}

		return car;
	}

	//Buscará si coincide la pregunta o parte de ella
	public void buscarPorParteDePregunta(int categoria, String pregunta) {
		if (!pregunta.isBlank() && categoria >= 0) {
			for (Carta carta : categorias[categoria].getCartas()) {
				if (carta.getPregunta().contains(pregunta)) {
					System.out.println(carta);
				}
			}
		}
	}

	public void eliminarCarta(int categoria, int id) {
		Carta cartaEliminar = this.buscarPorID(categoria, id);

		//Si se encuentra la carta
		if (cartaEliminar != null) {
//			int posicionEliminar = Arrays.binarySearch(categorias[categoria].getCartas(), cartaEliminar); //No funciona bien
			int posicionEliminar = -1;

			//Buscamos la posición a eliminar
			for (int i = 0; i < categorias[categoria].getCartas().length && posicionEliminar != i; i++) {
				if (categorias[categoria].getCartas()[i] == cartaEliminar) {
					posicionEliminar = i;
				}
			}

			System.out.println(posicionEliminar);

			//Si se encuentra la posición de la carta
			if (posicionEliminar != -1) {
				Carta[] tablaNueva = new Carta[categorias[categoria].getCartas().length - 1];

				//No usamos Arrays.copyOf porque además, queremos ajustar los IDs
				for (int i = 0; i < posicionEliminar; i++) {
					//Si el ID es mayor que el que queremos eliminar
					if (categorias[categoria].getCartas()[i].getId() > id) {
						categorias[categoria].getCartas()[i].setId(categorias[categoria].getCartas()[i].getId() - 1); //Reajustamos el ID
					}

					tablaNueva[i] = categorias[categoria].getCartas()[i];
				}

				if (posicionEliminar != categorias[categoria].getCartas().length - 1) { //Si no está en la última posición, se hará esto además
					//No usamos arraycopy porque además, queremos ajustar los IDs
					for (int i = posicionEliminar; i < tablaNueva.length; i++) {
						//Si el ID es mayor que el que queremos eliminar
						if (categorias[categoria].getCartas()[i + 1].getId() > id) {
							categorias[categoria].getCartas()[i + 1].setId(categorias[categoria].getCartas()[i + 1].getId() - 1); //Reajustamos el ID
						}

						tablaNueva[i] = categorias[categoria].getCartas()[i + 1]; //Asignamos las cartas
					}
				}

				categorias[categoria].setCartas(tablaNueva);
			}
		}
	}

	//Cogemos la carta, la vemos y la ponemos al final del array después de consultarla
	public String cogerCarta(int categoria) {
		String resultado = categorias[categoria].getCartas()[0].toString();
		
		Carta[] tablaNueva = new Carta[categorias[categoria].getCartas().length]; //Creamos un array donde volcar los resultados
		
		//Copiamos todos los datos desde la carta posterior que cogimos
		System.arraycopy(categorias[categoria].getCartas(), 1, tablaNueva, 0, tablaNueva.length - 1);
		
		//Asignamos la carta que hemos cogido al final de nuestro array (que debería estar nulo hasta que hagamos esto)
		tablaNueva[tablaNueva.length - 1] = categorias[categoria].getCartas()[0];
		
		//Solo queda volcar los datos a nuestro array de cartas
		categorias[categoria].setCartas(tablaNueva);
		
		return resultado;
	}

	public String cogerCartaAleatoria() {
		return this.cogerCarta((int) (Math.random() * 5)); //Cualquier carta de categorías del 0 al 4
	}

	@Override
	public String toString() {
		return this.mostrarCategorias() + "\n\n" + this.mostrarEquipos();
	}
}
