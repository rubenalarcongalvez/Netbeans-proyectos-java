package pg158_actividadesaplicacion_5_15;

import java.util.Arrays;
import java.util.Scanner;

/*
Debes desarrollar una aplicación que ayude a gestionar las notas de un centro educativo.	
Los alumnos se organizan en grupos compuestos por 5 personas. Leer las notas (núme-	
ros enteros) del primer, segundo y tercer trimestre de un grupo. Debes mostrar al final la	
nota media del grupo en cada trimestre y la media del alumno que se encuentra en una	
posición dada (que el usuario introduce por teclado).
*/

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg158_ActividadesAplicacion_5_15_Guille {
    
    public static double[] mediasTrimestre(int[][] notas){
		double[] notaMedia = new double[3];
		
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notaMedia[i] += notas[i][j];
            }
			notaMedia[i] /= notas[i].length;
        }
		return notaMedia;
    }
    
    public static double mediaAlumno(int[][] notas, int alumno){
        int sumaAlumno = 0;
        double mediaAlumno;
        
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if(alumno == j+1) sumaAlumno += notas[i][j];
            }
        }
        
        mediaAlumno = sumaAlumno/(double)notas.length;
        
        
        return mediaAlumno;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] notas = new int[3][5];
        
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Introduce la nota del alumno " + (j+1) + " en el trimestre " + (i+1) + ": ");
                notas[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        
        System.out.print("¿Qué quieres saber?\n 1-Nota media de los alumnos por trimestre.\n 2-Nota media de un alumno.\n Elección: ");
        int op = sc.nextInt();
        System.out.println();
		
		System.out.println("¿De qué alumno desea saber su media?");
		int alumno = sc.nextInt();
		
        switch (op){
            case 1 ->
                System.out.println(Arrays.toString(mediasTrimestre(notas)));
            case 2 ->
                System.out.println(mediaAlumno(notas, alumno));
			default ->
                System.out.println("Error.");
        }
    }
}