public class Lectura {
    private int valor;
    private String tiempo; // "Lunes", "Martes", etc.

    public Lectura() {
    }

    public Lectura(int valor, String tiempo) {
        this.valor = valor;
        this.tiempo = tiempo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
}