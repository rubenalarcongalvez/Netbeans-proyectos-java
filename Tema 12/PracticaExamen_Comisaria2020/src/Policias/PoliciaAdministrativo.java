package Policias;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class PoliciaAdministrativo extends Policia {

	public PoliciaAdministrativo(String nombre) {
		super("A", nombre);
		super.sueldo = super.sueldo + 100;
	}
	
}