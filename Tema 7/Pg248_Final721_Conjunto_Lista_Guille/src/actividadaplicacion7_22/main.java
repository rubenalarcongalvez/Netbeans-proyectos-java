/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion7_22;

/**
 *
 * @author guillermoag
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conjunto c1 = new Conjunto();
        
        Conjunto c2 = new Conjunto();
        
        c1.insertar(5);
        c1.insertar(6);
        c1.insertar(1);
        c1.insertar(7);
        c1.insertar(9);
        c1.insertar(12);
        
        c2.insertar(5);
        c2.insertar(1);
        
        System.out.print("c1: ");
        c1.muestra();
        System.out.print("c2: ");
        c2.muestra();
        System.out.println("");
        
        System.out.println("Está incluido c2 en c1: " + Conjunto.incluido(c2, c1));
        System.out.println("");
        
        c2.insertar(56);
        c2.insertar(12);
        c2.insertar(11);
        
        System.out.println("Inserto nuevos elementos en c2: ");
        c2.muestra();
        System.out.println("");
        
        Conjunto c3 = Conjunto.union(c1, c2);
        Conjunto c4 = Conjunto.interseccion(c1, c2);
        Conjunto c5 = Conjunto.diferencia(c2, c1);
        
        System.out.println("Union de c1 y c2:");
        c3.muestra();
        System.out.println("");
        System.out.println("Interseccion entre c1 y c2:");
        c4.muestra();
        System.out.println("");
        System.out.println("Diferencia entre c1 y c2:");
        c5.muestra();
    }
    
}