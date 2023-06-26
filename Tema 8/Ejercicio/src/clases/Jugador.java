package clases;

/**
 *
 * @author Rubén Alarcón Gálvez
 */
public class Jugador {

    private final String codigo;
    private static int numero;
    private final Baraja[] cartas;

    public Jugador(String tipoBaraja) {
        cartas = new Baraja[2];

        if (tipoBaraja.equalsIgnoreCase("BARAJA_ESPAÑOLA")) {
            cartas[0] = new BarajaEspanola();
            cartas[1] = new BarajaEspanola();
        } else if (tipoBaraja.equalsIgnoreCase("BARAJA_ESPAÑOLA40")) {
            cartas[0] = new BarajaEspanola40();
            cartas[1] = new BarajaEspanola40();
        } else if (tipoBaraja.equalsIgnoreCase("BARAJA_FRANCESA")) {
            cartas[0] = new BarajaFrancesa();
            cartas[1] = new BarajaFrancesa();
        }

        numero++;
        this.codigo = "J-" + numero;
    }

    public String getBaraja() {
        return this.cartas[0].getClass().getName();
    }

    public Baraja getCarta(int carta) {
        return this.cartas[carta];
    }

    @Override
    public String toString() {
        return codigo + "\n" + cartas[0].mostrar() + "\n" + cartas[1].mostrar();
    }

}