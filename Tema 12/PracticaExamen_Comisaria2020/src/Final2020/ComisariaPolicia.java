package Final2020;

import Policias.*;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 * @param <T>
 */
public class ComisariaPolicia<T extends Policia> {

	private ArrayList<T> comisaria;

	public ComisariaPolicia() {
		this.comisaria = new ArrayList<>();
	}

	public void insertarPolicia(T policia) {
		this.comisaria.add(policia);
	}

	public String mostrarTodosPoliciasYMultasOrdenadoPorCodigo() {
		String resultado = "";
		ArrayList<T> listaAux = new ArrayList<>();
		listaAux.addAll(this.comisaria);
		listaAux.sort(Comparator.naturalOrder());

		for (int i = 0; i < listaAux.size(); i++) {
			if (listaAux.get(i) instanceof PoliciaTransito) {
				PoliciaTransito poli = (PoliciaTransito) listaAux.get(i);
				poli.actualizarSueldos();
			}
			
			resultado += listaAux.get(i);

			if (Multa.multasPolicia(listaAux.get(i).getCodigo()) != null) { //Porque no hay ningún ArrayList creado en ese poli (significa que es null). En este caso queremos que sí haya
				resultado += "\n-- MULTAS IMPUESTAS --";
				for (int j = 0; j < Multa.multasPolicia(listaAux.get(i).getCodigo()).size(); j++) {
					resultado += Multa.multasPolicia(listaAux.get(i).getCodigo()).get(j);
				}
			}
			
			resultado += "\n\n";
		}

		return resultado.stripTrailing(); //Para eliminar espacios finales
	}

	public String mostrarTodosPoliciasOrdenadoPorNombre() {
		ArrayList<T> listaAux = new ArrayList<>();
		listaAux.addAll(this.comisaria);
		listaAux.sort((p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre()));

		String resultado = "";

		for (int i = 0; i < listaAux.size(); i++) {
			if (listaAux.get(i) instanceof PoliciaTransito) {
				PoliciaTransito poli = (PoliciaTransito) listaAux.get(i);
				poli.actualizarSueldos();
			}
			
			resultado += listaAux.get(i)+ "\n\n";
		}

		return resultado.stripTrailing(); //Para quitar espacios finales
	}

	public String mostrarPoliciasPonenMultas() {
		String resultado = "";

		for (int i = 0; i < comisaria.size(); i++) {
			if (comisaria.get(i) instanceof PoliciaTransito) {
				PoliciaTransito poli = (PoliciaTransito) comisaria.get(i);
				poli.actualizarSueldos();
				resultado += comisaria.get(i)+ "\n\n";
			}
		}

		return resultado.stripTrailing();
	}

}