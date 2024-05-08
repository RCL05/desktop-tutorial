package Prestamo;

import LibroBiblioteca.Biblioteca;
import Usuario.Usuario;

import java.util.Date;

public class SistemaPrestamo {
    protected Date fechaDevolucion;
    protected Date fechaPrestamo;
    protected String nombreLibro;
    protected String nombreUsuario;



    //relaciones
    Usuario usuario;
    Biblioteca biblioteca;
    BuscarPublicacion buscarPublicacion;


    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }
    public String getNombreLibro() {
        return nombreLibro;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }



}
