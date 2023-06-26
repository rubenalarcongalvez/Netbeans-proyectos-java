package piezas;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Almacen implements Serializable {

	private ArrayList<Pieza> almacen;

	public Almacen() {
		almacen = new ArrayList<>();
	}

	public boolean anadirPieza(Pieza pieza) {
		boolean insertada = false;

		if (!almacen.contains(pieza)) {
			almacen.add(pieza);
			insertada = true;
		}

		return insertada;
	}

	public boolean eliminarPieza(Pieza pieza) {
		return almacen.remove(pieza);
	}

	public boolean modificarPieza(Pieza pieza, int stock) {
		boolean modificado = false;

		for (int i = 0; i < almacen.size(); i++) {
			if (almacen.get(i).getCodigo().equals(pieza.getCodigo())) {
				almacen.get(i).setStock(stock);
				modificado = true;
			}
		}

		return modificado;
	}
	
	public void modificarPiezaPorCodigo(String codigoPieza, int stock) {
		for (int i = 0; i < almacen.size(); i++) {
			if (almacen.get(i).getCodigo().equals(codigoPieza)) {
				almacen.get(i).setStock(stock);
			}
		}
	}

	public String mostrarStock() {
		String stock = "";

		for (int i = 0; i < almacen.size(); i++) {
			if (almacen.get(i).getStock() > 0) {
				stock += "\n=== ELEMENTO " + (i + 1) + " ===\n" + almacen.get(i) + "\n";
			}
		}

		return stock;
	}
	
	public boolean buscarProductoPorNombre(String nombre) {
		boolean encontrado = false;

		for (int i = 0; i < almacen.size(); i++) {
			if (almacen.get(i).getNombre().toLowerCase().contains(nombre.toLowerCase())) { //Para hacer ignorecase
				System.out.println("\n=== ELEMENTO " + (i + 1) + " ===\n" + almacen.get(i) + "\n");
				encontrado = true;
			}
		}

		return encontrado;
	}
	
	public boolean buscarProductoPorCodigo(String codigo) {
		boolean encontrado = false;

		for (int i = 0; i < almacen.size(); i++) {
			if (almacen.get(i).getCodigo().equals(codigo)) { //equals porque tiene que ser exacto
				System.out.println("\n=== ELEMENTO " + (i + 1) + " ===\n" + almacen.get(i) + "\n");
				encontrado = true;
			}
		}

		return encontrado;
	}
	
	public Pieza devolverProductoPorCodigo(String codigo) {
		Pieza pieza = null;

		for (int i = 0; i < almacen.size(); i++) {
			if (almacen.get(i).getCodigo().equals(codigo)) { //equals porque tiene que ser exacto
				pieza = almacen.get(i);
			}
		}

		return pieza;
	}
	
	public boolean buscarProductoPorRangoPrecio(double minimo, double maximo) {
		boolean encontrado = false;

		for (int i = 0; i < almacen.size(); i++) {
			if (almacen.get(i).getPrecio() >= minimo && almacen.get(i).getPrecio() <= maximo) {
				System.out.println("\n=== ELEMENTO " + (i + 1) + " ===\n" + almacen.get(i) + "\n");
				encontrado = true;
			}
		}

		return encontrado;
	}

	public int buscarStockProducto(Pieza pieza) {
		int stock = 0;

		for (int i = 0; i < almacen.size(); i++) {
			if (almacen.get(i).equals(pieza)) {
				stock = almacen.get(i).getStock();
			}
		}

		return stock;
	}
	
	public int buscarStockProductoPorCodigo(String codigo) {
		int stock = 0;

		for (int i = 0; i < almacen.size(); i++) {
			if (almacen.get(i).getCodigo().equals(codigo)) {
				stock = almacen.get(i).getStock();
			}
		}

		return stock;
	}

	@Override
	public String toString() {
		String resultado = "";

		for (int i = 0; i < almacen.size(); i++) {
			resultado += "\n=== ELEMENTO " + (i + 1) + " ===\n" + almacen.get(i) + "\n";
		}

		return resultado;
	}

}
