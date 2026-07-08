import java.util.Random;

public class Clima{
//estaciones del anio verano otonio verano invierno primavera 

Random randomNumbers = new Random();


public void Estacion(){
    Random random = new Random();
    var numeroAleatorio = random.nextInt(4);//***************************************** */

        switch (numeroAleatorio){
            case 1:
                System.out.println("Verano");
                break;

            case 2:
                System.out.println("Otonio");
                break;
            case 3:
                System.out.println("Invierno");
                break;
            case 4:
                System.out.println("Primavera");
                break;

            default:
            System.out.println("dato invalido.");
        }

    }
}




