public class Perfume {
//================================================================
//======DATOS========
    private int id;
    private String marca;
    private String nombre;
//=====Caracteristicas=======
    private String aroma;
    private int mililitros;
    private String genero;
//==============================================================================
 
    public void mostrarDatos(){
        System.out.println("hola soy un perfume y se decir mis datos");
        System.out.println("id perfume: "+this.id+ " marca: "+this.marca + " nombre: "+ this.nombre);
    }
    public void mostrarCaracteristicas(){
        System.out.println("hola soy un perfume mis caracteristicas son");
        System.out.println("aroma: "+this.aroma + " mililitros: " + this.mililitros + "ml, genero "+ this.genero);
    }
 
    public Perfume(int id, String marca, String nombre){
        this.id=id;
        this.marca=marca;
        this.nombre=nombre;
    }
 
    public Perfume(String aroma, int mililitros, String genero){
        this.aroma=aroma;
        this.mililitros=mililitros;
        this.genero=genero;
    }
 
//====================================================================================================================================
//seters y geters
//====================================================================================================================================
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
 
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
 
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
 
//===============================================================================================================
    public static void main(String[] args) {
 
        Perfume p1_datos = new Perfume(1,"Versace","Eros");
        p1_datos.mostrarDatos();
        System.out.println("**************************************************************************");
 
        Perfume p1_caract = new Perfume("Amaderado", 100, "Hombre");
        p1_caract.mostrarCaracteristicas();
 
        System.out.println("**************************************************************************");
        p1_datos.setNombre("Eros Flame");
        System.out.println("El perfume con ID " + p1_datos.getId() + " cambió su nombre a: " + p1_datos.getNombre());
        p1_datos.mostrarDatos();
 
        System.out.println("**************************************************************************");
 
        Perfume p2 = new Perfume(2,"Carolina Herrera","212");
        p2.mostrarDatos();
 
    }
}