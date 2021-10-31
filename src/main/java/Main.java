import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            leerArchivos();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        verDisponibilidad();
        crearArticulo();
        guardarArchivos();
    }
    public static void verDisponibilidad(){
        for (Libro l: Libreria.libros
             ) {
            if(l.disponible()){
                System.out.println(l.getTitulo() + " esta Disponible");
            }else if (!l.disponible()){
                System.out.println(l.getTitulo() + " no esta Disponible");

            }
        }
    }

    public static void leerArchivos() throws FileNotFoundException {
            csvReadD();
            csvReadC();
            csvReadB();
            csvReadA();
    }
    public static void guardarArchivos(){
            Gestor.guardarDiarios();
            Gestor.guardarRevistas();
            Gestor.guardarDocumentos();
            Gestor.guardarLibros();
    }
    public static void crearArticulo(){
        showMenu();
        switch(validar(4)){
            case 1 -> Libro.crearLibro(); 
            case 2 -> Documento.crearDocumento();
            case 3 -> Diario.crearDiario();
            case 4 -> Revista.crearRevista();
        }
    }

    private static void showMenu() {
        System.out.println("MENU");
        System.out.println("1) Crear Libro");
        System.out.println("1) Crear Documento");
        System.out.println("1) Crear Diario");
        System.out.println("1) Crear Revista");
    }

    public static int validar(int x) {
        int n = -1;
        do {
            //Scanner ponerlo dentro del DO, y dentro de una función
            Scanner teclado = new Scanner(System.in);
            //System.out.println("ingrese otro numero");
            try {
                n = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Error! Por favor, >Ingrese un número<");
            }
            if (n < 0 || n > x) {
                System.out.println("Ingrese un numero válido");
            }
        } while (n < 0 || n > x);
        return n;
    }

    static final String librosRuta ="src/main/resources/libros.CSV";
    static final String diariosRuta ="src/main/resources/diario.CSV";
    static final String revistaRuta ="src/main/resources/revistas.CSV";
    static final String documentoRuta ="src/main/resources/documentos.CSV";
    public static void csvReadA() throws FileNotFoundException {
        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
        var builder = new CSVReaderBuilder(new FileReader(librosRuta));
        try (CSVReader reader = builder.withCSVParser(parser).withSkipLines(1).build()) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                String titulo = nextLine[0];
                String autor = nextLine[1];
                String codigo =nextLine[2];
                String precio =nextLine[3];
                String estado =nextLine[4];
                String stock =nextLine[5];
                String tiempo =nextLine[6];
                String prestamo =nextLine[7];
                String tematica =nextLine[8];
                String genero =nextLine[9];
                Libreria.libros.add(new Libro(titulo,autor,codigo,precio,estado,stock,tiempo,prestamo,tematica,genero));
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
    public static void csvReadB() throws FileNotFoundException {
        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
        var builder = new CSVReaderBuilder(new FileReader(diariosRuta));
        try (CSVReader reader = builder.withCSVParser(parser).withSkipLines(1).build()) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                String titulo = nextLine[0];
                String autor = nextLine[1];
                String codigo =nextLine[2];
                String precio =nextLine[3];
                String estado =nextLine[4];
                String stock =nextLine[5];
                String tiempo =nextLine[6];
                String prestamo =nextLine[7];
                String tematica =nextLine[8];
                Libreria.diarios.add(new Diario(titulo,autor,codigo,precio,estado,stock,tiempo,prestamo,tematica));
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
    public static void csvReadC() throws FileNotFoundException {
        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
        var builder = new CSVReaderBuilder(new FileReader(documentoRuta));
        try (CSVReader reader = builder.withCSVParser(parser).withSkipLines(1).build()) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                String titulo = nextLine[0];
                String autor = nextLine[1];
                String codigo =nextLine[2];
                String precio =nextLine[3];
                String estado =nextLine[4];
                String stock =nextLine[5];
                String tiempo =nextLine[6];
                String prestamo =nextLine[7];
                String tematica =nextLine[8];
                Libreria.documentos.add(new Documento(titulo,autor,codigo,precio,estado,stock,tiempo,prestamo,tematica));
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
    public static void csvReadD() throws FileNotFoundException {
        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
        var builder = new CSVReaderBuilder(new FileReader(revistaRuta));
        try (CSVReader reader = builder.withCSVParser(parser).withSkipLines(1).build()) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                String titulo = nextLine[0];
                String autor = nextLine[1];
                String codigo =nextLine[2];
                String precio =nextLine[3];
                String estado =nextLine[4];
                String stock =nextLine[5];
                String tiempo =nextLine[6];
                String prestamo =nextLine[7];
                String tematica =nextLine[8];
                Libreria.revistas.add(new Revista(titulo,autor,codigo,precio,estado,stock,tiempo,prestamo,tematica));
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}
