package clases;

/*
Diseña una pequeña agenda, que muestre el siguiente menú:	
1. Nuevo contacto.	
2. Buscar por nombre.	
3. Mostrar todos.	
4. Salir.

En ella, guardaremos el nombre y el teléfono de un máximo de 20 personas.
La opción 1 nos permitirá introducir un nuevo contacto siempre y cuando la agenda no	
esté llena, comprobando que el nombre no se encuentra insertado ya.

La opción 2 muestra todos los teléfonos que coinciden con la cadena que se busca. Por	
ejemplo, si tecleamos "Pe", mostrará el teléfono de Pedro, de Pepe y de Petunia.

La opción 3 mostrará un listado con toda la información (nombres y teléfonos) ordena-	
dos alfabéticamente por el nombre.

Por último, la opción 4 guarda todos los datos de la agenda en el archivo agenda.txt.	
La próxima vez que se ejecute la aplicación, si hay datos guardados, se cargarán en memoria.
 */



/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Contacto implements Comparable<Contacto> {
	protected String nombre;
	protected String telefono;
	
	public Contacto(String nombre, String telefono) {		
		this.nombre = nombre;
		this.telefono = telefono;
	}

	@Override
	public int compareTo(Contacto nom) {
		return this.nombre.compareTo(nom.nombre);
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nTeléfono: " + telefono;
	}
	
}