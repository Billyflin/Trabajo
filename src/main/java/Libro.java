import java.util.Scanner;

public class Libro extends Articulo{
    private final String tematica;
    private final String genero;

    public Libro(String titulo, String autor, String codigo, String precio, String estado,String stock,String tiempo,String prestamo, String tematica, String genero) {
        super();
        this.titulo=titulo;
        this.autor=autor;
        this.codigo=codigo;
        this.precio= Integer.parseInt(precio);
        this.estado= Boolean.parseBoolean(estado);
        this.stock= Integer.parseInt(stock);
        this.tiempo= Integer.parseInt(tiempo);
        this.prestamo= Integer.parseInt(prestamo);
        this.tematica=tematica;
        this.genero=genero;
    }
    public static void crearLibro(){
        Scanner sc=new Scanner(System.in);
        String titulo=sc.next();
        String autor=sc.next();
        String codigo=sc.next();
        String precio=sc.next();
        String estado=sc.next();
        String stock=sc.next();
        String tiempo=sc.next();
        String prestamo=sc.next();
        String tematica=sc.next();
        String genero=sc.next();
        try{
            Libreria.libros.add(new Libro(titulo,autor,codigo,precio,estado,stock,tiempo,prestamo,tematica,genero));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void showAll(){
        for (Libro l:Libreria.libros
             ) {
            System.out.println(l.toString());
        }
    }

    public String getTematica() {
        return tematica;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return titulo +"," + autor +
                "," + codigo +
                "," + precio +
                "," + estado +
                "," + stock +
                "," + tiempo +
                "," + prestamo +
                "," + tematica +
                "," + genero;
    }
}
