package maquinaria;

public class Vagon { 
    private int numIdentificativo;
    private int cargaMax;
    private int cargaActual;
    private String mercancia;

    public Vagon(int numIdentificativo, int cargaMax, int cargaActual, String mercancia) {
       this.numIdentificativo = numIdentificativo;
       this.cargaMax = cargaMax;

       if (cargaActual < this.cargaMax)  
          this.cargaActual = cargaActual;
       else
         this.cargaActual = this.cargaMax;

       this.mercancia = mercancia;
    }

     public int getNumIdentificativo() {
         return numIdentificativo;
     }

     public void setNumIdentificativo(int numIdentificativo) {
         this.numIdentificativo = numIdentificativo;
     }

     public int getCargaMax() {
         return cargaMax;
     }

     public void setCargaMax(int cargaMax) {
         this.cargaMax = cargaMax;
     }

     public int getCargaActual() {
         return cargaActual;
     }

     public void setCargaActual(int cargaActual) {
         if (cargaActual < this.cargaMax)  
             this.cargaActual = cargaActual;
     }

     public String getMercancia() {
         return mercancia;
     }

     public void setMercancia(String mercancia) {
         this.mercancia = mercancia;
     }
}
