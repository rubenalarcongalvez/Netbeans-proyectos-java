
package flotaBarcos;

import java.io.Serializable;
import java.util.Objects;


public abstract class Barco implements Comparable <Barco>, Serializable {
    
    protected String codigoBarco = "";
    protected int longitud = 0;

    public String getCodigoBarco() {
        return codigoBarco;
    }

    public void setCodigoBarco(String codigoBarco) {
        this.codigoBarco = codigoBarco;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        String cad = "";
        cad = "Barcos " 
                + "\ncodigo = " + codigoBarco 
                + "\nlongitud=" + longitud ;
        return cad;
    }

    @Override
    public int compareTo(Barco b) {
        return this.longitud - b.longitud;  // devuelve 0  negativo o positico
                                            // igual,  menor  o mayor
    }
   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Barco other = (Barco) obj;
        if (this.longitud != other.longitud) {
            return false;
        }
        if (!Objects.equals(this.codigoBarco, other.codigoBarco)) {
            return false;
        }
        return true;
    }
    
    
       
    
    
    
}
