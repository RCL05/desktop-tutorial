package Usuario;

import Prestamo.SistemaPrestamo;

public class Usuario {
    protected String apellido;
    protected int ci;
    protected String email;
    protected String nombre;

    //relaciones
    SistemaPrestamo sistemaPrestamo;

    public String getApellido() {
        return apellido;
    }
    public int getCi() {
        return ci;
    }
    public String getEmail() {
        return email;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCi(int ci) {
        this.ci = ci;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
