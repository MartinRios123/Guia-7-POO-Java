package POO_Eje4;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {
    private int base;
    private int altura;
    
    public Rectangulo(){
        
    }
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        do{  
            System.out.println("Ingrese un numero para la base de un rectangulo:");
            base = leer.nextInt();
            System.out.println("Ingrese un numero para la altura de un rectangulo: ");
            altura = leer.nextInt();
        }while(base == altura);
    }
    
     public void crearSuperficie(){
        System.out.println("La superficie del rectangulo es: "+ base * altura);
    }
    
    public void crearPerimetro(){
        System.out.println("El perimetro de la circunferencia es: "+ (base * altura) * 2);
    }
    
    public void crearDibujoRectangulo(){
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
               if (i == 0 || i == base-1 || j == 0 || j == altura-1){
                    System.out.print(" * "); 
                }else{
                    System.out.print("   ");
                }
            } 
            System.out.println("");  
        }
    }
}
