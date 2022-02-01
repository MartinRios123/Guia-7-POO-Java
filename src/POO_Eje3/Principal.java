package POO_Eje3;

public class Principal {

    public static void main(String[] args) {
        Operacion operaciones = new Operacion();
        
        operaciones.crearOperacion();
        System.out.println("Suma :"+ operaciones.sumar());
        System.out.println("Resta: "+ operaciones.restar());
        System.out.println("Multiplicación: "+ operaciones.multiplicar());
        System.out.println("División: "+ operaciones.dividir());
    }
}
