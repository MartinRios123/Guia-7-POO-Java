package guia2_poo_eje9;

import java.util.Locale;
import java.util.Scanner;

public class Principal{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Matematica matematica = new Matematica();
        
        matematica.setNumero1(Math.random() * 30);
        matematica.setNumero2(Math.random() * 30);
        System.out.println("Numero 1: "+ matematica.getNumero1());
        System.out.println("Numero 2: "+ matematica.getNumero2());
        System.out.println("");
        System.out.println("El mayor numero es: "+ matematica.devolverMayor());
        System.out.print("Potencia: ");
        matematica.calcularPotencia();
        System.out.print("Raiz: ");
        matematica.calcularRaiz();
    }
    
}
