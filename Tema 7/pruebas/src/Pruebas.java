
import clases.Persona;

/*
Enunciado
 */


/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pruebas {

	

	public static void main(String[] args) {
		Persona p;
		
		p = new Persona("Pepe", 91);
		p.mostrar();
		
		p.setNombre("Jaimito");
		p.setEdad(-1);
		
		p.mostrar();
		
		p.setEdad(8);
		p.mostrar();
	}
}
