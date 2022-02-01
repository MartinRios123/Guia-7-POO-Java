package POO_Eje1;



import java.util.Locale;
import java.util.Scanner;


public class Libro {
    
    //atributos de instancia
    private int isbn,nroPaginas;
    private String titulo,autor;
    
    //constructor vacío
    public Libro() {
    }
    
    //constructor parametrizado
    public Libro(int isbn,int nroPaginas,String titulo,String autor){
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.nroPaginas = nroPaginas;
    }
    
    //metodo para cargar el libro
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Datos del libro:");
        System.out.println("Ingrese el isbn:");
        isbn = leer.nextInt();
        System.out.println("Ingrese el autor:");
        autor = leer.next();
        System.out.println("Ingrese el titulo:");
        titulo = leer.next();
        System.out.println("Ingrese el numero de paginas: ");
        nroPaginas = leer.nextInt();
    }    
    
    //metodo para mostrar el libro
    public void mostrarLibro(){
        System.out.println("Muestra de datos del libro");
        System.out.println("ISBN:"+ isbn);
        System.out.println("AUTOR: "+ autor);
        System.out.println("TITULO: "+ titulo);
        System.out.println("NRO DE PAGINAS: "+ nroPaginas);
    }
        
}


