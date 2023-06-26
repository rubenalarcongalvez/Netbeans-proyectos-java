package clases;

/**
 *
 * @author Rubén Alarcón Gálvez
 */
public abstract class Baraja {

    private int numero;
    private final int numPalo;

    public Baraja() {
        this.numPalo = (int) (Math.random() * 4);
    }

    public int getNumero() {
        return numero;
    }

    public int getNumPalo() {
        return numPalo;
    }

    protected void setNumero(int numero) {
        this.numero = numero;
    }

    public abstract String mostrar();

    public static boolean mismoPalo(Baraja baraja1, Baraja baraja2) {
        boolean resultado = false;

        if (baraja1.numPalo == baraja2.numPalo) {
            resultado = true;
        }

        return resultado;
    }

    public static int compararNumero(Baraja baraja1, Baraja baraja2) {
        return baraja1.numero - baraja2.numero;
    }

    public static boolean compararTipoBarajas(Baraja baraja1, Baraja baraja2) {
        boolean resultado = false;

        if (baraja1.getClass().getName().equals(baraja2.getClass().getName())) {
            resultado = true;
        }

        return resultado;
    }

}
