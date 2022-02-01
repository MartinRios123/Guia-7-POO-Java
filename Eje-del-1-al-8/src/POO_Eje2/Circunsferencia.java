package POO_Eje2;

import java.util.Locale;
import java.util.Scanner;

public class Circunsferencia {
    
    //atributos de instancia
    private double radio;
    
    //constructor vacío
    public Circunsferencia(){
    
    }
    //constructor parametrizado
    public Circunsferencia(double radio){
        this.radio = radio;
    }
    
    //metodo set 
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    //metodo get
    public double getRadio(){
        return radio;
    }
    
    //metodo crear circunsferencia
    public void crearCircunsferencia(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el radio: ");
        radio = leer.nextDouble();
    }
    
    //metodo para resolver el area
    public void crearArea(){
        System.out.printf("El area de la circunferencia es: %.2f \n", (Math.PI * Math.pow(radio, 2)));
    }
    
    //metodo para resolver el perimetro
    public void crearPerimetro(){
        System.out.printf("El perimetro de la circunferencia es: %.2f \n", 2 * Math.PI * radio);

    }
}
