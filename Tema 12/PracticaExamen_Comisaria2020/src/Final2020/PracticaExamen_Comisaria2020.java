package Final2020;

import Policias.*;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class PracticaExamen_Comisaria2020 {

	public static void main(String[] args) {
		ComisariaPolicia<Policia> comisaria = new ComisariaPolicia<>();

		comisaria.insertarPolicia(new PoliciaTransito("Sergio"));
		comisaria.insertarPolicia(new PoliciaTransito("Ernesto"));
		comisaria.insertarPolicia(new PoliciaAdministrativo("Paco"));
		comisaria.insertarPolicia(new JefePolicia("Andres"));

		//Sergio puso 2 multas
		new Multa("T - 1", 150);
		new Multa("T - 1", 300);

		//Ernesto puso 1 multa
		new Multa("T - 2", 700);

		System.out.println("Mostrar todos los policías y multas ordenando por código:\n");

		System.out.println(comisaria.mostrarTodosPoliciasYMultasOrdenadoPorCodigo());

		System.out.println("\n\nMostrar todos los policías ordenado por nombre:\n");

		System.out.println(comisaria.mostrarTodosPoliciasOrdenadoPorNombre());

		System.out.println("\nEl número de multas es " + Multa.numeroMultas());
		System.out.println("\n\nLos policías que han puesto multas son:\n");

		System.out.println(comisaria.mostrarPoliciasPonenMultas());
	}
}