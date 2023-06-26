package clases;

/**
 *
 * @author Rubén Alarcón Gálvez
 */
public class BarajaFrancesa extends Baraja {

    public BarajaFrancesa() {
        super();
        this.setNumero((int) (Math.random() * 13 + 1));
    }

    @Override
    public String mostrar() {
        String[] palos = {"Tréboles", "Diamantes", "Corazones", "Picas"};

        return getNumero() + "º - " + palos[getNumPalo()];
    }

}
