
import clases.Empleado;

/*
Enunciado
*/

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
		Empleado e = new Empleado("Sancho", (byte) 25, 1.80, 175.49);
        System.out.println(e.getNombre()); //muestra un atributo heredado
		System.out.println(e.getSalario()); //muestra un atributo propio
    }
}