/*
En la parte de maquinaria podemos encontrar trenes, locomotoras y vagones. De cada uno	
de ellos hay que considerar:

- Vagones: tienen un número que los identifica, una carga máxima (en kilos), la carga	
  actual y el tipo de mercancía con el que estan cargados.	
- Locomotoras: disponen de una matrícula (que las identifica), la potencia de sus moto-	
  res y una antigüedad (año de fabricación). Además, cada locomotora tiene asignado	
  un mecánico que se encarga de su mantenimiento.	
- Trenes: están formados por una locomotora y un máximo de 5 vagones. Cada tren	
  tiene asignado un maquinista que es responsable de él.

Todas las clases correspondientes al personal (Maquinista, Mecanico y JefeEstacion)	
seran de uso publico. Entre las clases relativas a la maquinaria solo será posible cons-	
truir, desde clases externas, objetos de tipo Tren y de tipo Locomotora. La clase Vagon	
será solo visible por sus clases vecinas.
*/

package maquinaria;

import empleados.Maquinista;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Tren {
	Locomotora locomotora;
	Vagon [] vagones;
	Maquinista responsable;
	private int numVagones;

	public Tren(Locomotora locomotora, Maquinista responsable) {
		this.locomotora = locomotora;
		this.responsable = responsable;
		
		//Construimos los vagones, pero solo hay 0 por ahora. Máximo 5
		this.vagones = new Vagon[5];
		this.numVagones = 0;
	}
	
	public void enganchaVagon(int cargaMax, int cargaActual, String tipoMercancia) {
		if (numVagones >= 5) {
			System.out.println("El tren no admite más vagones. No se realizará la operación.");
		} else {
			Vagon v = new Vagon(numVagones, cargaMax, cargaActual, tipoMercancia);
			
			this.vagones[numVagones] = v; //El vagón que ocupa el último lugar
			this.numVagones++; //Empieza en 0 por defecto pero se van añadiendo
		}
	}
}