package policias;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class JefePolicia extends Policia {
	
	public JefePolicia(String nombre) {
		super('J', nombre);
		this.sueldo += 1000;
	}
	
}