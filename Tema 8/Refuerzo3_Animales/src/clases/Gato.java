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
public class Gato extends Mamifero {

	private final String raza;

	public Gato(String nombre, int edad, int periodoGestacion, String raza) {
		super(nombre, 4, "Maullar", edad, periodoGestacion);
		this.raza = raza;
	}

	public Gato(int edad, int periodoGestacion, String raza) {
		super(4, "Maullar", edad, periodoGestacion);
		this.raza = raza;
	}

	public void desafiar() {
		System.out.println("Ffffuuuuu");
	}

	public void ronronear() {
		System.out.println("brr brr");
	}

	public void arañar() {
		System.out.println("MIAUUU!! FUUUFFUUU *slash* *slash*");

		int probabilidad = (int) (Math.random() * 10 + 1);

		if (probabilidad >= 3 && probabilidad <= 10) {
			System.out.println("El animal al que atacó el gato, se enfadó");
			if (probabilidad > 5 && probabilidad <= 7) {
				System.out.println("Por eso, lo atacó de vuelta al gato");
				if (probabilidad > 7 && probabilidad <= 10) {
					System.out.println("Con tan mala suerte que lo mató");
					super.matar();
				}
			}
		} else {
			System.out.println("El animal al que atacó el gato, huyó");
		}
	}

	@Override
	public void comunicarse() {
		System.out.println("Miau miau");
	}

	@Override
	public void matar() {
		super.matar();
		int causas = (int) (Math.random() * 5 + 1);

		switch (causas) {
			case 1 ->
				System.out.println("Se ahogó en la pecera");
			case 2 ->
				System.out.println("Se convirtió en comida china");
			case 3 ->
				System.out.println("Lo atropellaron");
			case 4 ->
				System.out.println("Le mordió un perro y lo mató");
			default ->
				System.out.println("Una persona lo envenenó");
		}
	}

	@Override
	public String toString() {
		String resultado = "=== GATO ===\n";
		resultado += "Raza: " + raza + "\n";

		resultado += super.toString();

		return resultado;
	}

}