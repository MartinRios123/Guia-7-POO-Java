package POO_Eje6;

import java.util.Locale;
import java.util.Scanner;

public class Cafetera {
    int capacidadMaxima;
    int cantidadActual;
    
    public Cafetera(){
        
    }
    
    public Cafetera(int capacidaMaxima,int cantidadActual){
        this.capacidadMaxima = capacidaMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void pedirDatosCafetera(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        while(capacidadMaxima <= 0 || capacidadMaxima > 1000){
            System.out.println("Ingrese la capacidad máxima de la cafetera: ");
            capacidadMaxima = leer.nextInt();
        }
    }
    
    public void llenarCafetera(){
        cantidadActual = capacidadMaxima;
        System.out.println("Cafetera llenada");
    }
    
    public void servirTaza(int tamañoTaza){
        int taza;
        
        if (tamañoTaza > cantidadActual) {
            taza = cantidadActual;
            System.out.println("No alcanza la cantidad de cafe para llenar su taza.");
            System.out.println("Su taza quedó en: " + taza +"/"+ tamañoTaza);
        } else if(tamañoTaza == cantidadActual) {
            taza = cantidadActual;
            System.out.println("La taza se lleno completamente.");
        } else {
            taza = cantidadActual - (cantidadActual - tamañoTaza);
            cantidadActual = cantidadActual - tamañoTaza;
            System.out.println("Se llenó completamente.");
        }
    }
    
    public void vaciarCafetera(){
        cantidadActual = 0;
        System.out.println("Cafetera vaciada.");
    }
    
    public void agregarCafe(int cantidadCafe){
        if (cantidadActual < capacidadMaxima) {
            cantidadActual += cantidadCafe;
            System.out.println("Se agregó cafe a la cafetera");
        }else{
            System.out.println("La cafetera ya está llena");
        }
        if (cantidadActual > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        }
    }
    
}
