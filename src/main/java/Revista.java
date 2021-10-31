import java.util.Scanner;

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
    public static void crearRevista() {
        System.out.println("creando Revista");
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrece un titulo");
        String titulo = sc.next();
        System.out.println("ingrese autor");
        String autor = sc.next();
        System.out.println("ingrese codigo");
        String codigo = sc.next();
        System.out.println("ingrese precio");
        String precio = sc.next();
        System.out.println("ingrese estado boolean");
        String estado = sc.next();
        System.out.println("ingrese stock");
        String stock = sc.next();
        System.out.println("tiempo");
        String tiempo = sc.next();
        System.out.println("prestamo");
        String prestamo = sc.next();
        System.out.println("tema");
        String tematica = sc.next();

        try {
            Libreria.revistas.add(new Revista(titulo, autor, codigo, precio, estado, stock, tiempo, prestamo, tematica));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public String toString(){
        return titulo + "," + autor + "," + codigo + "," + precio + "," + estado+","+stock+","+tiempo+","+prestamo+","+tema;
    }


    public String getTema() {
        return tema;
    }

}
