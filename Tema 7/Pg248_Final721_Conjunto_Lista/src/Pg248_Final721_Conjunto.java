
import clases.Conjunto;

/*
Un conjunto es una estructura dinámica de datos como la lista, con dos diferencias: en	
primer lugar, en una lista puede haber elementos repetidos, mientras que en un conjun-	
to, no. Además, en una lista el orden de inserción de los elementos puede ser relevante	
y debemos tenerlo en cuenta, mientras que en un conjunto solo interesa si un elemento	
pertenece o no al conjunto y no el lugar que ocupa. Se pide implementar la clase Conjun-	
to utilizando una lista para almacenar números de tipo Integer. Implementa los siguien-	
tes métodos:

- Un constructor sin parámetros.	
- int numeroElementos(): devuelve el número de elementos del conjunto.	
- boolean insertar(Integer nuevo): inserta un nuevo elemento en el conjunto.	
- boolean insertar(Conjunto otroConjunto ): añade al conjunto los elementos del	conjunto otroConjunto.	
- boolean eliminarElemento(Integer elemento): en caso de pertenecer al conjunto, elimina elemento.	
- boolean eliminarConjunto(Conjunto otroConjunto): elimina del conjunto invocante
los elementos del conjunto que se pasa como parámetro.	
- boolean pertenece(Integer elemento): indica si el elemento que se le pasa
como parámetro pertenece o no al conjunto.	
- muestra(): muestra el conjunto por consola.	

De forma general, los métodos que devuelven un booleano indican con él si el conjunto	
se ha modificado.	
*/

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg248_Final721_Conjunto {

    public static void main(String[] args) {
		Conjunto c1 = new Conjunto();
		Conjunto c2 = new Conjunto();
		
		System.out.println("¿Se puede insertar? " + c1.insertar(5));
		System.out.println("¿Se puede insertar? " + c1.insertar(8));
		System.out.println("¿Se puede insertar? " + c1.insertar(5));
		System.out.print("Conjunto 1: ");
		c1.mostrar();
		
		System.out.print("Conjunto 2: ");
		c2.insertar(5);
		c2.insertar(8);
		c2.mostrar();
		
		System.out.println("¿Se puede insertar conjunto 2 en conjunto 1? " + c1.insertar(c2));
		System.out.print("Conjunto 1: ");
		c1.mostrar();
		
		c2.insertar(4);
		System.out.println("¿Y ahora? " + c1.insertar(c2));
		System.out.print("Conjunto 1: ");
		c1.mostrar();
		
		System.out.println("Eliminamos el 5. ¿Se puede?: " + c1.eliminarElemento(5));
		System.out.print("Conjunto 1: ");
		c1.mostrar();
		
		System.out.println("Eliminamos el 5 otra vez. ¿Se puede?: " + c1.eliminarElemento(5));
		System.out.print("Conjunto 1: ");
		c1.mostrar();
		
		System.out.print("Insertamos varios números al conjunto 1: ");
		c1.insertar(5);
		c1.insertar(1);
		c1.insertar(9);
		c1.mostrar();
		
		System.out.print("Insertamos el 3 al conjunto 2: ");
		c2.insertar(3);
		c2.mostrar();
		
		System.out.print("Eliminamos el conjunto 2 del conjunto 1: ");
		c1.eliminarConjunto(c2);
		c1.mostrar();
		
		System.out.println("¿Pertenece el 1 al conjunto 1? " + c1.pertenece(1));
		System.out.println("¿Pertenece el 0 al conjunto 1? " + c1.pertenece(0));
		
		
		System.out.println("Reseteamos el conjunto 1 y le añadimos el valor 5 y el 4");
		c1 = new Conjunto();
		c1.insertar(5);
		c1.insertar(4);
		System.out.print("Conjunto 1: ");
		c1.mostrar();
		System.out.print("Conjunto 2: ");
		c2.mostrar();
		
		System.out.println("¿Está el conjunto 1 incluido en el conjunto 2? " + Conjunto.incluido(c2, c1));
		
		System.out.print("Insertamos solo los comunes entre c1 y c2 en c3: ");
		Conjunto c3 = Conjunto.interseccion(c1, c2);
		c3.mostrar();
		
		System.out.print("Insertamos solo los NO comunes que estén en c2 y no en c1 en c4: ");
		Conjunto c4 = Conjunto.diferencia(c2, c1);
		c4.mostrar();
		
		System.out.print("Insertamos c1 y c2 en c5: ");
		Conjunto c5 = Conjunto.union(c1, c2);
		c5.mostrar();
    }
}