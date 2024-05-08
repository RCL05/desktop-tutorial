package Prestamo;

public class Prestamo extends SistemaPrestamo {
    protected boolean multa;
    Prestamo prestamo = new Prestamo();

    public Prestamo(boolean multa) {
        this.multa = multa;
    }

}
