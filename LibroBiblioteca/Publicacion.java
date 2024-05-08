package LibroBiblioteca;

public abstract class Publicacion {
    protected  String nombre;
    protected   String autor;
    protected int isbn;
    protected String fechPublicacion;
    protected String categoria;
    protected String tipo;
    protected int codigoBiblioteca;


    public Publicacion(String nombre, String autor, int isbn, String fechPublicacion, String categoria, String tipo, int codigoBiblioteca) {
        this.nombre = nombre;
        this.autor = autor;
        this.isbn = isbn;
        this.fechPublicacion = fechPublicacion;
        this.categoria = categoria;
        this.tipo = tipo;
        this.codigoBiblioteca = codigoBiblioteca;
    }

    public String getNombre() {
        return nombre;
    }
    public String getAutor() {
        return autor;
    }
    public int getIsbn() {
        return isbn;
    }
    public String getFechPublicacion() {
        return fechPublicacion;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getTipo() {
        return tipo;
    }
    public int getCodigoBiblioteca() {
        return codigoBiblioteca;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public void setFechPublicacion(String fechPublicacion) {
        this.fechPublicacion = fechPublicacion;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setCodigoBiblioteca(int codigoBiblioteca) {
        this.codigoBiblioteca = codigoBiblioteca;
    }

}
