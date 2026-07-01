public class Persona1{

    public static void main(String[] args) {
        System.out.println("******Bienvenido al Ine********");
        System.out.print("Ingrese sus datos:");
        System.out.println("");

        


       


        Datos persona12 = new Datos("david", "cerecedo", 12);
       // System.out.print(persona12.getNombre()+" "+ persona12.getApellido() + " " + persona12.getEdad()); 
        persona12.id();
        System.out.println("");
        System.out.println("***************************************************************");
       
        Datos persona2 = new Datos("adriana", "Ruiz", 50);
        persona2.id();
        
    
    


    }


}