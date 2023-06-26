/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampliacion_9_28;

/**
 *
 * @author Luis
 */
public class Ampliacion_9_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Lista<Jornada> trabajadores = new Lista<>(); //el diamante vacío (<>) significa que pertenece al tipo asignado, en este caso, Jornada
		//También se puede poner así: Lista<Jornada> trabajadores = new Lista<Jornada>(); //Pero es menos correcto
		
        trabajadores.insertarFinal(new Jornada("98412783F", "30/03/2024", "12:00:00", "15:00:00"));
        trabajadores.insertarFinal(new Jornada("98412783E", "22/04/2022", "08:00:00", "12:00:00"));
        trabajadores.insertarFinal(new Jornada("12412383F", "30/03/2022", "12:00:00", "15:00:00"));
        trabajadores.insertarFinal(new Jornada("98412783E", "30/07/2022", "12:00:00", "15:00:00"));
		
        trabajadores.ordenar();
        System.out.println(trabajadores.mostrar() + "\n");
        
        trabajadores.ordenar(new ComparaDNI());
        System.out.println(trabajadores.mostrar());
        
    }

}