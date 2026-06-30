public class Video36{
    public static void main(String[] args) {
        var cadena1 = "   hola mundo";
        
        var longitud = cadena1.length();
        System.out.println("longitud de la cadena es:"+ longitud);
        
        var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println("el cambio de la cadena es:"+nuevaCadena);


        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas:"+ mayusculas);

        var minusculas = cadena1.toLowerCase();
        System.out.println("minusculas: "+minusculas);

        var espacios = cadena1.trim();
        System.out.println("espacios:" + espacios);


    }
}