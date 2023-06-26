package examenmayo2021;

import policias.*;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class ExamenMayo2021 {

    public static void main(String[] args) {
        ComisariaPolicia<Policia> comisaria1 = new ComisariaPolicia<>();
		
		comisaria1.insertarPolicia(new JefePolicia("Andres"));
		
		PoliciaTransito sergio = new PoliciaTransito("Sergio");
		comisaria1.insertarPolicia(sergio);
		sergio.multar(150);
		sergio.multar(300);
		
		PoliciaTransito ernesto = new PoliciaTransito("Ernesto");
		comisaria1.insertarPolicia(ernesto);
		ernesto.multar(700);
		
		PoliciaTransito javier = new PoliciaTransito("Javier");
		comisaria1.insertarPolicia(javier);
		
		System.out.println(comisaria1.mostrarTodosPoliciasYMultasOrdenadoPorCodigo());
		
		System.out.println("\n\nEl número de multas de la comisaría 1 es " + comisaria1.numeroMultas());
		
		System.out.println("\nLos policias que han puesto multas son:");
		System.out.println(comisaria1.mostrarPoliciasPonenMultas());
    }
}