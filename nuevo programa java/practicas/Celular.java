
public class Celular {
//==============================================================================
//======DATOS========
    private int id;
    private String marca;
    private String modelo;
//=====Caracteristicas=======
    private int almacenamientoGB;
    private String color;
    private String sistemaOperativo;
//==============================================================================
 
    public void mostrarDatos(){
        System.out.println("hola soy un celular y se decir mis datos");
        System.out.println("id celular: "+this.id+ " marca: "+this.marca + " modelo: "+ this.modelo);
    }
    public void mostrarCaracteristicas(){
        System.out.println("hola soy un celular mis caracteristicas son");
        System.out.println("almacenamiento: "+this.almacenamientoGB + "GB, color: " + this.color + ", SO "+ this.sistemaOperativo);
    }
 
    public Celular(int id, String marca, String modelo int almacenamientoGB, String color, String sistemaOperativo){
        this.id=id;
        this.marca=marca;
        this.modelo=modelo;
        this.almacenamientoGB=almacenamientoGB;
        this.color=color;
        this.sistemaOperativo=sistemaOperativo;
    }
 
//====================================================================================================================================
//seters y geters
//====================================================================================================================================
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
 
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
 
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
 
//===============================================================================================================
    public static void main(String[] args) {
 
        Celular c1_datos = new Celular(1,"Samsung","Galaxy S23");
        c1_datos.mostrarDatos();
        System.out.println("**************************************************************************");
 
        Celular c1_caract = new Celular(256, "Negro", "Android");
        c1_caract.mostrarCaracteristicas();
 
        System.out.println("**************************************************************************");
        c1_datos.setModelo("Galaxy S24");
        System.out.println("El celular con ID " + c1_datos.getId() + " cambió su modelo a: " + c1_datos.getModelo());
        c1_datos.mostrarDatos();
 
        System.out.println("**************************************************************************");
 
        Celular c2 = new Celular(2,"Apple","iPhone 15");
        c2.mostrarDatos();
 
    }
}