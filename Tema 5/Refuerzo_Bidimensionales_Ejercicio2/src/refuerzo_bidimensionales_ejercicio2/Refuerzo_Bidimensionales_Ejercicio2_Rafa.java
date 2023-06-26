/*
Escribe un programa que pida 20 números enteros. Estos números se deben	
introducir en un array de 4 filas por 5 columnas. El programa mostrará las	
sumas parciales de filas y columnas igual que si de una hoja de cálculo se	
tratará. La suma total debe aparecer en la esquina inferior derecha.
*/

package refuerzo_bidimensionales_ejercicio2;

/**
 * @author Rafael Nuñez
 */
public class Refuerzo_Bidimensionales_Ejercicio2_Rafa {

    public static void main(String[] args) {
        
        int tabla[][] = new int [5][6];
        
        // Se introducen los datos
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 5; j++) {
                tabla[i][j] = (int) (Math.random()*10);
                // Aprovechamos para ir calculando los sumatorios
                tabla[i][5] += tabla[i][j];
                tabla[4][j] += tabla[i][j];
                tabla[4][5] += tabla[i][j] * 2;
            }
        
        // Se muestra la tabla
        for (int fila[] : tabla) {
            System.out.println();
            for (int columna : fila) {
                if (columna < 10)
                    System.out.print(" ");
                System.out.print(columna + " ");
            }
        }
        System.out.println();
            
    }
    
}
