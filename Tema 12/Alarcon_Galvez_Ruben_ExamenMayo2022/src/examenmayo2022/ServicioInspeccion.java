package examenmayo2022;

import inspectores.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class ServicioInspeccion {

	private ArrayList<Inspector> inspectores;

	public ServicioInspeccion() {
		this.inspectores = new ArrayList<>();
	}

	public boolean insertarInspector(Inspector inspector) {
		boolean insertado = false;

		if (!inspectores.contains(inspector)) { //Si no lo contiene, lo añade
			inspectores.add(inspector);
			insertado = true;
		}

		return insertado;
	}

	public String mostrarTodosInspectoresYSancionesOrdenadoPorCodigo() {
		String resultado = "";
		ArrayList<Inspector> listaAux = new ArrayList<>(); //Creo una nueva para no alterar la original
		listaAux.addAll(inspectores); //Añado todo
		listaAux.sort(Comparator.naturalOrder()); //Ordeno por orden natural (código)

		for (int i = 0; i < listaAux.size(); i++) {
			resultado += "\n" + listaAux.get(i); //Añado al inspector

			//Si hay sanciones (no hace falta instanceof porque si no es InspectorSanidad dará null, pero el ejemplo lo pone, así que lo pondré
			if (listaAux.get(i) instanceof InspectorSanidad) {
				resultado += "\n-- SANCIONES IMPUESTAS --";

				ArrayList<Sancion> multasPropias = Sancion.sancionesInspector(listaAux.get(i).getCodigo());

				//Método reciclando función de ArrayList
//				if (multasPropias != null) {
//
//					//Hasta el final del ArrayList de sanciones. También se puede acceder con getter del Set de Sanciones pero pierde encapsulación
//					for (int j = 0; j < multasPropias.size(); j++) {
//						resultado += "\n" + multasPropias.get(j); //Añado las multas
//					}
//					
//				}
				//Método con Iterator
				if (multasPropias != null) {
					for (Iterator<Sancion> it = multasPropias.iterator(); it.hasNext();) {
						resultado += "\n" + it.next(); //Añado las multas
					}
				}

			}

		}

		return resultado; //Para que quede más bonito, podemos separar más los policías con retornos de carro y luego hacer strip() o stripTrailing()
		//Pero me ceñí más al ejemplo de examen
	}

	public String mostrarTodosInspectoresOrdenadoPorNombre() {
		String resultado = "";
		ArrayList<Inspector> listaAux = new ArrayList<>(); //Creo una nueva para no alterar la original
		listaAux.addAll(inspectores); //Añado todo
		listaAux.sort((p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre())); //Ordeno por orden natural (código)

		for (int i = 0; i < listaAux.size(); i++) {
			resultado += "\n" + listaAux.get(i); //Añado al inspector
		}

		return resultado;
	}

	public String mostrarInspectoresPonenSanciones() {
		String resultado = "";

		for (int i = 0; i < inspectores.size(); i++) {
			if (Sancion.sancionesInspector(inspectores.get(i).getCodigo()) != null) {
				resultado += "\n" + inspectores.get(i); //Añado al inspector
			}
		}

		return resultado;
	}

}