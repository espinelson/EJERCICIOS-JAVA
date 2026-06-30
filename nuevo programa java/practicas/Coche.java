public class Coche{
//=========================================================================================
private String color;
private String marca;
private String puertas;
private String motor;
private String tipoDeGasolina;
//=========================================================================================
public void verificando(){
    if(tipoDeGasolina==("magna")){
        System.out.println("adelante caminante");
    }
    else{
        System.out.println("ya te chingaste el motor");
    }
}

public void validaTipoDeAuto(){
    if(motor==("v8")&&(marca==("bmw"))){
        
            System.out.println("vamonos por unas rucas");
            
        }
    
    else{
        System.out.println("no podras ir por unas rucas");
    }
    
}

//====================================================================================
//constructor
public Coche(String color, String marca, String puertas, String motor, String X){
this.color=color;
this.marca=marca;
this.puertas=puertas;
this.motor=motor;
this.tipoDeGasolina=X;
}

public String getColor(){
    return color;
}
public void setColot(String color){
    this.color=color;
}

public String getMarca(){
    return marca;
}
public void setMarca(String marca){
    this.marca=marca;
}

public String getpuertas(){
    return puertas;
}
public void setPuertas(String puertas){
    this.puertas = puertas;
}

public String germotor(){
    return motor;
}
public void setMotor(String motor){
    this.motor=motor;
}

public String getTipoDeGasolina(){
    return tipoDeGasolina;
}

public void setTipoDeGasolina(String x){
    this.tipoDeGasolina = x;
}
//=========================================================================================


//===========================
  public static void main(String[] args) {
  System.out.println("probando");
  
  Coche Auto1_estado = new Coche("blanco", "ford", "2", "v8", "magna");
  Auto1_estado.verificando();
  Auto1_estado.tipoDeAuto();

 System.out.println("**************************************************************************");
  Auto1_estado.setMarca("bmw");
        System.out.println("El auto cambio a " + Auto1_estado.getMarca());
Auto1_estado.tipoDeAuto();


  }
}