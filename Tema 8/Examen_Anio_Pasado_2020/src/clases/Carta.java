package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Carta {
	private final int numero;
	private final int numPalo;
	private final String [] nombrePalo = {"Oros", "Bastos", "Espadas", "Copas"};

	public Carta() {
		this.numero = (int) (Math.random() * 12 + 1);
		this.numPalo = (int) (Math.random() * 4);
	}
	
	public String getPalo() {
		return nombrePalo[numPalo];
	}
	
	public static boolean mismoPalo(Carta carta1, Carta carta2) {
		boolean mismo = false;
		
		if (carta1.getPalo().equals(carta2.getPalo())) {
			mismo = true;
		}
		
		return mismo;
	}
	
	public static int compararNumero(Carta carta1, Carta carta2) {
		return carta1.numero - carta2.numero;
	}
	
	@Override
	public String toString() {
		return numero + " - " + this.getPalo();
	}
	
}