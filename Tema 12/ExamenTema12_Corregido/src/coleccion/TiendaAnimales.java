package coleccion;

import base.Animal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 * @param <T>
 */
public class TiendaAnimales<T extends Animal> { //Cualquiera que herede de Animal (o Animal), por ejemplo tienda solo de perros, solo gatos o animales en general.

	private List<T> animales; //Para admitir cualquier lista y no solo por ejemplo ArrayList

	public TiendaAnimales() {
		animales = new ArrayList<>();
	}

	public void insertarAnimal(T animal) { //Entiendo que se hace en el main y solo le tengo que pasar el animal
		this.animales.add(animal);
	}

	public T eliminarPorCodigo(String codigo) {
		int indice = 0;
		T eliminado = null;
		
		while ((indice < animales.size()) && (eliminado == null)) { //Tienen que cumplirse ambas (porque la List se va reduciendo y hay que adaptarse)
			if (animales.get(indice).getCodigo().equalsIgnoreCase(codigo)) {
				eliminado = animales.get(indice);
				animales.remove(eliminado);
			}
			indice++;
		}

		return eliminado;
	}

	public List<T> eliminarAnimalPorNombre(String nombre) {
		int indice = 0;
		T elemento;
		List<T> listaEliminados = new ArrayList<>();
		int tamanoLista = animales.size(); //Para así no hay que llamar al método tanto y no vamos a eliminar elementos sino que los copiamos a otra lista
		
		while ((indice < tamanoLista)) {
			elemento = animales.get(indice);
			if (elemento.getNombre().equalsIgnoreCase(nombre)) {
				listaEliminados.add(elemento);
			}
			indice++;
		}
		
		animales.removeAll(listaEliminados); //Ahora SÍ eliminamos de nuestra List original

		return listaEliminados;
	}

	//Para todo lo que quiere hacer el usuario en el main
	public Iterator<T> iteradorTienda() {
		return animales.iterator(); //El iterador cuando lo llamamos, bloquea que llamemos a los elementos de la colección cuando estemos en ese método (bucle)
		//y solo podremos modificar la List con el iterador mientras estemos en ese bucle
	}

}