package inspectores;

import java.util.ArrayList;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class InspectorSanidad extends Inspector {

	public InspectorSanidad(String nombre) {
		super('I', nombre);
	}
	
	public void actualizarSueldo() {
		ArrayList<Sancion> sancionesPropias = Sancion.sancionesInspector(getCodigo());
		double importeTotal = 0;
		
		if (sancionesPropias != null) { //Si no hay sanciones, no se hace y se queda tal cual
			for (int i = 0; i < sancionesPropias.size(); i++) {
				importeTotal += sancionesPropias.get(i).getImporte();
			}
			
			sueldo = 2000 + 0.1 * importeTotal;
		}
	}

}