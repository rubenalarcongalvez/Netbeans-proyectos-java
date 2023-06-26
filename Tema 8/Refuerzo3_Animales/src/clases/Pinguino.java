/*
Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,	
al menos, tres métodos específicos de cada clase y redefine el/los método/s	
cuando sea necesario. Prueba las clases creadas en un programa en el que se	
instancien objetos y se les apliquen métodos.
*/

package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pinguino extends Ave {

	private boolean nadando;
	
	public Pinguino(String nombre, int edad, int periodoIncuvación) {
		super(nombre, "Graznar", edad, periodoIncuvación);
	}
	
	public Pinguino(int edad, int periodoIncuvación) {
		super("Graznar", edad, periodoIncuvación);
	}

	public void nadar() {
		System.out.println("El pingüino está nadando");
		nadando = true;
	}
	
	public void dejarDeNadar() {
		System.out.println("El pingüino salió del agua");
		nadando = false;
	}
	
	public void ponerCaritas() {
		System.out.println("¡Mira la carita de este pingüino! Es súper mono");
	}
	
	@Override
	public void volar() {
		System.out.println("Los pingüinos no pueden volar");
	}
	
	@Override
	public void comunicarse() {
		System.out.println("wa, wa, wa, waaaaa");
	}

	@Override
	public String toString() {
		String resultado = "=== PINGÜINO ===\n";
		resultado += super.toString();
		resultado += "\nEstá en el agua: " + nadando;
		
		return resultado;
	}
	
}