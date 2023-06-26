/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion7_22;

import java.util.Arrays;

/**
 *
 * @author guillermoag
 */
public class Lista {
    
    //ATRIBUTOS
    private Integer[] tabla;
    
    
    //CONSTRUCTOR
    public Lista() {
        this.tabla = new Integer[0];
    }
    
    //METODOS
    public void insertarPrincipio(Integer nuevo) {
        
        this.tabla = Arrays.copyOf(this.tabla, this.tabla.length + 1);
        
        System.arraycopy(this.tabla, 0, this.tabla, 1, this.tabla.length - 1);
        
        tabla[0] = nuevo;
    }
    
    public void insertarFinal(Integer nuevo) {
        
        this.tabla = Arrays.copyOf(this.tabla, this.tabla.length + 1);
        
        this.tabla[this.tabla.length - 1] = nuevo;
    }
    
    public void insertarFinal(Lista otraLista) {
        
        int tamIni = this.tabla.length;
        
        this.tabla = Arrays.copyOf(this.tabla, this.tabla.length + otraLista.tabla.length);
        
        System.arraycopy(otraLista.tabla, 0, this.tabla, tamIni, otraLista.tabla.length);
    }
    
    public void insertar(int posicion, Integer nuevo) {
        
        this.tabla = Arrays.copyOf(this.tabla, this.tabla.length + 1);
        
        System.arraycopy(this.tabla, posicion, this.tabla, posicion + 1, this.tabla.length - posicion - 1);
        
        this.tabla[posicion] = nuevo;
        
    }
    
    public Integer eliminar(int indice) {
        
        Integer eliminado = null;
        
        if (indice >= 0 && indice < this.tabla.length) {
            
            eliminado = this.tabla[indice];
            
            for (int i = indice + 1; i < this.tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }
    
    public Integer get(int indice) {
        
        Integer resultado = null;
        
        if(indice >= 0 && indice < this.tabla.length) {
            resultado = this.tabla[indice];
        }
        
        return resultado;
    }
    
    public int buscar(Integer clave) {
        int indice = -1;
        
        for (int i = 0; i < this.tabla.length && indice == -1; i++) {
            
            if (this.tabla[i].equals(clave)) indice = i;
            
        }
        
        return indice;
    }
    
    public int numeroElementos() {
        
        return this.tabla.length;
    }
    
    public void mostrar() {
        
        System.out.println(Arrays.toString(this.tabla));
    }

    public Integer[] getTabla() {
        return tabla;
    }
    
}
