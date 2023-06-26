package clases;

/**
 *
 * @author Rubén Alarcón Gálvez
 */
public class BarajaEspanola40 extends Baraja {

    public BarajaEspanola40() {
		super();
		this.setNumero((int) (Math.random() * 12 + 1));
		
		while(getNumero() == 8 || getNumPalo() == 9) setNumero((int) (Math.random() * 12 + 1));
    }

	@Override
    public String mostrar() {
        String[] palos = {"Oros", "Bastos", "Espadas", "Copas"};

        return getNumero() + "º - " + palos[getNumPalo()];
    }

}