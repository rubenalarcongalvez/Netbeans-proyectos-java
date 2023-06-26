/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrefuerzo8;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class Ejerciciosrefuerzo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double horas , salario;
        final int preciohora = 12;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca las horas trabajadas a la semana:");
        horas = sc.nextDouble();
        salario = horas*preciohora;
        System.out.println("Su salario semanal es:"+salario+"euros");
        
    
}
}