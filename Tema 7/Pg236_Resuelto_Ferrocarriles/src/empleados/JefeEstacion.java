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

Todas las clases correspondientes al personal (Maquinista, Mecanico y JefeEstacion)	
seran de uso publico. Entre las clases relativas a la maquinaria solo será posible cons-	
truir, desde clases externas, objetos de tipo Tren y de tipo Locomotora. La clase Vagon	
será solo visible por sus clases vecinas.
*/

package empleados;

import java.util.Date;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class JefeEstacion {
	String nombre;
	String dni;
	Date fechaNombramiento;

	public JefeEstacion(String nombre, String dni, Date fechaNombramiento) {
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNombramiento = fechaNombramiento;
	}
}