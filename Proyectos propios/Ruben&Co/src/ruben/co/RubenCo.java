/*
Hacer un programa tipo Party & Co básico:

- Poner un fichero dat con preguntas (Array de Strings), respuestas
(otro array de Strings con el mismo número que las preguntas) y otro
array de tipo de pregunta (Tabú, Mímica, Pictionary, Marcas...)

Y añadir las preguntas del party co y poder añadir propias.

Función barajar para barajar arrays (pero con las mismas coincidencias de número de array).

Sustituir la interfaz Comparable (compareTo) para que pueda ordenar por id (aunque no la usaré), y otra
para poder ordenarlo por Número de quesitos (para ver qué equipo va ganando) y asignarlo a una función
quienVaGanando();

Las preguntas salen en orden y se añaden al final después de usarlas. (se coge siempre la primera y cuando se hace,
se añade al final y se mueven todos un array a la derecha)

Poder establecer el tiempo para responder, y al mostrar la pregunta,
empezará ese tiempo a mostrarse hasta que llegue a 0, diga TIEMPO! Y muestre la respuesta (si la hubiera)

CUANDO EL NÚMERO DE QUESITOS LLEGUE AL MÁXIMO, ganar y salir -> Reseteando los equipos

Exportarlo e importarlo todo en Ruben&Co.dat

Exportar cada Baraja a un fichero de texto con el nombre de cada Categoría, y poder editar las cartas
de cada categoría ahí para después importarlo (siempre después de hacer la importación dat (sobreescribiendo
si es necesario)
*/

package ruben.co;

import clases.*;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class RubenCo {
	
//	public String[] ObtenerIntegrantes() {
//		
//	}
	
    public static void main(String[] args) {
        Juego party = new Juego();
		
		String[] test = {"Pepi", "Tonti", "Puli"};
		
		party.insertarEquipo("Los 4 Fanáticos", test);
		
		String[] test2 = {"Choni", "Juani", "Loli"};
		
		party.insertarEquipo("Family Buy", test2);
		
		party.insertarQuesito(1); //Esto que se haga automático al ganar pregunta de quesito y preguntar al principio
		party.insertarQuesito(1);
		party.insertarQuesito(1);
		
		System.out.println(party);
		
		System.out.println(party.mostrarCategoria(0));
		System.out.println(party.mostrarEquipo(0));
		
		party.insertarCartaMimica("TEsty");
		party.insertarCartaCastigo("TEsty");
		party.insertarCartaMarcas("TEsty");
		party.insertarCartaPintar("TEsty");
		party.insertarCartaMimica("TEsty");
		party.insertarCartaMimica("yeaaahhhh");
		party.insertarCartaTabu("mdfk", "test", test);
		party.insertarCartaTabu("djl", "pelm", test);
		party.insertarCartaTabu("ljds", "lul", test2);

		
		System.out.println(party.mostrarCategoria(0));
		
		System.out.println("Barajamos\n\n");
		
		party.barajarPorCategoria(0);
		
		System.out.println(party.mostrarCategoria(0));
		
		System.out.println("Ordenamos por ID\n\n");
		
		party.ordenarCartasPorID(0);
		
		System.out.println(party.mostrarCategoria(0));
		
		System.out.println("Barajamos\n\n");
		
		party.barajarPorCategoria(0);
		
		System.out.println("\n\n\n");
		
		System.out.println(party.mostrarCategoria(0));
		
		System.out.println("\n\n\nCojo carta");

		System.out.println(party.cogerCarta(0));
		
		System.out.println(party.mostrarCategoria(0));
		
		System.out.println("\n\n\nCojo carta");
		
		System.out.println(party.cogerCarta(0));
		
		System.out.println(party.mostrarCategoria(0));
		
		System.out.println("\n\n\nCojo carta");
		
		System.out.println(party.cogerCarta(0));
		
		System.out.println(party.mostrarCategoria(0));
		
		System.out.println("COJO CARTA DE CUALQUIER ARRAY");
		
		System.out.println(party.cogerCartaAleatoria());
		
		System.out.println(party.mostrarCategoria(0));
		System.out.println(party.mostrarCategoria(1));
		System.out.println(party.mostrarCategoria(2));
		System.out.println(party.mostrarCategoria(3));
		System.out.println(party.mostrarCategoria(4));
    }
}