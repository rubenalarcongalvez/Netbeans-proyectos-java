/*
Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado	
y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array	
cuadrado Se deben almacenar los cuadrados de los valores que hay en el array	
numero. En el array cubo Se deben almacenar los cubos de los valores que hay en	
numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres	
columnas.	
*/

package ejerciciosrefuerzo5_4;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class EjerciciosRefuerzo5_4 {

    public static void main(String[] args) {
        int [] numero = new int [20];
        int [] cuadrado = new int [20];
        int [] cubo = new int [20];
		
		System.out.println("Numeros Cuadrados Cubos");
		for (int contador = 0; contador < 20; contador++) {
			numero [contador] = (int) (Math.random() * 100);
			cuadrado [contador] = (int) Math.pow(numero[contador], 2);
			cubo [contador] = (int) Math.pow(numero[contador], 3);
			
			System.out.println(numero[contador] + "\t" + cuadrado[contador] + "\t  " + cubo[contador]);
		}
    }
}
