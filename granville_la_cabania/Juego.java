
public class Juego
{
    private String nombre;
    private String apodo;
    private int edad;
    
    public void estatus(){
            System.out.println("**********************************");
        }

    public static void main(String[] args) {
/* mando a llamar clase estatus en mi main */
        Juego persona1 = new Juego();
        persona1.estatus();
/* mando a llamar la clase clima */
        Clima miClima = new Clima();
        System.out.print("el tiempo es:");
        miClima.Estacion();

/*mando a llamar la clase condicionFisica y aqui envio mi estatus de vida, el estatus de vida sera rand despues uso override y lo sobrescribo con los getes y seters */
        System.out.print(" su nivel de vida es");
        CondicionFisica vida = new CondicionFisica(60);
        vida.salud();

/* tiendita arreglos */
        Tienda miTienda = new Tienda();
        
        // 2. Llamamos al método y GUARDAMOS la información devuelta en el arreglo
        int[] inventarioRecibido = miTienda.configurarInventario();
}
}