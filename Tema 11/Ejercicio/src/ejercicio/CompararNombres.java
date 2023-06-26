package ejercicio;

import java.util.Comparator;

/**
 *
 * @author usuario2
 */
public class CompararNombres implements Comparator<Jugador> { //Solo compara jugadores

    @Override
    public int compare(Jugador j1, Jugador j2) {
        return j1.getNombre().compareToIgnoreCase(j2.getNombre()); //Podemos reutilizar el compareTo, que devuelve ya -1, 0 o 1
    }
    
}
