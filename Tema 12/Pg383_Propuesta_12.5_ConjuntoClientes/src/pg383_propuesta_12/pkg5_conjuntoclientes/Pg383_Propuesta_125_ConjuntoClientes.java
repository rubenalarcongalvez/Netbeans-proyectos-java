/*
A partir de conjuntoClientes del ejemplo, crea otro conjunto con los mismos elementos
ordenados por edad y otro con los clientes ordenados por nombre
*/

package pg383_propuesta_12.pkg5_conjuntoclientes;

import clases.Cliente;
import java.util.TreeSet;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg383_Propuesta_125_ConjuntoClientes {

    public static void main(String[] args) {
        TreeSet<Cliente> conjuntoClientes = new TreeSet<>();
		
		conjuntoClientes.add(new Cliente("111", "Marta", "12/02/2000"));
		conjuntoClientes.add(new Cliente("115", "Jorge", "16/03/1999"));
		conjuntoClientes.add(new Cliente("112", "Carlos", "01/10/2002"));
		
		System.out.println("Clientes:\n" + conjuntoClientes);
		
		TreeSet<Cliente> conjuntoClientesEdad = new TreeSet<>((Cliente o1, Cliente o2) -> o1.edad() - o2.edad());
		conjuntoClientesEdad.addAll(conjuntoClientes);
		System.out.println("Clientes por edades:\n" + conjuntoClientesEdad);
		
		TreeSet<Cliente> conjuntoClientesNombre = new TreeSet<>((Cliente o1, Cliente o2) -> o1.getNombre().compareTo(o2.getNombre()));
		conjuntoClientesNombre.addAll(conjuntoClientes);
		System.out.println("Clientes por nombres:\n" + conjuntoClientesNombre);
    }
}