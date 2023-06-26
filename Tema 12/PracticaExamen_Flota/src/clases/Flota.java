package clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 * @param <Barco>
 */
public class Flota<Barco> implements Serializable {

	private ColeccionDinamica<Barco> flota;

	public Flota() {
		this.flota = new ColeccionDinamica<>();
	}

	public int numeroElementos() {
		return flota.numeroElementos();
	}

	public boolean insertarBarco(Barco b) {
		boolean resultado = true;
		
		if (!flota.getColeccion().contains(b)) {
			flota.getColeccion().add(b);
		} else {
			resultado = false;
		}
		
		return resultado;
	}

	public boolean eliminarBarco(Barco b) {
		return flota.getColeccion().remove(b);
	}
	
	public void ordenada() {
		ArrayList<Barco> ordenada = new ArrayList<>();
		ordenada.addAll(flota.getColeccion());
		ordenada.sort((Comparator<? super Barco>) Comparator.naturalOrder());
		
		for (Iterator<Barco> it = ordenada.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
	}

	public Iterator<Barco> iterador() {
		return (Iterator<Barco>) flota.getColeccion().iterator();
	}

}