package POO_Eje7;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese cuantas personas quiere evaluar: ");
        Persona[] array = new Persona[leer.nextInt()];
        
        double debajo = 0;
        double ideal = 0;
        double sobrepeso = 0;
        double mayores = 0;
        double menores = 0;
        
        System.out.printf("Ingrese los datos de %d personas:\n",array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("\nPersona [%d]: \n", i + 1 );
            array[i] = new Persona();
            array[i].crearPersona();
            
            System.out.printf("IMC[%d]: %d\n", i + 1, array[i].calcularImc());
            
            switch(array[i].calcularImc()){
                case -1:
                    debajo++;
                    break;
                case 0:
                    ideal++;
                    break;
                case 1:
                    sobrepeso++;
                    break;
            }
            if(array[i].esMayorDeEdad()){
                mayores++;
            }else{
                menores--;
            }
        }
        System.out.println("");
        System.out.println("Porcentaje debajo de peso ideal:"+ (debajo/array.length) * 100+" %");
        System.out.println("Porcentaje peso ideal:"+ (ideal/array.length) * 100 +" %");
        System.out.println("Porcentaje de sobrepeso:"+ (sobrepeso/array.length) * 100 +" %");
        System.out.println("");
        System.out.println("Porcentaje de mayores: "+ (mayores/array.length) * 100 +" %");
        System.out.println("Porcentaje de menores: "+ (mayores/array.length) * 100 +" %");
    }
}
