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
public class Perro extends Mamifero {
	
	private final String raza;
	
	public Perro(String nombre, int edad, int periodoGestacion, String raza) {
		super(nombre, 4, "Ladrar", edad, periodoGestacion);
		this.raza = raza;
	}
	
	public Perro(int edad, int periodoGestacion, String raza) {
		super(4, "Ladrar", edad, periodoGestacion);
		this.raza = raza;
	}
	

	public void lamer() {
		if ((int) (Math.random() * 10 + 1) < 5) {
			System.out.println("Te ha dejado todo pringoso al lamerte");
		} else {
			System.out.println("Te ha lamido, significa que le gustas");
		}
	}
	
	public void gruñir() {
		System.out.println("GRRRR GRRRRR!!!");
	}
	
	public void morder() {
		if ((int) (Math.random() * 10 + 1) < 5) {
			System.out.println("El perro te ha mordido, tienes que ir al hospital");
		} else {
			System.out.println("El perro te ha mordido, pero no te ha hecho mucho daño");
		}
	}
	
	@Override
	public void comunicarse() {
		System.out.println("Guau guau");
	}

	@Override
	public void matar() {
		super.matar();
		int causas = (int) (Math.random() * 5 + 1);

		switch (causas) {
			case 1 ->
				System.out.println("Lo abandonaron y murió de tristeza");
			case 2 ->
				System.out.println("Se ahogó en el río");
			case 3 ->
				System.out.println("Lo atropellaron");
			case 4 ->
				System.out.println("Le mordió un perro de presa y lo mató");
			default ->
				System.out.println("Una persona lo envenenó");
		}
	}
	
	@Override
	public String toString() {
		String resultado = "=== PERRO ===\n";
		resultado += "Raza: " + raza + "\n";
		
		resultado += super.toString();
		
		return resultado;
	}
	
}
