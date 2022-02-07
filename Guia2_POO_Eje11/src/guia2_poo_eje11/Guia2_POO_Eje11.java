/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package guia2_poo_eje11;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Guia2_POO_Eje11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese el dia:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes(en número):");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año:");
        int año = leer.nextInt();
        
        Date fecha = new Date(año, mes , dia);
        Date fechaActual = new Date();
        
        System.out.printf("\n Fecha: %d/%d/%d\n",fecha.getDate(),fecha.getMonth(),fecha.getYear());
        System.out.printf("\n Fecha actual: %d/%d/%d\n",fechaActual.getDate(),fechaActual.getMonth()+ 1 ,fechaActual.getYear() + 1900);
        System.out.println(" Diferencia entre las fechas: "+((fechaActual.getDate() - fecha.getDate()) + " dias, " + ((fechaActual.getMonth()+ 1) - fecha.getMonth()) + " meses, " + ((fechaActual.getYear()+ 1900) - fecha.getYear()) + " años."));
    }    
}
