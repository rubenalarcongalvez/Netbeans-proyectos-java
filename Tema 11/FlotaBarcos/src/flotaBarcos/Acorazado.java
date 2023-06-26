
package flotaBarcos;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Acorazado extends Barco implements Serializable {
    protected int numCaniones = 0;
    protected final String MICOD = "AC-";
    protected static  int numCod = 1;

    public Acorazado(int longitud, int numCaniones) {
        this.setCodigoBarco(MICOD+numCod);
        numCod++;
        this.setLongitud(longitud);
        if (numCaniones > 0)
            this.numCaniones = numCaniones;
    }

    public int getNumCaniones() {
        return numCaniones;
    }

    public void setNumCaniones(int numCaniones) {
        this.numCaniones = numCaniones;
    }

    @Override
    public String toString() {
       
       String cad= "";
       cad = super.toString()                  
               + "\nnumCaniones = " + numCaniones+ "\n";              
       
       return cad;
    }
    
    
    
}
