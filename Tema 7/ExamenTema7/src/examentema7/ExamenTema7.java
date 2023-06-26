package examentema7;

import instalaciones.Estacion;
import personal.*;
import maquinaria.*;

public class ExamenTema7 {

	public static void verInfoEstacion(Estacion estac) {
		System.out.println("El numero de trenes de la estacion es: " + estac.numeroTrenes());
		System.out.println("Los nombres de los maquinistas de la estación son: " + estac.nombreMaquinistasEstacion());
		System.out.println("El numero de vagones que hay en la estacion es: " + estac.numeroVagonesEstacion());
		System.out.println("La potencia total de las locomotoras de la estacion es: " + estac.potenciaTrenesEstacion());
	}

	public static void main(String[] args) {

		// CREACIÓN DE OBJETOS
		JefeEstacion jefe1 = new JefeEstacion("Jefe 1", "1111111A");
		JefeEstacion jefe2 = new JefeEstacion("Jefe 2", "2222222B");

		Maquinista maquinista1 = new Maquinista("Maquinista 1", "3333333C", 2000);
		Maquinista maquinista2 = new Maquinista("Maquinista 2", "4444444D", 2000);
		Maquinista maquinista3 = new Maquinista("Maquinista 3", "5555555E", 2000);

		Locomotora locomotora1 = new Locomotora("AAAA1", 120);
		Locomotora locomotora2 = new Locomotora("BBBB2", 100);
		Locomotora locomotora3 = new Locomotora("CCCC3", 150);

		Tren tren1 = new Tren(locomotora1, maquinista1);
		tren1.enganchaVagon(100, 50, "Madera");
		tren1.enganchaVagon(120, 30, "Acero");
		Tren tren2 = new Tren(locomotora2, maquinista2);
		tren2.enganchaVagon(60, 60, "Alimentos");
		tren2.enganchaVagon(50, 12, "Madera");
		tren2.enganchaVagon(100, 50, "Madera");
		Tren tren3 = new Tren(locomotora3, maquinista3);
		tren3.enganchaVagon(50, 60, "Acero");
		tren3.enganchaVagon(150, 140, "Madera");

		Estacion estacion1 = new Estacion(jefe1, 2);
		Estacion estacion2 = new Estacion(jefe2);

		// COMIENZA LA ACTIVIDAD DE LA ESTACION
		System.out.println(" -- ESTACION 1 -- ");

		System.out.println(" -- Intento de entrada de 3 trenes -- ");
		estacion1.llegadaTren(tren1);
		estacion1.llegadaTren(tren2);
		estacion1.llegadaTren(tren3);
		verInfoEstacion(estacion1);

		System.out.println(" -- Intento de salida de 2 trenes -- ");
		tren1 = estacion1.salidaTren();
		tren2 = estacion1.salidaTren();
		verInfoEstacion(estacion1);

		System.out.println(" -- ESTACION 2 -- ");

		System.out.println(" -- Intento de entrada de 3 trenes -- ");
		estacion2.llegadaTren(tren1);
		estacion2.llegadaTren(tren2);
		estacion2.llegadaTren(tren3);
		verInfoEstacion(estacion2);

	}

}