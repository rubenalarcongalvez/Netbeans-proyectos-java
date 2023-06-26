/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion11_23;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author guillermoag
 */
public class mainAA11_23 {

	static Integer[] fusionar(String fichero1, String fichero2) {

        Integer[] lista1, lista2, fusionada;
        
        lista1 = leerFichero(fichero1);
		System.out.println(Arrays.toString(lista1));
        lista2 = leerFichero(fichero2);
        System.out.println(Arrays.toString(lista2));
		
        fusionada = Arrays.copyOf(lista1, lista1.length + lista2.length);
        
        System.arraycopy(lista2, 0, fusionada, lista1.length, lista2.length);
        
        Arrays.sort(fusionada);
        return fusionada;
    }
    
    static Integer[] leerFichero(String fichero) {
        
        Integer[] lista = null;
        
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(fichero))) {
            
            lista = (Integer[]) input.readObject();
            
        }catch(IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return lista;
    }
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer[] lista = fusionar("fichero1.dat", "fichero2.dat");
        
        System.out.println(Arrays.toString(lista));
    }
	
}