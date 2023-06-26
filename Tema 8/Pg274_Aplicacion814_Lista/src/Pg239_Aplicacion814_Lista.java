/* 8.14
Reimplementa la clase Lista de la Actividad resuelta 7.11, sustituyendo el método mos-	
trar() por el método toString().	
*/

/* 8.15
Escribe en la clase Lista un método equals() para compararlas. Dos listas se consi-	
derarán iguales si tienen los mismos elementos (incluidas las repeticiones) en el mismo	
orden.
*/

import clases.*;
import utilidades.*;

//7.11 - Lista
/*
Las listas son estructuras dinámicas de datos donde se pueden insertar o eliminar ele	
mentos de un determinado tipo sin limitación de espacio.	

Implementar la clase Lista correspondiente a una lista de números de la clase Integer.	
Los números se guardarán en una tabla que se redimensionará con las inserciones y eli-	
minaciones, aumentando o disminuyendo la capacidad de la lista según el caso.	

Entre los métodos de la clase, se incluirán las siguientes tareas:	

- Un constructor que inicialice la tabla con un tamaño 0.

- Obtener el número de elementos insertados en la lista.	

- Insertar un número al final de la lista.	

- Insertar un número al principio de la lista.	

- Insertar un número en un lugar de la lista cuyo índice, que es el de la tabla, se pasa
como parámetro.	

- Añadir al final de lalista los elementos de otra lista que se pasa como parámetro.	

- Eliminar un elemento cuyo índice en la lista se pasa como parámetro.	

- Obtener el elemento cuyo índice se pasa como parámetro.	

-Buscar un número en la lista, devolviendo el índice del primer lugar donde se encuen-	
tre. Si no está, devolverá -1.	

- Mostrar los elementos de la lista por consola.
 */

//7.12 - Concatenar listas
/*
Añadir a la clase Lista el método estático:
	Lista concatena(Lista l1, Lista l2)	
que construye y devuelve una lista que contiene, en el mismo orden, una copia de todos los elementos de l1 y l2
*/

