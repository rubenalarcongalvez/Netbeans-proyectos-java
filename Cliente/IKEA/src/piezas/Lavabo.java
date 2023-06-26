package piezas;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Lavabo extends Pieza {
	private String material;
	private String color;
	private boolean conFiltro;
	private boolean conSifon;

	public Lavabo(String material, String color, boolean conFiltro, boolean conSifon, String codigo, String nombre, String descripcion, String dimensiones, double precio, int stock) {
		super(codigo, nombre, descripcion, dimensiones, precio, stock);
		this.material = material;
		this.color = color;
		this.conFiltro = conFiltro;
		this.conSifon = conSifon;
	}

	@Override
	public String toString() { //Se puede poner super.toString() pero no está en el orden adecuado entonces
		String resultado = "Código: " + codigo + "\nNombre: " + nombre + "\nDescripción: " + descripcion
				+ "\nDimensiones: " + dimensiones + " cm" + "\nMaterial: " + material + "\nColor: " + color;
		
		resultado += "\nTiene filtro: ";
		
		if (conFiltro) {
			resultado += "Sí";
		} else {
			resultado += "No";
		}
		
		resultado += "\nTiene sifón: ";
		
		if (conSifon) {
			resultado += "Sí";
		} else {
			resultado += "No";
		}
		
		resultado += "\nPrecio: " + precio + "€\nStock: " + stock;
		
		return resultado;
	}
	
}