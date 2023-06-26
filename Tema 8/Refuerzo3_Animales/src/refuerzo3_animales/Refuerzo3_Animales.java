/*
Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,	
al menos, tres métodos específicos de cada clase y redefine el/los método/s	
cuando sea necesario. Prueba las clases creadas en un programa en el que se	
instancien objetos y se les apliquen métodos.
 */
package refuerzo3_animales;

import clases.*;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo3_Animales {

	public static void main(String[] args) {
		Animal[] zoologico = new Animal[8];
		
		zoologico[0] = new Canario((int) (Math.random() * 13), 2);
		Canario canario1 = (Canario) zoologico[0];
		
		zoologico[1] = new Canario((int) (Math.random() * 13), 3);
		Canario canario2 = (Canario) zoologico[1];
		
		zoologico[2] = new Pinguino((int) (Math.random() * 20), 9);
		Pinguino pinguino1 = (Pinguino) zoologico[2];
		
		zoologico[3] = new Pinguino("Skippy", (int) (Math.random() * 20), 9);
		Pinguino skippy = (Pinguino) zoologico[3];
		
		zoologico[4] = new Lagarto((int) (Math.random() * 15));
		Lagarto lagarto1 = (Lagarto) zoologico[4];
		
		zoologico[5] = new Lagarto((int) (Math.random() * 15));
		Lagarto lagarto2 = (Lagarto) zoologico[5];
		
		zoologico[6] = new Lagarto((int) (Math.random() * 15));
		Lagarto lagarto3 = (Lagarto) zoologico[6];
		
		zoologico[7] = new Lagarto((int) (Math.random() * 15));
		Lagarto lagarto4 = (Lagarto) zoologico[6];
		

		Animal[] hogar = new Animal[4];
		hogar[0] = new Gato("Botones", 2, 6, "Siamés");
		Gato botones = (Gato) hogar[0];
		
		hogar[1] = new Perro("Chester", 4, 8, "Pastor alemán / Pastor belga");
		Perro chester = (Perro) hogar[1];
		
		hogar[2] = new Perro("Ra", 6, 7, "Labrador");
		Perro ra = (Perro) hogar[2];
		
		hogar[3] = new Canario("Peter", 3, 4);
		Canario peter = (Canario) hogar[3];
		
		System.out.println("------- Zoológico -------");
		for (Animal pet : zoologico) {
			System.out.println(pet.toString() + "\n");
		}
		
		System.out.println("\nEventos ocurridos en el zoológico: ");
		System.out.println("Hábitat de los canarios:");
		canario1.beber();
		canario1.comer();
		canario1.comunicarse();
		canario2.comunicarse();
		System.out.println("El canario 1 está vivo: " + zoologico[0].estaVivo());
		System.out.println("El canario 2 es doméstico: " + zoologico[1].esDomestico());
		
		while (zoologico[0].getEdad() < 15) {
			zoologico[0].cumplirAnios();
		}
		
		zoologico[0].matar();
		
		canario2.agitarAlas();
		canario2.volar();
		canario2.estaVolando();
		canario2.cantar();
		canario2.irseALasIslasCanarias();
		canario2.dejarDeVolar();
		
		System.out.println("\nHábitat de los pingüinos:");
		zoologico[2].beber();
		zoologico[2].comer();
		zoologico[2].comunicarse();
		skippy.comunicarse();
		System.out.println("El pingüino 1 está vivo: " + zoologico[2].estaVivo());
		System.out.println("El pingüino 2 es doméstico: " + zoologico[3].esDomestico());
		
		while (zoologico[3].getEdad() < 15) {
			zoologico[3].cumplirAnios();
		}
		
		zoologico[3].matar();
		
		pinguino1.volar();
		pinguino1.ponerCaritas();
		pinguino1.nadar();
		pinguino1.dejarDeNadar();
		
		System.out.println("\nHábitat de los lagartos:");
		lagarto1.beber();
		zoologico[7].beber();
		zoologico[6].comer();
		zoologico[5].comer();
		zoologico[4].comunicarse();
		zoologico[5].comunicarse();
		zoologico[6].comunicarse();
		zoologico[7].comunicarse();
		System.out.println("El lagarto 1 está vivo: " + zoologico[4].estaVivo());
		System.out.println("El lagarto 2 es doméstico: " + zoologico[5].esDomestico());
		
		while (zoologico[4].getEdad() < 15) {
			zoologico[4].cumplirAnios();
		}
		
		zoologico[4].matar();
		
		lagarto3.cazarMoscas();
		lagarto4.desprenderCola();
		lagarto4.recuperarCola();
		lagarto2.cazarMoscas();
		
		System.out.println("------- Hogar -------");
		for (Animal pet : hogar) {
			System.out.println(pet.toString() + "\n");
		}
		
		System.out.println("\nEventos ocurridos en el hogar: ");
		
		botones.tenerHijo(4);
		botones.amamantar();
		System.out.println("Chester, ¿quieres amamantar?");
		chester.amamantar();
		botones.comer();
		chester.beber();
		System.out.println("Es Ra domestico: " + ra.esDomestico());
		peter.estaVivo();
		peter.comunicarse();
		botones.cumplirAnios();
		botones.destetar();
		System.out.println("Es Botones lactante: " + botones.esLactante());
		botones.ronronear();
		botones.desafiar();
		botones.arañar();
		ra.gruñir();
		ra.lamer();
		ra.gruñir();
		ra.morder();
		ra.tenerHijo();
		ra.comunicarse();
		ra.matar();
		peter.agitarAlas();
		peter.beber();
		System.out.println("Está volando Peter: " + peter.estaVolando());
		peter.agitarAlas();
		peter.volar();
		peter.cantar();
		peter.irseALasIslasCanarias();
		peter.dejarDeVolar();
		
		System.out.println("\n======== SITUACIÓN ACTUAL ========");
		
		System.out.println("------- Zoológico -------");
		for (Animal pet : zoologico) {
			System.out.println(pet.toString() + "\n");
		}
		
		System.out.println("------- Hogar -------");
		for (Animal pet : hogar) {
			System.out.println(pet.toString() + "\n");
		}
	}
}