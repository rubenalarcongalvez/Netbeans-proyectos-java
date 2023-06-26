package maquinaria;

import personal.Maquinista;

public class Tren {
   private Locomotora locomotora;
   private Vagon vagones[];
   private Maquinista responsable;
   private int numVagones; 

   public Tren(Locomotora locomotora, Maquinista responsable) {
      this.locomotora = locomotora;
      this.responsable = responsable;

      vagones = new Vagon[5]; 
      numVagones = 0; 
   }


    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public Maquinista getResponsable() {
        return responsable;
    }

    public void setResponsable(Maquinista responsable) {
        this.responsable = responsable;
    }
    
    public int getNumeroVagones() {
        return this.numVagones;
    }
    
    public void enganchaVagon(int cargaMax, int cargaActual, String mercancia) {
        if (numVagones >= 5) {
           System.out.println("El tren no admite más vagones");
        } else {
           Vagon v = new Vagon(numVagones, cargaMax, cargaActual, mercancia);
           vagones[numVagones] = v; 
           numVagones++; 
        }
    }
   
}
