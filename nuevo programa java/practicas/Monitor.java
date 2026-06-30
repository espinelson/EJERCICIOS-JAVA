public class Monitor {
//==============================================================================
//======DATOS========
    private int id;
    private String marca;
    private String modelo;
//=====Caracteristicas=======
    private String resolucion;
    private int tamanioPulgadas;
    private String tipoPanel;
//==============================================================================

    public void mostrarDatos(){
        System.out.println("hola soy un monitor y se decir mis datos");
        System.out.println("id monitor: "+this.id+ " marca: "+this.marca + " modelo: "+ this.modelo);
    }
    public void mostrarCaracteristicas(){
        System.out.println("hola soy un monitor mis caracteristicas son");
        System.out.println("resolucion: "+this.resolucion + " tamaño: " + this.tamanioPulgadas + " pulgadas, panel "+ this.tipoPanel);
    }


    public Monitor(int id, String marca, String modelo){
        this.id=id;
        this.marca=marca;
        this.modelo=modelo;
    }

    public Monitor(String resolucion, int tamanioPulgadas, String tipoPanel){
        this.resolucion=resolucion;
        this.tamanioPulgadas=tamanioPulgadas;
        this.tipoPanel=tipoPanel;
    }
//====================================================================================================================================
//seters y geters
//====================================================================================================================================
public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // --- Para la Marca ---
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // --- Para el Modelo ---
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
//=====================================================================================================================
//===============================================================================================================
    // El método MAIN directo en Monitor
    public static void main(String[] args) {

        Monitor m1_datos = new Monitor(1,"Samsung","Odyssey G5");
        m1_datos.mostrarDatos();
        System.out.println("**************************************************************************");

        Monitor m1_caract = new Monitor("1440p", 27, "VA");
        m1_caract.mostrarCaracteristicas();

        System.out.println("**************************************************************************");
        m1_datos.setModelo("Odyssey G7");
        System.out.println("El monitor con ID " + m1_datos.getId() + " cambió su modelo a: " + m1_datos.getModelo());
        m1_datos.mostrarDatos();

        System.out.println("**************************************************************************");

        Monitor m2 = new Monitor(2,"LG","UltraGear");
        m2.mostrarDatos();

       
    }
}