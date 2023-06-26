package AplicacionExamen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import utilidades.EntradaTeclado;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class AplicacionExamen {

	public static int menu(int eleccion) {
		if (eleccion >= 1 && eleccion <= 4) {
			System.out.println("\n1. Mostrar ejércitos.");
			System.out.println("2. Atacar a los Troyanos.");
			System.out.println("3. Atacar a los Espartanos.");
			System.out.println("4. Salir del programa.");
		}

		return EntradaTeclado.pedirNatural("Elección: ");
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		int eleccion = 4;
		Ejercito troyanos = new Ejercito();
		Ejercito espartanos = new Ejercito();

		try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"))) {
			troyanos = (Ejercito) in.readObject();
			espartanos = (Ejercito) in.readObject();
			
			System.out.println("_____CONTINÚA LA BATALLA_____\n");
		} catch (FileNotFoundException ex) {
			System.out.println("_____COMIENZA LA BATALLA_____\n");
		} catch (ClassNotFoundException | IOException ex) {
			System.out.println(ex);
		}

		do {
			eleccion = menu(eleccion);
			switch (eleccion) {
				case 1 -> {
					//Orden normal
					System.out.println("\n\n--- Troyanos ---");
					System.out.println(troyanos.toString());

					System.out.println("\n\n--- Espartanos ---");
					System.out.println(espartanos.toString());
				}
				case 2 -> {
					//Resultado ordenado por vida
					System.out.println("\n\n=== ATAQUE A LOS TROYANOS ===");
					troyanos.esAtacado();
					
					troyanos.compararPorVida();
					
					if (troyanos.derrotados() == true) {
						System.out.println("Los troyanos han sido derrotados. ¡La victoria es de los espartanos!");
						
						File datos = new File("datos.dat");
						datos.delete(); //Borramos
					}
				}
				case 3 -> {
					//Resultado ordenado por vida
					System.out.println("\n\n=== ATAQUE A LOS ESPARTANOS ===");
					espartanos.esAtacado();
					
					espartanos.compararPorVida();
					
					if (espartanos.derrotados() == true) {
						System.out.println("Los espartanos han sido derrotados. ¡La victoria es de los troyanos!");
						
						File datos = new File("datos.dat");
						datos.delete(); //Borramos
					}
				}
				case 4 -> {
					try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.dat"))) {
						out.writeObject(troyanos);
						out.writeObject(espartanos);
					} catch (FileNotFoundException ex) {
					} catch (IOException ex) {
						System.out.println(ex);
					}
				}
			}
		} while (eleccion != 4);

	}
}