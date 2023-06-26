package pg158_actividadesaplicacion_5_18;
import java.util.Scanner;
/**
 *
 * @author guillermoag
 */
public class Pg158_ActividadesAplicacion_5_18_Guille {
    
    //Función que devuelve true en caso de que la suma de los elmentos de cada fila y de cada columna valgan lo mismo.
    public static boolean magica(int[][] matriz){
        boolean esMagica = true;
        int sumaBase = 0;
        //Suma base es con quien se comprobará la suma de cada fila y columna.
        for (int i = 0; i < matriz.length; i++) {
            sumaBase += matriz[0][i];
        }
        
        int fil = 0;
        //Calcula la suma de cada fila y columna y la compara con la suma base.
        //Una vez compruebe que la matriz no es mágica, sale del bucle y devuelve false;
        while (esMagica && fil < matriz.length) {
            int sumaFila = 0, sumaCol = 0;
            for(int col = 0; col < matriz[fil].length; col++){
                
                sumaFila += matriz[fil][col];
                sumaCol += matriz[col][fil];      
            }
            if(sumaFila != sumaBase || sumaCol != sumaBase) esMagica = false;
            
            fil++;
        }
        return esMagica;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño;
        
        System.out.print("Introduce el número de filas y columnas: ");
        tamaño = sc.nextInt();
        System.out.println("");
        
        int[][] matriz = new int[tamaño][tamaño];
        
        System.out.println("Introduce los elementos de la matriz: ");
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Posición [" + i + "," + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        
        if(magica(matriz))System.out.println("La matriz es mágica.");
        else System.out.println("La matriz no es mágica.");
        
    }
    
}