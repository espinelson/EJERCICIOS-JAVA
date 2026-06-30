public class Main {
    public static void main(String[] args) {
        
        // Creando un empleado (usando el constructor vacío para probar)
        Empleado emple = new Empleado();
        
        // El empleado usa métodos propios
        emple.setNum_ine(101);
        System.out.println("ine: " + emple.getNum_ine());
        
        // El empleado usa métodos HEREDADOS de Persona
        emple.setNombre("Susana");
        System.out.println("Nombre: " + emple.getNombre());


        System.out.println("--------------------");


        // Creando un consultor
        Consultor consul = new Consultor();
        
        // El consultor usa métodos propios
        consul.setNum_consultor(555);
        System.out.println("Num Consultor: " + consul.getNum_consultor());
        
        // El consultor usa métodos HEREDADOS de Persona
        consul.setApellido("Perez");
        System.out.println("Apellido: " + consul.getApellido());
    }
}