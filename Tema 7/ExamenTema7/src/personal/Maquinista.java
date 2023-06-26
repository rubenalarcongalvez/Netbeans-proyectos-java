package personal;

public class Maquinista {
   private String nombre;
   private String dni;
   private double sueldo;

   public Maquinista(String nombre, String dni, double sueldo) {
      this.nombre = nombre;
      this.dni = dni;
      this.sueldo = sueldo;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
