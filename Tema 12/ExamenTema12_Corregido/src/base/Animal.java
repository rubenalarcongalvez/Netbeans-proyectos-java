package base;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public abstract class Animal {
	private static int contador;
	private String nombre;
	private String codigo;

	public Animal(String nombre) {
		this.nombre = nombre;
		this.codigo = "An-" + ++contador; //Para que sume antes de asignarlo a la variable
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public String getCodigo() {
		return codigo;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nCódigo: " + codigo;
	}
}