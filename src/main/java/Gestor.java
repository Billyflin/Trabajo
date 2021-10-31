import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public interface Gestor {
    static boolean PacienteLogExist(){
        Path archivo = Paths.get(Main.librosRuta);
        return archivo.toFile().canWrite();
    }
    static boolean EspecialistaLogExist(){
        Path archivo = Paths.get(Main.librosRuta);
        return archivo.toFile().canWrite();
    }
    static void crearArchivo(String ruta, String contenido) {
        Path archivo = Paths.get(ruta);
        try {
            Files.write(archivo, contenido.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static String leerArchivo(String ruta) {
        Path archivo = Paths.get(ruta);
        String contenido = "";
        try {
            contenido = new String(Files.readAllBytes(archivo));
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser leído");
        }
        return contenido;
    }
    static void nuevaLinea(String ruta, String contenido) {
        String oldContenido = leerArchivo(ruta);
        crearArchivo(ruta, oldContenido + "\n" + contenido);
    }
    static void eliminarArchivo(String ruta) {
        Path archivo = Paths.get(ruta);
        try {
            Files.deleteIfExists(archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void guardarLibros(){
        eliminarArchivo(Main.librosRuta);
        crearArchivo(Main.librosRuta,"titulo,autor,codigo,precio,estado,stock,tiempo,prestamo,tematica,genero");
        for (Libro l: Libreria.libros){
            nuevaLinea(Main.librosRuta,l.toString());
        }
    }
    static void guardarDiarios(){
        eliminarArchivo(Main.diariosRuta);
        crearArchivo(Main.diariosRuta,"titulo,autor,codigo,precio,estado,stock,tiempo,prestamo,perPublicacion");
        for (Diario d: Libreria.diarios){
            nuevaLinea(Main.diariosRuta,d.toString());
        }
    }
    static void guardarRevistas(){
        eliminarArchivo(Main.revistaRuta);
        crearArchivo(Main.revistaRuta,"titulo,autor,codigo,precio,estado,stock,tiempo,prestamo,tema");
        for (Revista r: Libreria.revistas){
            nuevaLinea(Main.revistaRuta,r.toString());
        }
    }static void guardarDocumentos(){
        eliminarArchivo(Main.documentoRuta);
        crearArchivo(Main.documentoRuta,"titulo,autor,codigo,precio,estado,stock,tiempo,prestamo,clasificacion");
        for (Documento d: Libreria.documentos){
            nuevaLinea(Main.documentoRuta,d.toString());
        }
    }
}
