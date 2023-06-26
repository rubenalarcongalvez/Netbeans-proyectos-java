package piezas;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Almacenaje extends Pieza {
	private String tipoOrganizacion;

	public Almacenaje(String tipoOrganizacion, String codigo, String nombre, String descripcion, String dimensiones, double precio, int stock) {
		super(codigo, nombre, descripcion, dimensiones, precio, stock);
		this.tipoOrganizacion = tipoOrganizacion;
	}

	@Override
	public String toString() { //Se puede poner super.toString() pero no está en el orden adecuado entonces
		String resultado = "Código: " + codigo + "\nNombre: " + nombre + "\nDescripción: " + descripcion
				+ "\nDimensiones: " + dimensiones + " cm" + "\nTipo de organización: " + tipoOrganizacion;
		
		resultado += "\nPrecio: " + precio + "€\nStock: " + stock;
		
		return resultado;
	}
	
}