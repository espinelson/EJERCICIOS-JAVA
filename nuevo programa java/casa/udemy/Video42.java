public class Video42{
    public static void main(String[] args) {
        

        System.out.println("***Generador de Email***");
        var nombre = "    David";
        var apellidoP= "Cerecedo";
        var apellidoM="Ruiz";
        final var empresa = "Daceru electronics";
        final var dominio = "@daceru.com.mx";

        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(nombre);
        constructorCadenas.append(" ");
        constructorCadenas.append(apellidoP);
        constructorCadenas.append(" ");
        constructorCadenas.append(apellidoM);
        var resultado = constructorCadenas;
        System.out.println("Nombre usuario: " + resultado);

        
        var espacios = resultado.toString().trim();
        System.out.println("Nombre usuario2: " + espacios);

        var nuevaCadena = espacios.replace(" ", ".");
        System.out.println("Nombre usuario: "+nuevaCadena);
        System.out.println("nombre de la empresa: "+empresa);
        System.out.println("extension del domminio: "+dominio);
        System.out.println(nuevaCadena+dominio);

        





        


    }
}