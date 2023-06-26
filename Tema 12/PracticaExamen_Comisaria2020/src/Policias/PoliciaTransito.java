package Policias;

import java.util.ArrayList;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class PoliciaTransito extends Policia {

	public PoliciaTransito(String nombre) {
		super("T", nombre);
	}

	public void actualizarSueldos() {
		super.sueldo = 1500 + 0.1 * getImporteTotal(); //Para que no se sume cada vez sino solo una
	}

	private double getImporteTotal() {
		int importeTotal = 0;

		if (Multa.multasPolicia(super.getCodigo()) != null) { //Mientras tenga multas
			ArrayList<Multa> todasMultas = Multa.multasPolicia(super.getCodigo()); //Para que sean todas las multas de ese PoliciaTransito

			for (int i = 0; i < todasMultas.size(); i++) {
				importeTotal += todasMultas.get(i).getImporte();
			}
		}

		return importeTotal;
	}

}