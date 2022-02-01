package POO_Eje6;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cafetera cafetera = new Cafetera();
        int opcion; int tamañoTaza; int cantidadCafe;
        
        cafetera.pedirDatosCafetera();
       
        do{
            System.out.println("-------------");
            System.out.println("MENU");
            System.out.println("1.Llenar Cafetera");
            System.out.println("2.Servir Taza");
            System.out.println("3.Vaciar Cafetera");
            System.out.println("4.Agregar Cafe");
            System.out.println("5.Salir");
            System.out.println("-------------");
            System.out.println("Ingrese el numero de lo que desee realizar: ");    
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cafetera.llenarCafetera();
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de la taza: ");
                    tamañoTaza = leer.nextInt();
                    cafetera.servirTaza(tamañoTaza);
                    break;
                case 3:
                    cafetera.vaciarCafetera();
                    break;
                case 4:
                    System.out.println("Ingrese una cantidad de cafe para agregar a la cafetera:");
                    cantidadCafe = leer.nextInt();
                    cafetera.agregarCafe(cantidadCafe);
                    break;
            }        
        }while(opcion != 5);
    }
}
