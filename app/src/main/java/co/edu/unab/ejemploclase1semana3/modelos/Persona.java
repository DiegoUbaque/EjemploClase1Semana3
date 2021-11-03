package co.edu.unab.ejemploclase1semana3.modelos;

public class Persona {
    String nombre;
    String Apellido;
    long telefono;

    public Persona(){

    }

    public long getTelefono() {
        return telefono;
    }

    public Persona(String nombre, String apellido, long telefono){
        this.nombre = nombre;
        this.Apellido = apellido;
        this.telefono=telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }
}
