public class Datos{
    //atributos en privado
    private String nombre;
    private String apellido; 
    private int edad;


    public Datos(){

    }
    
    public Datos(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        
    }


     public void id(){

        System.out.print("ID--");
        System.out.print("nombre: "+ nombre +" apellido: " + apellido +  " Edad: " + edad);

}
    
  

    /****************************************** */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    /**************************************** */

    public String getApellido(){
        return apellido;
    }

    public void setApellido(){
        this.apellido = apellido;
    }

  /********************************************** */

   public int getEdad(){
        return edad;
    }

    public void setEdad(){
        this.edad = edad;

    }
    /******************************************** */






    
    //constructor con this

    //seters geters


}