class Computadora{
private String procesador;
private int ram;
private String discoDuro;
private String pantalla;
//====================================
public void word(){
    if(ram <= 4){
        System.out.println("si abre el word");
    }
    else{
        System.out.println("no lo abre");
    }
}

public void fornite(){
    if(ram <= 4 && procesador == ("i7")){
        System.out.println("si abre el fornito");
    }
    else{
        System.out.println("no abre el fornito");
    }
}
//=============================================
public Computadora(String procesador,int ram,String discoDuro, String pantalla)

{
    this.procesador=procesador;
    this.ram=ram;
    this.discoDuro=discoDuro;
    this.pantalla=pantalla;
}   

//==============================================================
public String getProcesador(){
    return procesador;
}
public void setProcesador(){
    this.procesador=procesador;
}

public int getRam(){
    return ram;
}
public void setRam(){
    this.ram=ram;
}

public String getDiscoDuro(){
    return discoDuro;
}

public void setDiscoDuro(){
    this.discoDuro=discoDuro;
}

public static void main(String[] args) {
System.out.println("prueba");

Computadora pc1 = new Computadora("i7",5,"500gb","4k");
pc1.word();
pc1.fornite();





}




    
}