import java.util.Scanner;

public class Documento extends Articulo{
    private final String clasificacion;
    public Documento(String titulo, String autor, String codigo, String precio, String estado,String stock,String tiempo,String prestamo, String tematica) {
        super();
        this.titulo=titulo;
        this.autor=autor;
        this.codigo=codigo;
        this.precio= Integer.parseInt(precio);
        this.estado= Boolean.parseBoolean(estado);
        this.stock= Integer.parseInt(stock);
        this.tiempo= Integer.parseInt(tiempo);
        this.prestamo= Integer.parseInt(prestamo);
        this.clasificacion= tematica;
    }
    public static void crearDocumento(){
        System.out.println("Creando documento");
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
        System.out.println("clasificacion");
        String tematica=sc.next();
        try{
            Libreria.documentos.add(new Documento(titulo,autor,codigo,precio,estado,stock,tiempo,prestamo,tematica));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public String getClasificacion() {
        return clasificacion;
    }

    @Override
    public String toString(){
        return titulo + "," + autor + "," + codigo + "," + precio + "," + estado+","+stock+","+tiempo+","+prestamo+","+clasificacion;
    }
}
