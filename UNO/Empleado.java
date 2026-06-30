public class Empleado extends Persona {
    int num_ine;
    String cargo;
    Double sueldo;

    // Constructor vacío
    public Empleado() {
    }

    // Constructor con parámetros propios y heredados
    public Empleado(int num_ine, String cargo, Double sueldo, int id, String dni, String nombre, 
    String apellido, String domicilio, String telefono) {

        super(id, dni, nombre, apellido, domicilio, telefono);
        this.num_ine = num_ine;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    // Getters y Setters propios
    public int getNum_ine() {
        return num_ine;
    }

    public void setNum_ine(int num_ine) {
        this.num_ine = num_ine;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
