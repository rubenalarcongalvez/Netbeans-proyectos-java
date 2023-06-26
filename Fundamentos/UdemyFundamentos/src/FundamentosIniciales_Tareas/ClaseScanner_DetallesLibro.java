package FundamentosIniciales_Tareas;

import java.util.Scanner;
/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class ClaseScanner_DetallesLibro {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Escribe tu solucion aqui
        System.out.print("Proporciona el titulo: ");
        String titulo = scanner.nextLine();
        System.out.print("Proporciona el autor: ");
        String autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}