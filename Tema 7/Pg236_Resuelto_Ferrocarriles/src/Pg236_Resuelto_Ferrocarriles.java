/*
Hemos recibido el encargo de un cliente para definir los paquetes y las clases necesarias	
(solo implementar los atributos y los constructores) para gestionar una empresa ferrovia-	
ria, en la que se distinguen dos grandes grupos: el personal y la maquinaria.

En el primero se ubican todos los empleados de la empresa, que se clasifican en tres grupos: 
los maquinistas, los mecanicos y los jefes de estación. De cada uno de ellos es necesario guardar:	

- Maquinistas: su nombre, DNI, sueldo y el rango que tienen adquirido.	
- Mecánicos: su nombre, teléfono (para contactar en caso de urgencia) y en qué es-	
  pecialidad desarrollan su trabajo (esta puede ser: frenos, hidráulica, electricidad o	
  motor).	
- Jefes de estación: su nombre, DNI y la fecha en la que fue nombrado jefe de estación.	

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



/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg236_Resuelto_Ferrocarriles {

    public static void main(String[] args) {
        
    }
}
