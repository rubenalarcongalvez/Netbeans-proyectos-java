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
public class Conjunto {
    
    //ATRIBUTOS
    private Lista lista;
    
    //CONSTRUCTOR
    public Conjunto() {
        this.lista = new Lista();
    }
    
    //METODOS
    public int numeroElementos() {
        
        return this.lista.numeroElementos();
    }
    
    public boolean insertar(Integer nuevo) {
        
        boolean puedeInsertar = false;
        
        if(!this.pertenece(nuevo)) {
            
            this.lista.insertarFinal(nuevo);
            puedeInsertar = true;
            
        }
        return puedeInsertar;
    }  
    
    public boolean eliminarElemento(Integer elemento) {
        
        boolean seHaEliminado = false;
        
        if(this.pertenece(elemento)) {
            
            this.lista.eliminar(this.lista.buscar(elemento));
            
            seHaEliminado = true;
        }
        return seHaEliminado;
    }
    
    public boolean insertar(Conjunto otroConjunto) {
        
        boolean seHaInsertado = true;
        
        
        for (Integer elem : otroConjunto.lista.getTabla()) {
            
            if(this.pertenece(elem)) {
                
                seHaInsertado = false;
                
            }
        }
        
        if(seHaInsertado) {
            
            for (Integer elem : otroConjunto.lista.getTabla()) {
                    
                this.insertar(elem);
            }
        }
        
        return seHaInsertado;
    }
    
    public boolean eliminarConjunto(Conjunto otroConjunto) {
        
        boolean seHanEliminadoElementos = false;
        
        for (Integer elem : otroConjunto.lista.getTabla()) {
            
            if(this.pertenece(elem)) {
                
                this.eliminarElemento(elem);
                seHanEliminadoElementos = true;
            }
        }
        
        return seHanEliminadoElementos;
    }
    
   
    
    public boolean pertenece(Integer elemento) {
        
        boolean pertenece = true;
        
        if (this.lista.buscar(elemento) == -1) pertenece = false;

        return pertenece;
        
    }
    
    public void muestra() {
        
        this.lista.mostrar();
    }
    
    //--------------------------------  EJERCICIO 7.22  ------------------------------------------
    
    public static boolean incluido(Conjunto c1, Conjunto c2) {
        
        boolean incluido = true;
        
        for (Integer elem : c1.lista.getTabla()) {
            
            if(!c2.pertenece(elem)) incluido = false;
                
        }
        
        return incluido;
    }
    
    public static Conjunto union(Conjunto c1, Conjunto c2) {
        
        Conjunto nuevoConjunto = new Conjunto();
        
        nuevoConjunto.insertar(c1); nuevoConjunto.insertar(c2);
        
        for (Integer elem : c2.lista.getTabla()) {
            
            nuevoConjunto.insertar(elem);
        }
        
        return nuevoConjunto;
    }
    
    public static Conjunto interseccion(Conjunto c1, Conjunto c2) {
        
        Conjunto interseccion = new Conjunto();
        
        for (int i = 0; i < c1.lista.numeroElementos(); i++) {
            
            if (c2.pertenece(c1.lista.get(i))) interseccion.insertar(c1.lista.get(i));
        }
        
        return interseccion;
    }
    
    public static Conjunto diferencia(Conjunto c1, Conjunto c2) {
        
        Conjunto diferencia = new Conjunto();
        
        for (int i = 0; i < c1.lista.numeroElementos(); i++) {
            
            if (!c2.pertenece(c1.lista.get(i))) diferencia.insertar(c1.lista.get(i));
        }
        
        return diferencia;
    }
}