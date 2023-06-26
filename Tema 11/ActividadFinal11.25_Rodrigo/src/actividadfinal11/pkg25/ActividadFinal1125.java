package actividadfinal11.pkg25;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rodri23
 */
public class ActividadFinal1125 {

    public static int extraccion(String fichero, int numBuscado) throws FileNotFoundException, IOException, ClassNotFoundException {
        int retornado = -1;

        int[] array;
        try (ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream(fichero))) {

            array = (int[]) flujoEntrada.readObject();

            for (int i = 0; i < array.length; i++) {
                if (array[i] == numBuscado) {
                    retornado = i;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }

        return retornado;
    }

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        // Se crean 4 ficheros[i+1].dat
        String[] ficheros = new String[4];
        for (int i = 0; i < ficheros.length; i++) {
            ficheros[i] = "fichero" + (i + 1) + ".dat";
        }
//        System.out.println("Estos son los ficheros binarios en los que vamos a buscar el número: ");
//        System.out.println(Arrays.toString(ficheros));

        ObjectOutputStream flujoSalida = null;
        // Escribimos un array de enteros de 0 a 100 en los diferentes ficheros.dat
        try {
			for (String fichero : ficheros) {
				flujoSalida = new ObjectOutputStream(new FileOutputStream(fichero));
				int[] array = new int[10];
				for (int j = 0; j < array.length; j++) {
					array[j] = (int) (Math.random() * 100 + 1);
				}
				Arrays.sort(array);
				flujoSalida.writeObject(array);
			}
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } finally {
            if (flujoSalida != null) {
                try {
                    flujoSalida.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

        // Programa principal...
        boolean testigo = false;
        String fichero = "";
        int indiceNumExtraido = 0;
        do {
            System.out.println("Introduzca un valor(1/100) que quiera buscar en los ficheros: ");
            int num = sc.nextInt();

            for (int i = 0; i < ficheros.length && testigo == false; i++) {
                indiceNumExtraido = extraccion(ficheros[i], num);
                if (indiceNumExtraido != -1) {
                    testigo = true;
                    fichero = ficheros[i];
                }
            }    
        } while (indiceNumExtraido == -1);

        System.out.println("El fichero donde se encuentra el numero es: " + fichero);
        System.out.println("La posición del número buscado es: " + indiceNumExtraido);
        System.out.println("\n---------------------------------------------------------\n [ARRAYS(solucion)]");

        // Prueba de lectura de ficheros.
        try {
			for (String fichero1 : ficheros) {
				ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream(fichero1));
				int[] array = (int[]) flujoEntrada.readObject();
				System.out.println(Arrays.toString(array));
			}

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

}


/* ---------------------------------------------------------------------------------------------------------- */
// Tablas de enteros;
/* int[] tabla1 = {45, 34, 2, 65, 78};
        int[] tabla2 = {4, 340, 23, 5, 8};
        int[] tabla3 = {2, 43, 27, 90, 7};
        int[] tabla4 = {1, 76, 72, 6, 10};
        Arrays.sort(tabla1);
        Arrays.sort(tabla2);
        Arrays.sort(tabla3);
        Arrays.sort(tabla4);
        

        ObjectOutputStream flujoSalida = null;

        // Introducir tablas de enteros a los ficheros.
        try {
            flujoSalida = new ObjectOutputStream(new FileOutputStream("fichero1.dat"));
            flujoSalida.writeObject(tabla1);

            flujoSalida = new ObjectOutputStream(new FileOutputStream("fichero2.dat"));
            flujoSalida.writeObject(tabla2);

            flujoSalida = new ObjectOutputStream(new FileOutputStream("fichero3.dat"));
            flujoSalida.writeObject(tabla3);

            flujoSalida = new ObjectOutputStream(new FileOutputStream("fichero4.dat"));
            flujoSalida.writeObject(tabla4);

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } finally {
            if (flujoSalida != null) {
                try {
                    flujoSalida.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            } 

        }*/