//7.13 - Pila
/*
Una pila es una estructura dinámica de datos donde los elementos se insertan (se apilan)	
y se retiran (se desapilan) siguiendo la norma de que el último que se apila será el prime-	
ro en desapilarse, como ocurre con una pila de platos. Cuando vamos a retirar un plato de	
una pila a nadie se le ocurre tirar de uno de los de abajo; retiramos (desapilamos) el que	
está encima de todos, que fue el último en ser apilado. Se llama cima de la pila al último	
elemento apilado (o al primer elemento para desapilar). Los métodos fundamentales de	
una pila son apilar() y desapilar().

Implementar la clase Pila para números Integer, donde se usa una lista (un objeto de	
la clase Lista implementada en la Actividad resuelta 7.11) para guardar los elementos	
anilados	
*/

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg239_Aplicacion814_Lista {

	//prueba de los métodos de la clase Lista
	public static void main(String[] args) {
		Lista l1 = new Lista();
		Lista l2 = new Lista();

		System.out.println("Recuerda que se empieza en el 0 las posiciones\n");
		
		System.out.println("Lista 1: ");
		System.out.print("Insertamos 3 valores al final: ");
		l1.insertarFinal(4);
		l1.insertarFinal(5);
		l1.insertarFinal(6);
		System.out.println(l1.toString());
		System.out.print("Insertamos 3 valores al principio: ");
		l1.insertarPrincipio(3);
		l1.insertarPrincipio(2);
		l1.insertarPrincipio(1);
		System.out.println(l1.toString());
		System.out.print("Insertamos en la posición 2 el número 99: ");
		l1.insertar(2, 99);
		System.out.println(l1.toString());
		System.out.print("Eliminamos el número que está en la posición 2: ");
		l1.eliminar(2);
		System.out.println(l1.toString());
		System.out.println("El número 4 está en la posición de la tabla: " + l1.buscar(4));
		
		System.out.println("\nLista 2: ");
		l2.insertarFinal(10);
		l2.insertarFinal(20);
		l2.insertarFinal(30);
		l2.insertarFinal(40);
		l2.insertarFinal(50);
		System.out.println(l2.toString());
		
		System.out.println("\nConcatenar la lista 2 en la lista 1: ");
		l1.insertarFinal(l2);
		System.out.println(l1.toString());
		
		System.out.println("\nSe reinicia todo para el 7.12");
		l1 = new Lista();
		l2 = new Lista();
		
		System.out.println("Lista con todos los elementos en el mismo orden de l1 y l2 (7.12): ");
		l1.insertarFinal(1); l1.insertarFinal(1); l1.insertarFinal(2); l1.insertarFinal(3);
		System.out.print("Lista 1: ");
		System.out.println(l1.toString());
		l2.insertarFinal(10); l2.insertarFinal(20); l2.insertarFinal(30);
		System.out.print("Lista 2: ");
		System.out.println(l2.toString());
		Lista concatenacion = Lista.concatena(l1, l2);
		System.out.print("Concatenación: ");
		System.out.println(concatenacion.toString());
		
		System.out.println("\nPila (7.13): ");
		Pila p = new Pila();
		System.out.print("Desapilamos, aunque la tabla está vacía: ");
		System.out.println(p.desapilar()); //muestra null, ya que p está vacía
		
		System.out.println("Apilamos los números del 0 al 9: ");
		for (int i = 0; i < 10; i++) {
			p.apilar(i);
		}
		System.out.println(p.toString());
		
		System.out.print("Desapilamos: ");
		Integer num = p.desapilar();
		while (num != null) { //mientras la pila no esté vacía
			System.out.print(num + " "); //mostramos el elemento desapilado
			num = p.desapilar(); //y volvemos a desapilar
		}
		System.out.print("\nYa no quedan valores en la tabla: ");
		System.out.println(p.toString());
		
		System.out.println("\n=== 8.15 ===");
		//Reiniciamos las listas
		l1 = new Lista();
		l1.insertarFinal(10); l1.insertarFinal(20); l1.insertarFinal(30);
		l2 = new Lista();
		l2.insertarFinal(10); l2.insertarFinal(20); l2.insertarFinal(30);
		
		System.out.println("Lista 1: " + l1.toString());
		System.out.println("Lista 2: " + l2.toString());
		
		System.out.println("Son lista1 y lista2 iguales: " + l1.equals(l2));
		
		System.out.println("\n=== 8.17 ===");
		
		Cola c1 = new Cola();
		
		c1.encolar(8); c1.encolar(45);
		
		System.out.println("Cola 1: " + c1.toString());
		
		System.out.println("\n=== 8.18 ===");
		
		ColaDoble cd1 = new ColaDoble();
		
		cd1.encolarPrincipio(68); cd1.encolarPrincipio(85);
		cd1.desencolarFinal();
		
		System.out.println("Cola Doble 1: " + cd1.toString());
		
		System.out.println("\n=== 8.19 ===");
		
		Conjunto cj1 = new Conjunto();
		
		cj1.insertarPrincipio(1);
		cj1.insertarFinal(2);
		cj1.insertarPrincipio(2);
		
		Conjunto cj2 = new Conjunto();
		
		cj2.insertarPrincipio(8);
		cj2.insertarPrincipio(2);
		cj2.insertarFinal(9);
		
		System.out.println("Conjunto 1: " + cj1.toString());
		System.out.println("Conjunto 2: " + cj2.toString());
		
		cj1.insertarFinal(cj2);
		
		System.out.println("Conjunto 1 + Conjunto 2: " + cj1.toString());
		
		cj1.insertar(2, 999);
		
		System.out.println("Conjunto 1 final form: " + cj1.toString());
		
		System.out.println("Son iguales Conjunto 1 y Conjunto 2: " + cj1.equals(cj2));
		
		cj2.insertarPrincipio(1);
		cj2.insertarPrincipio(999);
		
		System.out.println("Conjunto 1: " + cj1.toString());
		System.out.println("Conjunto 2: " + cj2.toString());
		
		System.out.println("Y ahora: " + cj1.equals(cj2));
		
		System.out.println("\n=== 8.21 ===");
		
		System.out.println("Es un número la Cola 1: " + Comparar.esNumero(c1));
		System.out.println("Es número el valor 1 de la Cola: " + Comparar.esNumero(c1.get(0)));
		
		l1.sumar(l1.get(0), c1.get(0));
	}
}