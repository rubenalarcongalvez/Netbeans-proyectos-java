package Policias;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Multa {

	private final String codigo;
	private final double importe;
	private static int contador = 100;
	private static HashMap<String, ArrayList<Multa>> multas = new HashMap<>();

	public Multa(String codigoPolicia, int importe) {
		this.codigo = "M - " + contador++;
		this.importe = importe;
		
		if (multas.containsKey(codigoPolicia)) { //Si ya hay multas
			multas.get(codigoPolicia).add(this); //Se añade el valor la multa al ArrayList del HashMap
			//No hace falta poner put porque ya se ha modificado el ArrayList de dentro
		} else {
			multas.put(codigoPolicia, new ArrayList<>()); //Se crea una nueva entrada
			multas.get(codigoPolicia).add(this); //Se añade después el valor la multa al ArrayList porque ya se creó la entrada
		}

	}

	public double getImporte() {
		return importe;
	}

	public static int numeroMultas() {
		return contador - 100; //O con return multas.values().size() + 1;
	}

	public static ArrayList<Multa> multasPolicia(String codigoPolicia) {
		return multas.get(codigoPolicia);
	}

	public static Set<String> policiasConMultas() {
		return multas.keySet();
	}

	@Override
	public String toString() {
		return "\n\tCódigo: " + codigo + "\n\tImporte: " + importe;
	}

}