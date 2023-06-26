package policias;

import java.util.ArrayList;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class PoliciaTransito extends Policia {

	private ArrayList<Multa> multas;

	public PoliciaTransito(String nombre) {
		super('T', nombre);
		multas = new ArrayList<>();
	}

	public void multar(double importe) {
		multas.add(new Multa(importe));
		actualizarSueldos();
	}

	private void actualizarSueldos() {
		super.sueldo += (multas.get(multas.size() - 1).getImporte() * 0.1); //Obtiene el 10% del importe de la ultima multa
	}

	public int numeroMultas() {
		return multas.size();
	}

	@Override
	public String toString() {
		String resultado = super.toString();
		resultado += "\n-- MULTAS --";
		
		for (int i = 0; i < multas.size(); i++) {
			resultado += "\n" + multas.get(i);
		}

		return resultado;
	}

}