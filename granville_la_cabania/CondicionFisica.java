public class CondicionFisica{

    private int nivelDeVida;


    public CondicionFisica(){
    }

    public CondicionFisica(int nivelDeVida){

        this.nivelDeVida=nivelDeVida;
        }

    public int getNiveldevida(){
        return this.nivelDeVida;
        }
    
    public void setNiveldevida(int niveldevida){
        this.nivelDeVida=niveldevida;
    }



     public void salud(){
        System.out.print("su nivel de vida es: ");

            if(getNiveldevida()==100){

            System.err.print("excelente");
            }
           if(getNiveldevida()<=100 && getNiveldevida()>50 ){

            System.err.print("podria mejorar");
        }
         if(getNiveldevida()<=50){

            System.err.print("cuidado");
        }
    }

    


}


