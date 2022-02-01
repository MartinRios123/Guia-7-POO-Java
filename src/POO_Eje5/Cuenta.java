package POO_Eje5;

import java.util.Locale;
import java.util.Scanner;

public class Cuenta {

    int numeroCuenta;
    long dni;
    double saldoActual;

    public Cuenta() {
       
    }

    public Cuenta(long dni, int numeroCuenta, double saldoActual) {
        this.dni = dni;
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el numero de Cuenta: ");
        numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el dni: ");
        dni = leer.nextLong();
        while(saldoActual <= 0){    
            System.out.println("Ingrese el saldoActual: ");
            saldoActual = leer.nextDouble();
        }
    }

    public void ingresar(double ingresoDinero) {
        saldoActual += ingresoDinero;
    }

    public void retirar(double retiroDinero) {
        if (retiroDinero >= saldoActual) {
            saldoActual = 0;
        } else {
            saldoActual -= retiroDinero;
        }
    }

    public void extraccionRapida() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Cantidad de dinero para la extracción rápida:");
        double extraccion = leer.nextDouble();
        if (saldoActual > 0) {
            if (extraccion <= (saldoActual * 0.2)) {
                saldoActual -= extraccion;
            } else {
                System.out.println("No puede retirar más del 20%");
            }
        }else{
            System.out.println("No tiene saldo en la cuenta");
        }
    }

    public void consultarSaldo() {
        System.out.printf("Su saldo actual es de: %.2f \n",saldoActual);
    }

    public void consultarDatos() {
        System.out.println("DATOS: ");
        System.out.println("numeroCuenta:" + numeroCuenta);
        System.out.println("DNI: " + dni);
    }
}
