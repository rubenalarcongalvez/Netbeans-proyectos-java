package compra;

import java.io.Serializable;
import java.util.ArrayList;
import piezas.Almacen;
import piezas.Pieza;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Carrito implements Serializable {

	private ArrayList<ElementoCarrito> carrito;
	private double subtotal;

	public Carrito() {
		carrito = new ArrayList<>();
	}

	public boolean anadirElemento(Almacen almacen, String codigoPieza, int cantidad) {
		boolean insertado = true;
		Pieza pieza = almacen.devolverProductoPorCodigo(codigoPieza);
		ElementoCarrito elementoCarrito = new ElementoCarrito(pieza, devolverCantidad(codigoPieza));
		ElementoCarrito elemento = new ElementoCarrito(pieza, cantidad);

		if (!carrito.contains(elementoCarrito) && pieza.getStock() >= cantidad) {
			carrito.add(elemento);
			subtotal += (pieza.getPrecio() * cantidad);
		} else if (carrito.contains(elementoCarrito)) {
			for (int i = 0; i < carrito.size(); i++) {
				if (carrito.get(i).equals(elementoCarrito)) {
					if (carrito.get(i).getCantidad() + cantidad <= almacen.devolverProductoPorCodigo(codigoPieza).getStock()) {
						carrito.get(i).setCantidad(devolverCantidad(codigoPieza) + cantidad);
						subtotal += (pieza.getPrecio() * cantidad);
					} else {
						insertado = false;
					}

				}
			}
		} else {
			insertado = false;
		}
		return insertado;
	}

	public int devolverCantidad(String codigo) {
		int cantidad = 0;

		for (int i = 0; i < carrito.size(); i++) {
			if (carrito.get(i).getElemento().getCodigo().equals(codigo)) {
				cantidad = carrito.get(i).getCantidad();
			}
		}

		return cantidad;
	}

	public boolean eliminarElemento(ElementoCarrito elemento) {
		return carrito.remove(elemento);
	}

	public boolean modificarElemento(Almacen almacen, String codigoPieza, int cantidad) {
		boolean modificado = true;
		Pieza pieza = almacen.devolverProductoPorCodigo(codigoPieza);
		ElementoCarrito elementoCarrito = new ElementoCarrito(pieza, devolverCantidad(codigoPieza));

		if (carrito.contains(elementoCarrito)) {
			for (int i = 0; i < carrito.size(); i++) {
				if (carrito.get(i).equals(elementoCarrito)) {
					if (almacen.devolverProductoPorCodigo(codigoPieza).getStock() <= almacen.buscarStockProducto(pieza)) {
						subtotal += (pieza.getPrecio() * cantidad) - (pieza.getPrecio() * devolverCantidad(codigoPieza));
						carrito.get(i).setCantidad(cantidad);
					} else {
						modificado = false;
					}

				}
			}
		} else {
			modificado = false;
		}
		return modificado;
	}
	
	public void limpiarCarrito() {
		carrito = new ArrayList<>();
		subtotal = 0;
	}
	
	public boolean finalizarCompra(Almacen almacen) {
		boolean finalizada = false;
		
		if (!carrito.isEmpty()) { //Si no está vacío, restamos las cantidades y finalizamos
			for (int i = 0; i < carrito.size(); i++) {
				almacen.modificarPiezaPorCodigo(carrito.get(i).getElemento().getCodigo(), almacen.buscarStockProductoPorCodigo(carrito.get(i).getElemento().getCodigo()) - carrito.get(i).getCantidad());
			}
			
			System.out.print("\n--- Compra realizada ----"
					+ "\nTe enviaremos un correo de confirmación de pedido con todos los datos y seguimiento a ");
			
			finalizada = true;
		} else {
			System.out.println("\n--- No tienes productos en tu carrito ---");
		}
		
		return finalizada;
	}
	
	public boolean carritoVacio() {
		boolean vacio = true;
		
		if(!carrito.isEmpty()) {
			vacio = false;
		}
		
		return vacio;
	}
	
	@Override
	public String toString() {
		String resultado = "";

		for (int i = 0; i < carrito.size(); i++) {
			resultado += "\n=== ELEMENTO " + (i + 1) + " ===\n" + carrito.get(i) + "\n";
		}

		resultado += "\nSUBTOTAL: " + subtotal + "€";

		return resultado;
	}

}