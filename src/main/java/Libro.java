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
        System.out.println("Creando Libro");
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrece un titulo");
        String titulo=sc.next();
        System.out.println("ingrese autor");
        String autor=sc.next();
        System.out.println("ingrese codigo");
        String codigo=sc.next();
        System.out.println("ingrese precio");
        String precio=sc.next();
        System.out.println("ingrese estado boolean");
        String estado=sc.next();
        System.out.println("ingrese stock");
        String stock=sc.next();
        System.out.println("tiempo");
        String tiempo=sc.next();
        System.out.println("prestamo");
        String prestamo=sc.next();
        System.out.println("tematica");
        String tematica=sc.next();
        System.out.println("ingresegenero");
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
