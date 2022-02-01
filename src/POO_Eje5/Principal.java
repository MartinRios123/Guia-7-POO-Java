package POO_Eje5;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cuenta cuenta = new Cuenta();
        double ingresoDinero; double retiroDinero; int opcion;
        
        cuenta.crearCuenta();
        
        do{
            System.out.println("-------------");
            System.out.println("MENU");
            System.out.println("1.Ingresar");
            System.out.println("2.Retirar");
            System.out.println("3.Extracción Rápida");
            System.out.println("4.Consultar Saaldo");
            System.out.println("5.Consultar Datos");
            System.out.println("6.Salir");
            System.out.println("-------------");
            System.out.println("Ingrese el numero de lo que desee realizar: ");    
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Cantidad de dinero a ingresar: ");
                    ingresoDinero = leer.nextDouble();
                    cuenta.ingresar(ingresoDinero);
                    break;
                case 2:
                    System.out.println("Cantidad de dinero a retirar: ");
                    retiroDinero = leer.nextDouble();
                    cuenta.retirar(retiroDinero);
                    break;
                case 3:
                    cuenta.extraccionRapida();
                    break;
                case 4:
                    cuenta.consultarSaldo();
                    break;
                case 5:
                    cuenta.consultarDatos();
                    break;
            }        
        }while(opcion != 6);
    }
}
