package Clases;

public abstract class Noticias {
    private String titular;
    private String texto;
    private int puntuacion;
    private int precio;

    public Noticias (String titular){
        this.titular = titular;
        this.texto = "";
        this.puntuacion = 0;
        this.precio = 0;
    }

    public String getTitular() {
        return titular;
    }
    public String getTexto() {
        return texto;
    }
    public int getPuntuacion() {
        return puntuacion;
    }
    public int getPrecio() {
        return precio;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract int calcularPrecioNoticia();
    public abstract int calcularPuntosNoticia();
}
