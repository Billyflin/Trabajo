public class Articulo {
    String titulo;
    String autor;
    String codigo;
    int precio;
    boolean estado;
    int stock;
    int tiempo;
    int prestamo;

    @Override
    public String toString(){
        return titulo + "," + autor + "," + codigo + "," + precio + "," + estado+","+stock+","+tiempo+","+prestamo;
    }

}
