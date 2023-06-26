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
public abstract class Ave extends Animal {

	private final int periodoIncuvación;
	private boolean volando;

	public Ave(String nombre, String sonido, int edad, int periodoIncuvación) {
		super(nombre, 2, sonido, edad);
		this.periodoIncuvación = periodoIncuvación;
	}
	
	public Ave(String sonido, int edad, int periodoIncuvación) {
		super(2, sonido, edad);
		this.periodoIncuvación = periodoIncuvación;
	}

	public void volar() {
		this.volando = true;
	}
	
	public void dejarDeVolar() {
		this.volando = false;
	}
	
	public boolean estaVolando() {
		return volando;
	}
	
	@Override
	public void matar() {
		super.matar();
		int causas = (int) (Math.random() * 5 + 1);

		switch (causas) {
			case 1 ->
				System.out.println("Se murió de hambre");
			case 2 ->
				System.out.println("Se lo comió otro animal");
			case 3 ->
				System.out.println("Un cazador le pegó un tiro");
			case 4 ->
				System.out.println("Lo cocinaron vivo");
			default ->
				System.out.println("Se le rompieron las alas de un golpe y se ahogó");
		}
	}

	@Override
	public void comunicarse() {
		System.out.println("Pío pío");
	}
}