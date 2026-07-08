import java.util.Scanner;
public class Tienda extends Parcela {
    
    // 1. Aquí agregamos los [] después de int
    public int[] configurarInventario() {
        
        /* usare listas dinamicas */
        var consola = new Scanner(System.in);
        System.out.println("proporciona cuantas parcelas");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        var enteros = new int[largoArreglo];
        
        for(var i = 0; i<largoArreglo; i++){
            System.out.print("proporciona enteros["+i+"]=");
            enteros[i]=Integer.parseInt(consola.nextLine());
        }
        
        System.out.println("impresion del arreglo:");
        for(var i=0; i<largoArreglo; i++){
            System.out.println("calidad del 1 al 100[" +i+ "]="+enteros[i]);
        }
        
        // 2. Aquí regresamos el arreglo para que el main lo pueda recibir
        return enteros; 
    }
}
