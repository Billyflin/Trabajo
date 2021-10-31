import java.util.Scanner;

public class Diario extends Articulo{
    private final int perPublicacion;

    public Diario(String titulo, String autor, String codigo, String precio, String estado,String stock,String tiempo,String prestamo, String tematica) {
        super();
        this.titulo=titulo;
        this.autor=autor;
        this.codigo=codigo;
        this.precio= Integer.parseInt(precio);
        this.estado= Boolean.parseBoolean(estado);
        this.stock= Integer.parseInt(stock);
        this.tiempo= Integer.parseInt(tiempo);
        this.prestamo= Integer.parseInt(prestamo);
        this.perPublicacion= Integer.parseInt(tematica);
    }
    public static void crearDiario(){
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
        try{
            Libreria.diarios.add(new Diario(titulo,autor,codigo,precio,estado,stock,tiempo,prestamo,tematica));
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public int getPerPublicacion() {
        return perPublicacion;
    }

    @Override
    public String toString(){
        return titulo + "," + autor + "," + codigo + "," + precio + "," + estado+","+stock+","+tiempo+","+prestamo+","+perPublicacion;
    }
}
