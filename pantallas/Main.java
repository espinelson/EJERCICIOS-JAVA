import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido, ¿qué desea saber?");

        
        ArrayList<Estadisticas> listaRegistros = new ArrayList<>();

        Estadisticas estadisticas2 = new Estadisticas(19, 20, 30, 40, 50, 60, 0);
        listaRegistros.add(estadisticas2); 
        Estadisticas estadisticas3 = new Estadisticas(12, 18, 22, 10, 15, 40, 50);
        listaRegistros.add(estadisticas3);
        Estadisticas estadisticas4 = new Estadisticas(100, 80, 92, 100, 15, 80, 50);
        listaRegistros.add(estadisticas4);
        Estadisticas estadisticas5 = new Estadisticas(12, 18, 100, 10, 15, 90, 50);
        listaRegistros.add(estadisticas5);
        Estadisticas estadisticas6 = new Estadisticas(12, 18, 100, 10, 15, 90, 50);
        listaRegistros.add(estadisticas6);
        Estadisticas estadisticas7 = new Estadisticas(12, 18, 100, 10, 15, 90, 50);
        listaRegistros.add(estadisticas7);
        Estadisticas estadisticas8= new Estadisticas(12, 18, 100, 10, 15, 90, 50);
        listaRegistros.add(estadisticas8);
        Estadisticas estadisticas9 = new Estadisticas(12, 18, 100, 10, 15, 90, 50);
        listaRegistros.add(estadisticas9);
        Estadisticas estadisticas10 = new Estadisticas(12, 18, 100, 10, 15, 90, 50);
        listaRegistros.add(estadisticas10);
        Estadisticas estadisticas11 = new Estadisticas(12, 111, 100, 10, 15, 90, 50);
        listaRegistros.add(estadisticas11);


        Datos agualunes = new Datos();
        agualunes.setlunes(20);      
        agualunes.setmartes(15);    
        agualunes.setmiercoles(30);
        agualunes.setjueves(10);
        agualunes.setviernes(12);
        agualunes.setsabado(28);
        agualunes.setdomingo(25);
        
    
        System.out.println("Lunes:" + agualunes.getlunes() + "%" +
                " Martes:" + agualunes.getmartes() + "%" +
                " Miercoles:" + agualunes.getmiercoles() + "%" +
                " Jueves:" + agualunes.getjueves() + "%" +
                " Viernes:" + agualunes.getviernes() + "%" +
                " Sabado:" + agualunes.getsabado() + "%" +
                " Domingo:" + agualunes.getdomingo() + "%");

        Estadisticas estadDesdeAgualunes = new Estadisticas(
                agualunes.getlunes(), agualunes.getmartes(), agualunes.getmiercoles(),
                agualunes.getjueves(), agualunes.getviernes(), agualunes.getsabado(),
                agualunes.getdomingo()
        );
        


       
        listaRegistros.add(estadDesdeAgualunes); 

        System.out.println("\n--- RESULTADOS DEL ARRAYLIST ---");
        
        for (int i = 0; i < listaRegistros.size(); i++) {
            System.out.println("Registro #" + (i + 1) + ":");
            
       
            listaRegistros.get(i).cuentaEstadistica();

   
        }
         System.out.println("segunda prueba de memoria de 10 lugares a ver si es cierto");

          listaRegistros.get(0).cuentaEstadistica();
    }
}