public class Maquina {
//=================================================================
//======DATOS========
    private int id;
    private String tipo;
    private String marca;
//=====Caracteristicas=======
    private String funcion;
    private int potenciaWatts;
    private String estado;
//==============================================================================
 
    public void mostrarDatos(){
        System.out.println("hola soy una maquina y se decir mis datos");
        System.out.println("id maquina: "+this.id+ " tipo: "+this.tipo + " marca: "+ this.marca);
    }
    public void mostrarCaracteristicas(){
        System.out.println("hola soy una maquina mis caracteristicas son");
        System.out.println("funcion: "+this.funcion + " potencia: " + this.potenciaWatts + "w, estado "+ this.estado);
    }
 
    public Maquina(int id, String tipo, String marca){
        this.id=id;
        this.tipo=tipo;
        this.marca=marca;
    }
 
    public Maquina(String funcion, int potenciaWatts, String estado){
        this.funcion=funcion;
        this.potenciaWatts=potenciaWatts;
        this.estado=estado;
    }
 
//==================================================================================
//seters y geters
//==================================================================================================================
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
 
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
 
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
 
//===============================================================================================================
    public static void main(String[] args) {
 
        Maquina m1_datos = new Maquina(1,"Vending","Crane");
        m1_datos.mostrarDatos();
        System.out.println("**************************************************************************");
 
        Maquina m1_caract = new Maquina("Despacho de agua", 750, "Activa");
        m1_caract.mostrarCaracteristicas();
 
        System.out.println("**************************************************************************");
        m1_datos.setMarca("Royal Vendors");
        System.out.println("La maquina con ID " + m1_datos.getId() + " cambió su marca a: " + m1_datos.getMarca());
        m1_datos.mostrarDatos();
 
        System.out.println("**************************************************************************");
 
        Maquina m2 = new Maquina(2,"Purificadora","GenericBrand");
        m2.mostrarDatos();
 
    }
}
 
 