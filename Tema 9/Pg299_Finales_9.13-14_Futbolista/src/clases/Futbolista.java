/*
9.13
Diseñar la clase Futbolista con los siguientes atributos: dni, nombre, edad y número de	
goles. Implementar:	
- Un constructor y los métodos toString() y equals() (este último basado en el DNI).	
- La interfaz Comparable con un criterio de ordenación basado también en el DNI.	
- Un comparador para hacer ordenaciones basadas en el nombre y otro basado en la	
  edad.
- Crear una tabla con 5 futbolistas y mostrarlos ordenados por DNI, por nombre y por edad.	

9.14
Añadir a la Actividad de aplicación 9.13 un comparador que ordene los futbolistas por	
edades y, para aquellos que tienen la misma edad, por nombres.	
 */
package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Futbolista implements Comparable<Futbolista> {

	private final String dni;
	private String nombre;
	private short edad;
	private short numGoles;

	public Futbolista(String dni, String nombre, int edad, int numGoles) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = (short) Math.abs((short) edad);
		this.numGoles = (short) Math.abs((short) numGoles);
	}

	public String getNombre() {
		return nombre;
	}

	public short getEdad() {
		return edad;
	}

	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;

		try {
			Futbolista fut = (Futbolista) obj; //Se especifica qué clase de objeto es

			if (this.dni.equalsIgnoreCase(fut.dni)) {
				resultado = true;
			}
		} catch (ClassCastException ex) {
			System.out.print("No es un futbolista el segundo objeto: ");
		} catch (Exception ex) {
			System.out.println(ex);
		}

		return resultado;
	}

	@Override
	public String toString() {
		return "Futbolista: " + nombre
				+ "\tDNI: " + dni
				+ "\tEdad: " + edad
				+ "\tNúmero de goles: " + numGoles;
	}

	@Override
	public int compareTo(Futbolista fut) {
		return this.dni.compareToIgnoreCase(fut.dni);
	}

}
