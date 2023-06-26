package actividad11.pkg20;

import java.io.Serializable;

/**
 *
 * @author fran
 */
public class Cliente implements Serializable {

    private final int id;
    private String nombre;
    private int telefono;

    public Cliente(int id, String nombre, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

  

    @Override
    public String toString() {
        return nombre + "\t" + telefono;
    }

}