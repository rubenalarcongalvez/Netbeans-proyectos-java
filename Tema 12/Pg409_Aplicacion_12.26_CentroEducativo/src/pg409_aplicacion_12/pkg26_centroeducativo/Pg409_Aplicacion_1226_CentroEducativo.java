/*
Un centro educativo necesita distribuir de forma aleatoria a los alumnos de un curso 
entre los grupos disponibles para ese curso. 

Diseña la función	
	List<List<String>> repartoAlumnos (List<String> lista, int numGrupos)
que devuelve una lista de listas, cada una de las cuales corresponde a un grupo.	

Cada nombre de la lista de alumnos se asigna a uno de los grupos.	
 */
package pg409_aplicacion_12.pkg26_centroeducativo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg409_Aplicacion_1226_CentroEducativo {

	public static List<List<String>> repartoAlumnos(List<String> lista, int numGrupos) {
		ArrayList<List<String>> alumnos = new ArrayList<>();

		//Aleatorizamos los alumnos
//		lista.sort((o1, o2) -> {
//			if ((int) (Math.random() * 2) == 0) {
//				return 1;
//			} else {
//				return -1;
//			}
//		}); //Comparamos si hacer que se quede igual o cambiarlo de sitio
		Collections.shuffle(lista); //Podemos usar directamente el método shuffle

		//Añadimos los grupos que queramos
		for (int i = 0; i < numGrupos; i++) {
			alumnos.add(new ArrayList<>());
		}

		int contador = 0;

		for (String alumno : lista) {
			//Distribuimos
			alumnos.get(contador).add(alumno);

			//Controlamos el contador
			if (contador < numGrupos - 1) {
				contador++;
			} else {
				contador = 0;
			}
		}

		return alumnos;
	}

	public static void main(String[] args) {
		ArrayList<String> listaAlumnos = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			listaAlumnos.add("Alumno " + i);
		}

		ArrayList<List<String>> alumnos = (ArrayList<List<String>>) (repartoAlumnos(listaAlumnos, 5));

		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println("Grupo " + (i + 1) + ":");
			for (Iterator<String> it = alumnos.get(i).iterator(); it.hasNext();) { //De mientras tenga siguiente
				System.out.println(it.next());
			}

			System.out.println();
		}

	}
}