public class Juguete{

//====DATOS====
//=====VISTA
private String color;
private String textura;
private int peso;
//====FUNCIONES
private String calidad;
private String forma;
//=============================funciones===============================
public void todo(){
    System.out.println("su resuestas son "+this.color+ "_"+this.textura+"_"+this.peso+"_"+this.calidad+"_"+this.forma);

    }

public void rueda(){
    System.out.println("su resuestaaa es "+this.forma);

    if(forma == ("redonda")){
        System.out.println("el juguete si tiene la capacidad de rodar");
    }
    else {
        System.out.println("el juguete no tiene la capacidad de rodar");

    }
}
public void refleja(){
    System.out.println("su resuesta es "+this.color);
        if(color == ("claro")){
            System.out.println("el juguete refleja la luz correctamente");
        }
        else{
             System.out.println("el juguete es oscuro y no puede reflejar");
        }
}
//==================================================================================

//constructores
//================================================================================
public Juguete(String color, String textura, int peso){
    this.color=color;
    this.textura=textura;
    this.peso=peso;
}
public Juguete(String calidad, String forma){
    this.calidad=calidad;
    this.forma=forma;
}
//==============================================
//GETERS Y SETERS
//================================================
public String getColor(){
     return color;
}
public void setColor(String color){
    this.color=color;
}
//****************** */
public String getTextura(){
    return textura;
}
public void SetTextura(String textura){
    this.textura=textura;
}
/******************* */
public int getPeso(){
    return peso;
}
public void setPeso(int peso){
    this.peso = peso;
}
//===========================================================
//main
    public static void main(String[] args) {
        System.out.println("prueba1");

     Juguete Juguete1_VISTA = new Juguete("ROJO","POROSO",5);
     Juguete Juguete1_FUNCIONES = new Juguete("buena","redonda");
     
     Juguete1_VISTA.refleja();
     Juguete1_FUNCIONES.rueda();
     Juguete1_VISTA.todo();
     Juguete1_FUNCIONES.todo();
     
System.out.println("**************************************************************************");
        
        Juguete1_VISTA.setColor("claro");
        System.out.println("El juguete cambio cambió  a: " + Juguete1_VISTA.getColor());
        Juguete1_VISTA.refleja();

        System.out.println("**************************************************************************");
    }
}
