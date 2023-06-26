package aplicacion;

import base.*;
import coleccion.TiendaAnimales;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import utilidades.EntradaTeclado;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Aplicacion {

	public static int menu(int eleccion) {
		System.out.println("---------- MENÚ ----------");
		System.out.println("1. Insertar animal.");
		System.out.println("2. Eliminar animal por código.");
		System.out.println("3. Eliminar animal por nombre.");
		System.out.println("4. Mostrar toda la información de los animales.");
		System.out.println("5. Mostrar toda la información de los perros con longitud mayor a 50cm");
		System.out.println("6. Eliminar de la tienda todos los gatos mayores de 8 años.");
		System.out.println("7. Mostrar todos los animales ordenados alfabéticamente.");
		System.out.println("0. Salir del programa");

		eleccion = EntradaTeclado.pedirEntero("\nIntroduzca un número del 0 al 7: ");

		return eleccion;
	}

	public static Animal crearAnimal() { //Crea un animal (haciendo que el usuario decida)
		String nombre, eleccion;
		int edad, longitud;
		Animal animal = null;

		do {
			eleccion = EntradaTeclado.pedirPalabraLimpiandoBuffer("Elija un animal (perro o gato): ");
		} while (!eleccion.equalsIgnoreCase("perro") && !eleccion.equalsIgnoreCase("gato"));

		nombre = EntradaTeclado.pedirPalabraLimpiandoBuffer("Dígame su nombre: ");

		if (eleccion.equalsIgnoreCase("perro")) {
			longitud = EntradaTeclado.pedirEntero("Dígame su longitud (en cm): ");
			animal = new Perro(nombre, longitud);
		} else if (eleccion.equalsIgnoreCase("gato")) {
			edad = EntradaTeclado.pedirEntero("Dígame su edad: ");
			animal = new Gato(nombre, edad);
		}

		return animal;
	}

	public static void main(String[] args) {
		int eleccion = -1;
		Animal animal;
		Perro perro;
		Gato gato;
		List<Animal> animalesEliminados;
		List<Animal> animalesOrdenados;
		String codigo, nombre;
		Iterator<Animal> iterador;

		TiendaAnimales<Animal> tienda = new TiendaAnimales<>();

		do {
			eleccion = menu(eleccion);
			switch (eleccion) {
				case 1 -> {
					animal = crearAnimal();
					tienda.insertarAnimal(animal);
				}
				case 2 -> {
					codigo = EntradaTeclado.pedirPalabraLimpiandoBuffer("Dime el código del animal a eliminar (An-x): ");
					System.out.println("Animal eliminado:\n" + tienda.eliminarPorCodigo(codigo));
				}
				case 3 -> {
					nombre = EntradaTeclado.pedirPalabraLimpiandoBuffer("Dime el nombre del animal a eliminar: ");
					animalesEliminados = tienda.eliminarAnimalPorNombre(nombre);
					
					System.out.println("Animales eliminados:");
					for (Iterator<Animal> it = animalesEliminados.iterator(); it.hasNext();) {
						System.out.println(it.next());
					}
				}
				case 4 -> {
					iterador = tienda.iteradorTienda();

					while (iterador.hasNext()) {
						System.out.println(iterador.next());
					}
				}
				case 5 -> {
					iterador = tienda.iteradorTienda();
					
					while (iterador.hasNext()) {
						animal = iterador.next(); //Para comprobar el animal que es
						
						//Si es un perro y su longitud es mayor a 50cm, lo imprime
						if (animal instanceof Perro) {
							perro = (Perro) animal;
							if (perro.getLongitud() > 50) System.out.println(perro);
						}
					}
				}
				case 6 -> {
					iterador = tienda.iteradorTienda();
					
					while (iterador.hasNext()) {
						animal = iterador.next(); //Para comprobar el animal que es
						
						//Si es un gato y su edad es mayor que 80 años, lo elimina
						if (animal instanceof Gato) {
							gato = (Gato) animal;
							if (gato.getEdad() > 8) iterador.remove();
						}
					}
				}
				case 7 -> {
					iterador = tienda.iteradorTienda();

					animalesOrdenados = new ArrayList<>();

					//Añadimos a otra lista para no alterar la principal
					while (iterador.hasNext()) {
						animalesOrdenados.add(iterador.next());
					}

					//Ordenamos por nombre
					Collections.sort(animalesOrdenados, (a1, a2) -> a1.getNombre().compareToIgnoreCase(a2.getNombre()));

					for (Iterator<Animal> it = animalesOrdenados.iterator(); it.hasNext();) {
						System.out.println(it.next());
					}
				}
			}

		} while (eleccion != 0);
	}
}