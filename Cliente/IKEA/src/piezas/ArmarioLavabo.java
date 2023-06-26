package piezas;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class ArmarioLavabo extends Pieza {
	private String material;
	private String color;

	public ArmarioLavabo(String material, String color, String codigo, String nombre, String descripcion, String dimensiones, double precio, int stock) {
		super(codigo, nombre, descripcion, dimensiones, precio, stock);
		this.material = material;
		this.color = color;
	}

	@Override
	public String toString() { //Se puede poner super.toString() pero no está en el orden adecuado entonces
		String resultado = "Código: " + codigo + "\nNombre: " + nombre + "\nDescripción: " + descripcion
				+ "\nDimensiones: " + dimensiones + " cm" + "\nMaterial: " + material + "\nColor: " + color;
		
		resultado += "\nPrecio: " + precio + "€\nStock: " + stock;
		
		return resultado;
	}
	
}