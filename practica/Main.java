package practica;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando el programa principal...");

        // Llamamos al método de la otra clase
        String mensaje = Funcion1.saludar("Programador");
        
        // Imprimimos el resultado en la consola
        System.out.println(mensaje);
    }
}