import newpackage.Cola;

/*
Una cola es otra estructura dinámica como la pila, donde los elementos, en vez de apilar	
se y desapilarse, se encolan y desencolan. La diferencia con las pilas es que se desencola	
el primer elemento encolado, ya que así es como funcionan las colas del autobús o del	
cine. El primero que llega es el primero que sale de la cola (vamos a suponer que nadie	
se cuela). Por tanto, los elementos se encolan y desencolan en extremos opuestos de la	
estructura, llamados primero (el que está primero y será el próximo en abandonar la cola)	
y útimo (el que legó último). Implementa la clase Cola donde los elementos Integer	
colados se guardan en una tabla.	
*/

//Repite la actividad 7.18 usando una Lista para guardar los elementos encolados

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg247_Final720_Cola {

    public static void main(String[] args) {
        Cola c1 = new Cola();
		
		System.out.print("Cola 1: ");
		c1.encolar(2); c1.encolar(5);
		c1.mostrar();
		
		System.out.print("Ahora desencolamos 1 vez: ");
		c1.desencolar();
		c1.mostrar();
		
		System.out.print("Y otra más para que quede vacía: ");
		c1.desencolar();
		c1.mostrar();
    }
}