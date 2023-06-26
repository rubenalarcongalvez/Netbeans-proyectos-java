/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio113;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class Ejercicio113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int nota1, nota2, nota3;
        double expediente;
        int calificacion;
        System.out.println("Indique su nota del primer trimestre:");
        nota1 = sc.nextInt();
        System.out.println("Indique su nota del segundo trimestre:");
        nota2 = sc.nextInt();
        System.out.println("Indique su nota del tercer trimestre:");
        nota3 = sc.nextInt();

        calificacion = ((nota1 + nota2 + nota3) / 3);
        expediente = ((nota1 + nota2 + nota3) / 3.0);
        System.out.println("Su nota en el boletin de calificaciones es:" + calificacion);

        System.out.printf("%.2f Su nota en el expediente académico es:",expediente);

    }

}
