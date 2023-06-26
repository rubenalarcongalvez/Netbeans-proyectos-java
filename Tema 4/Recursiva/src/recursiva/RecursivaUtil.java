/*
Torre Hanoi - Se tiene que pasar de origen a destino, con un auxiliar en medio de ayuda
y en cada punto, los apilados tienen que ir de mayor empezando por abajo a menor terminando arriba
 */
package recursiva;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
import java.util.*;

public class RecursivaUtil {

	//Método Torres de Hanoi Recursivo
	public static void HanoiRecursivo(int n, char origen, char auxiliar, char destino) {
		if (n == 1) {
			System.out.println("mover disco de " + origen + " a " + destino);
		} else {
			HanoiRecursivo(n - 1, origen, destino, auxiliar);
			System.out.println("mover disco de " + origen + " a " + destino);
			HanoiRecursivo(n - 1, auxiliar, origen, destino);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Numero de discos: ");
		n = sc.nextInt();
		HanoiRecursivo(n, 'A', 'B', 'C');  //A:origen  B:auxiliar C:destino
	}
}