package clases;

/**
 *
 * @author Rubén Alarcón Gálvez
 */
public class BarajaEspanola extends Baraja {

    public BarajaEspanola() {
        super();
        this.setNumero((int) (Math.random() * 12 + 1));
    }

    @Override
    public String mostrar() {
        String[] palos = {"Oros", "Bastos", "Espadas", "Copas"};

        return getNumero() + "º - " + palos[getNumPalo()];
    }

}