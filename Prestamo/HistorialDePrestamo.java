package Prestamo;

public class HistorialDePrestamo extends SistemaPrestamo{

    private String fechaDePrestamo;
    private String fechaDeDevolucion;
    private String estado;
    private String libro;
    private String usuario;
    private String multa;

    public HistorialDePrestamo(String fechaDePrestamo, String fechaDeDevolucion, String estado, String libro, String usuario, String multa) {
        this.fechaDePrestamo = fechaDePrestamo;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.estado = estado;
        this.libro = libro;
        this.usuario = usuario;
        this.multa = multa;
    }

    public String getFechaDePrestamo() {
        return fechaDePrestamo;
    }

    public void setFechaDePrestamo(String fechaDePrestamo) {
        this.fechaDePrestamo = fechaDePrestamo;
    }

    public String getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(String fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMulta() {
        return multa;
    }

    public void setMulta(String multa) {
        this.multa = multa;
    }


}
