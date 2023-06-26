package inspectores;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class InspectorJefe extends Inspector {

	public InspectorJefe(String nombre) {
		super('J', nombre);
		super.sueldo += 1000;
	}
	
}