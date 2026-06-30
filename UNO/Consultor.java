public class Consultor extends Persona {
    String nombre_consultora;
    int num_consultor;

    // Constructor vacío
    public Consultor() {
    }

    // Constructor con parámetros propios y heredados
    public Consultor(String nombre_consultora, int num_consultor, int id, String dni, String nombre,
     String apellido, String domicilio, String telefono) {
        
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultora = nombre_consultora;
        this.num_consultor = num_consultor;
    }

    // Getters y Setters propios
    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }
}