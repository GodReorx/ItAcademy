package Clases;

public class F1Noticias extends Noticias{
    private String escuderia;

    public F1Noticias (String titular, String escuderia){
        super(titular);
        this.escuderia = escuderia;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    public int calcularPrecioNoticia() {
        int precio = 100;
        precio += this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")  ? 50 : 0;
        return precio;
    }

    public int calcularPuntosNoticia() {
        int puntos = 4;
        puntos += this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")  ? 2 : 0;
        return 0;
    }
}
