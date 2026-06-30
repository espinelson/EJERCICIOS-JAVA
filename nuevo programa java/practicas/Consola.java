public class Consola{

private String tituloDeJuego1;
private String tituloDeJuego2;
private String tituloDeJuego3;
private String tituloDeJuego4;
private String tituloDeJuego5;
private String tipoDeConsola;
private String color;

//metodo 




public void tipoDeConsola(){

}

//constructor

public Consola(String uno, String dos, String tres, String tituloDeJuego4, String tituloDeJuego5){
this.tituloDeJuego1="minecraft";
this.tituloDeJuego2="lol";
this.tituloDeJuego3="fornito";
this.tituloDeJuego4="halo";
this.tituloDeJuego5="gof of ware";
}

public static void titulos(){
 System.out.println( "el jeugo 1 es" + tituloDeJuego1);
}



// modificadores 
public String gettituloDeJuego1(){
    return tituloDeJuego1;
}
public void settituloDeJuego1(String tituloDeJuego1){
    this.tituloDeJuego1=tituloDeJuego1;
}

public String gettituloDeJuego2(){
    return tituloDeJuego2;
}
public void settituloDeJuego2(String tituloDeJuego2){
    this.tituloDeJuego2=tituloDeJuego2;
}


public String gettituloDeJuego3(){
    return tituloDeJuego3;
}
public void settituloDeJuego3(String tituloDeJuego3){
    this.tituloDeJuego3=tituloDeJuego3;
}

public String gettituloDeJuego4(){
    return tituloDeJuego3;
}
public void settituloDeJuego4(String tituloDeJuego4){
    this.tituloDeJuego4=tituloDeJuego4;
}

public String gettituloDeJuego5(){
    return tituloDeJuego5;
}
public void settituloDeJuego5(String tituloDeJuego5){
    this.tituloDeJuego5=tituloDeJuego5;
}

//mi main

     public static void main(String[] args) {
 System.out.println("titulos");
 titulos();

     }
}