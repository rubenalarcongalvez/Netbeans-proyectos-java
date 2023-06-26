package ejercicio;

import java.util.Comparator;

/**
 *
 * @author usuario2
 */
public class CompararAltura implements Comparator<Jugador> {

    @Override
    public int compare(Jugador j1, Jugador j2) {
        return (j1.getAltura() - j2.getAltura());
    }
    
}