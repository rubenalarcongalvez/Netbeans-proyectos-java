package examenmayo2021;

import java.util.ArrayList;
import java.util.Comparator;
import policias.*;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 * @param <T>
 */
public class ComisariaPolicia<T extends Policia> {
	private ArrayList<T> policias;

	public ComisariaPolicia() {
		policias = new ArrayList<>(); 
	}
	
	public boolean insertarPolicia(T policia) {
		boolean insertado = false;
		
		if (!policias.contains(policia)) {
			policias.add(policia);
			insertado = true;
		}
		
		return insertado;
	}
	
	public int numeroMultas() {
		int resultado = 0;
		
		for (int i = 0; i < policias.size(); i++) {
			if (policias.get(i) instanceof PoliciaTransito) {
				PoliciaTransito poli = (PoliciaTransito) policias.get(i);
				resultado += poli.numeroMultas();
			}
		}
		
		return resultado;
	}
	
	public String mostrarTodosPoliciasYMultasOrdenadoPorCodigo() {
		String resultado = "";
		
		ArrayList<T> listaOrdenada = new ArrayList<>(); //Para no ordenar la principal
		listaOrdenada.addAll(policias);
		listaOrdenada.sort(Comparator.naturalOrder()); //Ordena por el comparator de Policia
		
		for (int i = 0; i < listaOrdenada.size(); i++) {
			resultado += listaOrdenada.get(i);
		}
		
		return resultado.strip();
	}
	
	public String mostrarPoliciasPonenMultas() {
		String resultado = "";
		
		for (int i = 0; i < policias.size(); i++) {
			if (policias.get(i) instanceof PoliciaTransito) {
				PoliciaTransito poli = (PoliciaTransito) policias.get(i);
				if (poli.numeroMultas() > 0) {
					resultado += policias.get(i);
				}
			}
		}
		
		return resultado.strip();
	}
	
}