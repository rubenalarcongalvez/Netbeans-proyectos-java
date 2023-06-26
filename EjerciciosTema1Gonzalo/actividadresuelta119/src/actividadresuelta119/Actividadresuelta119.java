/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta119;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */

public class Actividadresuelta119 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        boolean llueve , tareas , biblioteca;
        // No hay que poner Boolean= salir; y despues al final: salir =(ecuacion)???????????????
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Está lloviendo?(true/false):");
        llueve = sc.nextBoolean();
        System.out.println("¿Has terminado tus tareas?:");
        tareas= sc.nextBoolean();
        System.out.println("¿Tienes que ir a la biblioteca?:");
        biblioteca = sc.nextBoolean();
        boolean salir = !llueve && tareas || biblioteca;
        System.out.println("Puedes salir:"+ salir);
        //Programa no funciona bien, solo depende de si hay que ir a la biblioteca
    }
    
}
