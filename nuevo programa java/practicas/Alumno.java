public class Alumno {
//==============================================================================
//======DATOS========
    private int id;
    private String nombre;
    private String apellido;
//=====Gustos=======
    private String comida;
    private String bebida;
    private String videojuegos;
//==============================================================================

    public void mostrarNombre(){
        System.out.println("hola soy un alumno y se decir mi nombre");
        System.out.println("id alumno: "+this.id+ " nombre del alumno: "+this.nombre + " apellido del alumno: "+ this.apellido);
    }
    public void mostrarGustos(){
        System.out.println("hola soy un alumno mis gustos son");
        System.out.println("comida: "+this.comida + " bebida: " + this.bebida + " videojuego "+ this.videojuegos);
    }


    public Alumno(int id, String nombre, String apellido){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public Alumno(String comida, String bebida, String videojuegos){
        this.comida=comida;
        this.bebida=bebida;
        this.videojuegos=videojuegos;
    }
//====================================================================================================================================
//seters y geters que no sirven porque esta el main dentro del clase alumno 
//====================================================================================================================================
public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // --- Para el Nombre ---
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // --- Para el Apellido ---
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
//=====================================================================================================================
//===============================================================================================================
    // 3. El método MAIN directo en Alumno para que el compilador lo encuentre rápido
    public static void main(String[] args) {

        Alumno al1_datos = new Alumno(1,"david","cerecedo");
        al1_datos.mostrarNombre();
        System.out.println("**************************************************************************");

        Alumno al1_gustos = new Alumno("tacos","cocacola","fornito");
        al1_gustos.mostrarGustos();

        System.out.println("**************************************************************************");
        al1_datos.setNombre("David Alejandro");
        System.out.println("El alumno con ID " + al1_datos.getId() + " cambió su nombre a: " + al1_datos.getNombre());
        al1_datos.mostrarNombre();

        System.out.println("**************************************************************************");

        Alumno al3 = new Alumno(2,"pedro","ruizzzz");
        al3.mostrarNombre();

        
    }
}