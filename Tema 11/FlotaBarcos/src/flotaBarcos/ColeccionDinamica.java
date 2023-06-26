package flotaBarcos;

import java.io.Serializable;
import java.util.Arrays;

public class ColeccionDinamica<T> implements Serializable {

    // ATRIBUTOS
    private T[] ArrayElementos = null;  // ArrayElementos esta vacia y sin direccion
                                        // Array de elementos Tipo T  generica
    // CONSTRUCTORES
    public ColeccionDinamica(T[] Lista) {  // constructor carga una lista de un archivo de datos
        this.ArrayElementos = Lista;
    }

    public ColeccionDinamica() {                 // constructor para nueva lista
        this.ArrayElementos  = (T[]) new Object[0];
    }

    // GETTERS && SETTERS
    public T[] getArrayElementos() {
        return ArrayElementos;
    }

    public void setArrayElementos(T[] ArrayElementos) {
        this.ArrayElementos = ArrayElementos;
    }

    // METODOS 
    public int numeroDeElementos() {
        return ArrayElementos.length;
    }

    public int estaEnColeccion( T elemento) {  // si son iguales deben tener la misma direccion 
        int indice = -1;
        if (this.numeroDeElementos() > 0) {
            // Funcionara casi como un WHILE ya que tien DOS condiciones. TAMAÑO Y SALIDA
            for (int i = 0; i < ArrayElementos.length && indice == -1; i++) { // ****
                if (ArrayElementos[i].equals(elemento)) {
                    indice =  i;
                }
            } 
        }
        return indice;
    }
    
    public boolean insertarElemento(T elemento){   // Inserta elemento por el final
        boolean insertado = false;
        if (estaEnColeccion(elemento)<0){
        this.ArrayElementos = Arrays.copyOf(ArrayElementos, numeroDeElementos()+1);
        this.ArrayElementos[numeroDeElementos()-1] = elemento;
        insertado =  true;
    }
        return insertado;
    }
    
    public T eliminarElemento() {  // Elimina elemento por el principio
        T elemento = null;
        if (numeroDeElementos()>0){
            elemento = ArrayElementos[0];
            System.arraycopy(ArrayElementos, 1, ArrayElementos, 0, numeroDeElementos()-1); 
            ArrayElementos = Arrays.copyOf(ArrayElementos, numeroDeElementos()-1);
        }
            System.arraycopy(this, 0, this, 0, 0);
        return elemento;
    }   
            
   public T eliminarElemento(T buscado) {  // Elimina elemento buscado
        T elemento = null;
        int indice = estaEnColeccion(buscado);
        
        if (indice >= 0){
            elemento = ArrayElementos[indice];
            
            System.arraycopy(ArrayElementos, indice + 1, ArrayElementos, indice, numeroDeElementos()-indice -1); 
            ArrayElementos = Arrays.copyOf(ArrayElementos, numeroDeElementos()-1);
        }
        return elemento;
    }   
   

    @Override
    public String toString() {
        return "ColeccionDinamica "+ Arrays.deepToString(ArrayElementos);
    }
    
}


