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
import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Agenda {

	public Contacto[] listaContactos;
	private static int numero = -1;

	public Agenda() {
		listaContactos = new Contacto[20];

		for (int i = 0; i < listaContactos.length; i++) {
			listaContactos[i] = new Contacto("Default", ":000000000:"); //Para que no quede a null y evitamos NullPointer
		}
	}

	public void insertarContacto(String nombre, String telefono, boolean mostrar) { //El mostrar es puramente estético
		//(para que no se muestre al iniciar que se cargan los datos)
		numero++;

		if (listaContactos.length > numero) {
			if (nombreRepetido(nombre) == false
					&& nombre.length() <= 30
					&& nombre.length() > 0
					&& telefono.length() == 9) { //Si no lo encuentra en la lista y está en el formato adecuado
				listaContactos[numero].nombre = nombre;
				listaContactos[numero].telefono = telefono;

				if (mostrar == true) { //Si estoy en el display del switch, si estoy cargando datos, no se muestra
					System.out.println("Contacto agregado con éxito.");
				}
			} else {
				System.out.println("Nombre o número de teléfono no válido o ya está registrado.");
			}
		} else {
			System.out.println("No se pueden introducir más contactos en la agenda.");
		}
	}

	public boolean nombreRepetido(String nombre) {
		boolean resultado = false;

		for (int i = 0; i <= numero; i++) {
			if (listaContactos[i].nombre.equals(nombre)) {
				resultado = true;
			}
		}

		return resultado;
	}

	public void mostrarCoincidencias(String nombreContiene) {
		boolean hayCoincidencia = false;

		for (Contacto listaContacto : listaContactos) { //Si en alguna parte de la lista completa está el nombre o lo contiene y no es por defecto
			if (listaContacto.nombre.contains(nombreContiene) && !(listaContacto.nombre.equals("Default"))) {
				hayCoincidencia = true;
				System.out.println(listaContacto.nombre + ": " + listaContacto.telefono);
			}
		}

		if (hayCoincidencia == false) {
			System.out.println("No hay coincidencias");
		}
	}

	@Override
	public String toString() {
		String resultado = "\n";

		Arrays.sort(listaContactos); //Ordenamos
		//Mostramos
		for (Contacto listaContacto : listaContactos) {
			if (!(listaContacto.telefono.equals(":000000000:"))) {
				//Excluímos a los default
				resultado += "Nombre: " + listaContacto.nombre + "\nTeléfono: " + listaContacto.telefono + "\n";
			}
		}

		return resultado;
	}

}