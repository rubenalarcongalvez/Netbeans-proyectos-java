package Refuerzo_Ejercicio9;

import java.util.Scanner;

public class Refuerzo_Ejercicio9 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num, digitos = 0;
        
        System.out.print("Introduzca un número para ver cuántos dígitos tiene: ");
        num = sc.nextInt();
        do {
            num /= 10;
            digitos++;
        } while (num != 0);
        
        System.out.println("El número tiene " + digitos + " digitos");
    }
    
}
