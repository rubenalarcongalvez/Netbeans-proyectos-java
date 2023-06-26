/* 
Cartas
*/

package examen_anio_pasado_2020;

import clases.*;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Examen_Anio_Pasado_2020 {

	static void mostrar(Juego juego, Jugador jugador1, Jugador jugador2) {
		System.out.println("Empieza la partida:");
		
		System.out.println("\nCartas " + jugador1 + ":");
		System.out.println("Carta 1: " + jugador1.getCarta(0));
		System.out.println("Carta 2: " + jugador1.getCarta(1));
		System.out.println("\nCartas " + jugador2 + ":");
		System.out.println("Carta 1: " + jugador2.getCarta(0));
		System.out.println("Carta 2: " + jugador2.getCarta(1));
		
		System.out.println("\nGanador: " + juego.ganador(jugador1, jugador2));
	}
	
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
		
		Juego juego = new Juego();
		
		mostrar(juego, jugador1, jugador2);
    }
}