package examentema7_diego_david;

import clases.Componente;
import clases.Contenedor;

public class ExamenTema7 {

	public static void main(String[] args) {
		Componente boton1 = new Componente(3, 2);
		Componente imagen1 = new Componente(6, 2);
		Contenedor cont1 = new Contenedor(3);
		cont1.add(boton1);
		cont1.add(imagen1);
		System.out.println(cont1.toString());
		cont1.add(boton1);      // No se podrá insertar al estar repetido
		cont1.eliminar();       // Se elimina el primer Componente 
		System.out.println(cont1.toString());

		Componente boton2 = new Componente(5, 3);
		Componente imagen2 = new Componente(1, 1);
		Contenedor cont2 = new Contenedor(1);
		cont2.add(boton2);
		cont2.add(imagen2);   // No se podrá insertar ya que no hay espacio suficiente
		System.out.println(cont2.toString());

	}
}