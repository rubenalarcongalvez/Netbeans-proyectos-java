package ejercicio;

import clases.*;

/**
 *
 * @author Rubén Alarcón Gálvez
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j1 = new Jugador("BARAJA_ESPAÑOLA");
        
        Jugador j2 = new Jugador("BARAJA_ESPAÑOLA");
        
        Jugador ganador = Juego.juego(j1, j2);
        
        System.out.println("Jugador 1: " + j1.toString());
        System.out.println("Jugador 2: " + j2.toString());
        
        System.out.println();
        
        if (ganador == null) System.out.println("Empate");
        else System.out.println("Ganador: " + ganador.toString());
    }
    
}