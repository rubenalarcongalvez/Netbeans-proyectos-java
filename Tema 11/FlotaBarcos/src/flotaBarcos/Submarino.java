package flotaBarcos;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Submarino extends Barco implements Serializable {
    
    protected int LongPeriscopio = 0;
    protected final String MICOD = "SUB-";
    protected static  int numCod = 1;

    public Submarino(int longitud, int LongPeriscopio) {
        this.setCodigoBarco(MICOD+numCod);
        numCod++;
        this.setLongitud(longitud);
        if (LongPeriscopio > 0)
            this.LongPeriscopio = LongPeriscopio;
    }

    public double getLongPeriscopio() {
        return LongPeriscopio;
    }

    public void setLongPeriscopio(int LongPeriscopio) {
        this.LongPeriscopio = LongPeriscopio;
    }

    @Override
    public String toString() {
        String cad = "";
        cad = super.toString()             
              + "\nLongPeriscopio = " + LongPeriscopio + "\n";
        return cad;
    }    
    
    
}
