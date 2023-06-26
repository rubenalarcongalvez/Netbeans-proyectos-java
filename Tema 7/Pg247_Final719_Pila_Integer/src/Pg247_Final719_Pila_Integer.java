
import newpackage.Pila;

/*
Implementa la clase Pila para números Integer, usando directamente una tabla para
guardar los elementos apilados
 */

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg247_Final719_Pila_Integer {

    public static void main(String[] args) {
        Pila c1 = new Pila();
		
		System.out.print("Pila 1: ");
		c1.apilar(2); c1.apilar(5);
		c1.mostrar();
		
		System.out.print("Ahora desapilamos 1 vez: ");
		c1.desapilar();
		c1.mostrar();
		
		System.out.print("Y otra más para que quede vacía: ");
		c1.desapilar();
		c1.mostrar();
    }
}