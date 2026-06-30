public class Video38{
    public static void main(String[] args) {
        var cadena1 = "hola mundo";
        System.out.println("indice1=" + cadena1);

        //subcadena de mundo

        var indice1 = cadena1.indexOf("hola");

        System.out.println("indice1=" + indice1);

        var indice2 = cadena1.lastIndexOf("mundo");
        System.out.println("indice2=" + indice2);

        var indice3 = cadena1.lastIndexOf("java");
        System.out.println("indice3=" + indice3);

    }
}