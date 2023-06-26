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

import empleados.Mecanico;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Locomotora {
	String matricula;
	int potencia;
	int anoFabricacion;
	Mecanico mecanico;

	public Locomotora(String matricula, int potencia, int anoFabricacion, Mecanico mecanico) {
		this.matricula = matricula;
		this.potencia = potencia;
		this.anoFabricacion = anoFabricacion;
		this.mecanico = mecanico;
	}
}
