public class Articulo {
    String titulo;
    String autor;
    String codigo;
    int precio;
    boolean estado;
    int stock;
    int tiempo;
    int prestamo;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getStock() {
        return stock;
    }

    public int getTiempo() {
        return tiempo;
    }

    public int getPrestamo() {
        return prestamo;
    }

    public boolean disponible() {
        return estado;
    }
    public boolean comprable(){
        return stock > 0;
    }

    @Override
    public String toString(){
        return titulo + "," + autor + "," + codigo + "," + precio + "," + estado+","+stock+","+tiempo+","+prestamo;
    }

}
