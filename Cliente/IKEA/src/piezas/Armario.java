package piezas;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Armario extends Pieza {
	private String material;
	private String color;
	private boolean iluminacion;
	private int espejos;

	public Armario(String material, String color, boolean iluminacion, int espejos, String codigo, String nombre, String descripcion, String dimensiones, double precio, int stock) {
		super(codigo, nombre, descripcion, dimensiones, precio, stock);
		this.material = material;
		this.color = color;
		this.iluminacion = iluminacion;
		this.espejos = espejos;
	}

	@Override
	public String toString() { //Se puede poner super.toString() pero no está en el orden adecuado entonces
		String resultado = "Código: " + codigo + "\nNombre: " + nombre + "\nDescripción: " + descripcion
				+ "\nDimensiones: " + dimensiones + " cm" + "\nMaterial: " + material + "\nColor: " + color + "\nEspejos: " + espejos;
		
		resultado += "\nTiene iluminación: ";
		
		if (iluminacion) {
			resultado += "Sí";
		} else {
			resultado += "No";
		}
		
		resultado += "\nPrecio: " + precio + "€\nStock: " + stock;
		
		return resultado;
	}
	
}