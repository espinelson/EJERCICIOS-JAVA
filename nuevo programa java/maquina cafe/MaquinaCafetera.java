/*
//molde de galletas
public class Cafecito {

//atributos de la cafetera, cosas que la describen
//============================================================

//no acceso
private String tamanioDeVaso;
private String tipoDeCafe;
private String marcaCafetera;
//si acceso
private int litrosTanqueAgua; 
private int litrosTanqueLeche;

private String azucar;
private String tipo;
private String temperatura;


//===========================================================
//inicializamos el contructor completo
public Cafecito(String tamanioDeVaso, String tipoDeCafe, String marcaCafetera, String azucar, String tipo, String temperatura){
    this.tamanioDeVaso = tamanioDeVaso;
    this.tipoDeCafe = tipoDeCafe;   
    this.marcaCafetera = marcaCafetera;

    this.azucar = azucar;
    this.tipo = tipo;
    this.temperatura = temperatura;
    
}

//constructor insumos
//================================================================
public Cafecito(int litosTanqueAgua, int litrosTanqueLeche){
    this.litrosTanqueAgua = 10;
    this.litrosTanqueLeche = 5;
}

//constructor cafe
//===============================================================
public Cafecito(String azucar, String tipo, String temperatura){
   this.azucar = "si";
   this.tipo = "late";
   this.temperatura = "caliente";
}

//METODOS (ACCIONES)


//RESTAMOS AGUA
public void insumos(int litrosTanqueAgua, int litrosTanqueLeche){
    this.litrosTanqueAgua  -= litrosTanqueAgua;
    this.litrosTanqueLeche -= litrosTanqueLeche;

    System.out.println( "tenemos"+ this.litrosTanqueAgua+"de agua");
    System.out.println( "tenemos"+this.litrosTanqueLeche+"de leche");
}
//MARCAMOS QUE CAFE TENEMOS
public void setMarca(String marcaCafetera) {
        this.marcaCafetera = marcaCafetera;
    }
//PREPARAMOS CAFE

public void preparando(String tipo){
    System.out.println("preparando cafe tipo"+this.tipo);
}


//geters
public int getlitrosTanqueAgua()
{
return this.litrosTanqueAgua;
}

public int getlitrosTanqueLeche()
{
return this.litrosTanqueLeche;
}
//LISTO 





//main
public static void main(String[] args) {

Cafecito c1 = new Cafecito(1,1);
Cafecito c2 = new Cafecito("si", "late", "caliente");
System.out.println("Tipo: "        + c1.getlitrosTanqueAgua());
System.out.println("Tipo: "        + c1.getlitrosTanqueLeche());

}


}


