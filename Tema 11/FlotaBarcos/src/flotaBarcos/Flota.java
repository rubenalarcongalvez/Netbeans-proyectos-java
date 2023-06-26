
package flotaBarcos;

import java.io.Serializable;


public class Flota <Barco> implements Serializable {
    
    // ATRIBUTO
    private ColeccionDinamica flot; // ColeccionDinamica llamada flot

    // CONSTRUCTOR
    public Flota() {
        this.flot = new ColeccionDinamica(); // la coleccion esta vacia = null
    }

    // METODOS
    public int numElementos(){
        return flot.numeroDeElementos();
    }
    
    public boolean insertarBarco( Barco b){
            return flot.insertarElemento(b);            
    }         
        
    public boolean eliminarBarco( Barco b){
       boolean eliminado = false;
       int indice = (flot.estaEnColeccion(b));
       if  (indice >= 0 ){
           flot.eliminarElemento(b);
           eliminado = true;        
       }
       return eliminado;        
    }     

    @Override
    public String toString() {
        return "Flota " + flot.toString();
    }
    
}
