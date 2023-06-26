package Policias;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class JefePolicia extends Policia {

	public JefePolicia(String nombre) {
		super("J", nombre);
		super.sueldo = super.sueldo + 1000;
	}
	
}