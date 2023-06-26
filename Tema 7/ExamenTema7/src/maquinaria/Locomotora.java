package maquinaria;


public class Locomotora {
    
   private String matricula;
   private int potencia;

   public Locomotora(String matricula, int potencia) {
      this.matricula = matricula;
      this.potencia = potencia;
   }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
