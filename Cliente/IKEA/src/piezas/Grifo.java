package piezas;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Grifo extends Pieza {
	private String material;
	private boolean conFiltro;

	public Grifo(String material, boolean conFiltro, String codigo, String nombre, String descripcion, String dimensiones, double precio, int stock) {
		super(codigo, nombre, descripcion, dimensiones, precio, stock);
		this.material = material;
		this.conFiltro = conFiltro;
	}

	@Override
	public String toString() { //Se puede poner super.toString() pero no está en el orden adecuado entonces
		String resultado = "Código: " + codigo + "\nNombre: " + nombre + "\nDescripción: " + descripcion
				+ "\nDimensiones: " + dimensiones + " cm" + "\nMaterial: " + material;
		
		resultado += "\nTiene filtro: ";
		
		if (conFiltro) {
			resultado += "Sí";
		} else {
			resultado += "No";
		}
		
		resultado += "\nPrecio: " + precio + "€\nStock: " + stock;
		
		return resultado;
	}
	
}