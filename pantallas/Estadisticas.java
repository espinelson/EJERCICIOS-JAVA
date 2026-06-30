import java.util.ArrayList;

public class Estadisticas {
    
    // COMPOSICIÓN: Estadisticas ya no "es" un Dato, ahora TIENE Lecturas.
    private ArrayList<Lectura> registroSemanal;

    public Estadisticas() {
        this.registroSemanal = new ArrayList<>();
    }

    // EL CONSTRUCTOR QUE TE DABA PROBLEMAS (Ya arreglado)
    public Estadisticas(int lunes, int martes, int miercoles, int jueves, int viernes, int sabado, int domingo) {
        this.registroSemanal = new ArrayList<>();
        
        // Ensamblamos las lecturas usando la clase que creaste
        this.registroSemanal.add(new Lectura(lunes, "Lunes"));
        this.registroSemanal.add(new Lectura(martes, "Martes"));
        this.registroSemanal.add(new Lectura(miercoles, "Miércoles"));
        this.registroSemanal.add(new Lectura(jueves, "Jueves"));
        this.registroSemanal.add(new Lectura(viernes, "Viernes"));
        this.registroSemanal.add(new Lectura(sabado, "Sábado"));
        this.registroSemanal.add(new Lectura(domingo, "Domingo"));
    }

    // El cálculo ahora recorre los objetos Lectura
    public void cuentaEstadistica() {
        double sumaTotal = 0;
        
        for (Lectura lectura : registroSemanal) {
            sumaTotal += lectura.getValor();
        }
        
        double media = sumaTotal / 7.0; // Lo dividimos entre 7.0 para que respete decimales
        System.out.printf("La media de agua es: %.2f %%\n", media);
    }
}