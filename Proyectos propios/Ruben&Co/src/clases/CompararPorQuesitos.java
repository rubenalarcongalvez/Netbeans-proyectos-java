package clases;

import java.util.Comparator;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class CompararPorQuesitos implements Comparator<Equipo> {

	@Override
	public int compare(Equipo eq1, Equipo eq2) {
		return eq1.getNumQuesitos() - eq2.getNumQuesitos(); //Si es negativo, si es positivo o si es 0, por lo que no hace falta el if
	}
	
}
