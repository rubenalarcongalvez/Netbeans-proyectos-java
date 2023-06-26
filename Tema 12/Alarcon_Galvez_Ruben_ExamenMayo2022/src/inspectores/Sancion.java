package inspectores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Sancion {
	private final String codigo;
	private final double importe;
	private static int contador = 100;
	private static HashMap<String, HashSet<Sancion>> sanciones = new HashMap<>();

	public Sancion(String codigoInspector, double importe) {
		this.codigo = "S - " + contador++; //++ al final para sumar después porque empieza en el 100
		if (importe < 100) {
			this.importe = 100;
		} else {
			this.importe = importe;
		}
		
		//Si hay multas, se añade, si no, se crea el ArrayList y luego se añade
		if (sanciones.containsKey(codigoInspector)) {
			sanciones.get(codigoInspector).add(this);
		} else {
			sanciones.put(codigoInspector, new HashSet<>());
			sanciones.get(codigoInspector).add(this);
		}
	}

	public double getImporte() {
		return importe;
	}

	public static int numeroSanciones() {
		int numero = 0;
		
		Collection<HashSet<Sancion>> lista = sanciones.values();
		
		for (Iterator<HashSet<Sancion>> it = lista.iterator(); it.hasNext(); ) {
			numero += it.next().size();
		}
		
		return numero;
	}
	
	public static ArrayList<Sancion> sancionesInspector(String codigoInspector) {
		ArrayList<Sancion> lista = null;
		
		if (sanciones.get(codigoInspector) != null) {
			lista = new ArrayList<>();
			lista.addAll(sanciones.get(codigoInspector));
		}
		
		return lista;
	}
	
	public static Set<String> inspectoresConSanciones() {
		return sanciones.keySet();
	}
	
	@Override
	public String toString() {
		return "\tCódigo: " + codigo + "\n\tImporte: " + importe;
	}
	
}