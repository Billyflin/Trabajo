public class Revista extends Articulo{
    private final String tema;
    public Revista(String titulo, String autor, String codigo, String precio, String estado,String stock,String tiempo,String prestamo, String tematica) {
        super();
        this.titulo=titulo;
        this.autor=autor;
        this.codigo=codigo;
        this.precio= Integer.parseInt(precio);
        this.estado= Boolean.parseBoolean(estado);
        this.stock= Integer.parseInt(stock);
        this.tiempo= Integer.parseInt(tiempo);
        this.prestamo= Integer.parseInt(prestamo);
        this.tema= tematica;
    }
    @Override
    public String toString(){
        return titulo + "," + autor + "," + codigo + "," + precio + "," + estado+","+stock+","+tiempo+","+prestamo+","+tema;
    }
}
