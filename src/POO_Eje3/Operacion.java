package POO_Eje3;

import java.util.Locale;
import java.util.Scanner;

public class Operacion {
    
    //atributos
    private int numero1;
    private int numero2;
    
    //constructor vacio
    public Operacion(){
    }
    
    //constructor parametrizado
    public Operacion(int numero1,int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //metodo set
    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }
    
    //metodo get
    public int getNumero1(){
        return numero1;
    }
    
    //metodo set
    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }
    
    //metodo get
    public int getNumero2(){
        return numero2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el número 1: ");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el número 2: ");
        numero2 = leer.nextInt();
    }
   
    public int sumar(){ 
        return numero1 + numero2;
    }
    
    public int restar(){
        return numero1 - numero2;
    }
    
    public int multiplicar(){
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error en la multiplicacion, se encontro un 0");
        }
        return numero1 * numero2;  
    }
    
    public int dividir(){
        if (numero1 == 0 || numero2 == 0){
            return 0;
        }
        return numero1 / numero2;
    }
}
