package guia2_poo_eje8;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cadena cadena = new Cadena();
        int opcion;
        String letra;
        boolean encontrar;
        
        System.out.println("Ingrese una frase: ");
        cadena.setFrase(leer.next());
        cadena.setLongitud(cadena.getFrase().length());
        do{
            System.out.println("-------------");
            System.out.println("MENU");
            System.out.println("1.Mostrar vocales");
            System.out.println("2.Invertir frase");
            System.out.println("3.Veces repetido");
            System.out.println("4.Comparar longitud");
            System.out.println("5.Unir frases");
            System.out.println("6.Reemplazar letra");
            System.out.println("7.Contiene la letra");
            System.out.println("8.Salir");
            System.out.println("-------------");
            System.out.println("Ingrese el numero de lo que desee realizar: ");    
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cadena.mostrarVocales();
                    break;
                case 2:
                    cadena.invertirFrase();
                    break;
                case 3:
                    System.out.println("Ingrese una letra para ver cuantas veces se repite: ");
                    cadena.vecesRepetido(leer.next());
                    break;
                case 4:
                    System.out.println("Ingrese una frase para comparar: ");
                    cadena.compararLongitud(leer.next());
                    break;
                case 5:
                    System.out.println("Ingrese una frase a unir: ");
                    cadena.unirFrases(leer.next());
                    break;
                case 6:
                    System.out.printf("Ingrese una letra para reemplazar las letras \"a\" : ");
                    letra = leer.next();
                    while(letra.length() > 1){
                        System.out.println("ERROR. Ingrese solo una letra a unir: ");
                        letra = leer.next();
                    }
                    cadena.reemplazar(letra);
                    break;
                case 7:
                    System.out.println("Ingrese una letra a encontrar: ");
                    letra = leer.next();
                    while(letra.length() > 1){
                        System.out.println("ERROR. Ingrese solo una letra a encontrar: ");
                        letra = leer.next();
                    }
                    encontrar = cadena.contiene(letra);
                    if (encontrar == true) {
                        System.out.println("La letra se encuentra en la frase.");
                    }else{
                        System.out.println("La letra no fue encontrada en la frase.");
                    }
                    break;
                default:
                    System.out.println("ERROR. Opción incorrecta.");
            }        
        }while(opcion != 8);
    }   
}
