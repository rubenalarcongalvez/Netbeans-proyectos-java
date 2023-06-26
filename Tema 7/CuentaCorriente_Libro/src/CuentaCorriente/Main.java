package CuentaCorriente;

/*
7.3
Modificar la visibilidad de la clase CuentaCorriente para que sea visible desde clases	
externas y la visibilidad de sus atributos para que:	
- saldo no sea visible para otras clases.	
- nombre sea público para cualquier clase.	
- dni solo sea visible por clases vecinas.	
Realizar un programa para comprobar la visibilidad de los atributos.	
*/

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Main {
	//La clase Main es una clase vecina de CuentaCorriente
    public static void main(String[] args) {
		//creamos dos gestores
		Gestor g1 = new Gestor("Antonio González", "666 555 444");
		Gestor g2 = new Gestor("Bea Rodríguez", "987 543 210", 12000.0);
		
		//creamos varias cuentas
		CuentaCorriente c1, c2, c3, c4, c5;
		c1 = new CuentaCorriente("64518420q", "Pepita", g1); //cuenta administrada por g1 -Formato DNI 1
		c2 = new CuentaCorriente("78145962N", "Ana", g1); //otra cuenta administrada por g1 -Formato DNI 2
		c3 = new CuentaCorriente("85426830-t", "Sancho"); //cuenta sin gestor -Formato DNI 3
		c4 = new CuentaCorriente("10004507-J", "Pedro", g2); //cuenta administrada por g2 -Formato DNI 4
		c5 = new CuentaCorriente("56423480-E", "María"); //cuenta sin gestor -Formato DNI nulo
		//Dará como resultado el mismo formato de DNI indiferenctemente del que hayamos puesto
		
		//mostramos información
		c1.mostrarInformacion();
		System.out.println();
		c2.mostrarInformacion();
		System.out.println();
		c3.mostrarInformacion();
		System.out.println();
		c4.mostrarInformacion();
		System.out.println();
		c5.mostrarInformacion();
		
		System.out.println("\n");
		
		c1.setGestor(g2); //cambiamos el gestor
		c1.mostrarInformacion();
    }
}