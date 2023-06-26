package policias;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Multa {
	private final String codigo;
	private final double importe;
	private static int contador = 100;
	
	public Multa(double importe) {
		this.codigo = "M - " + contador++;
		this.importe = importe;
	}

	public double getImporte() {
		return importe;
	}

	@Override
	public String toString() {
		return "\tCódigo: " + codigo + "\n\tImporte: " + importe;
	}
	
}