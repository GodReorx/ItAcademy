package Clases;

public class MotoNoticias extends Noticias{
    private String equipo;

    public MotoNoticias(String titular, String equipo){
        super(titular);
        this.equipo = equipo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int calcularPrecioNoticia() {
        int precio = 100;
        precio += this.equipo.equalsIgnoreCase("Honda") || this.equipo.equalsIgnoreCase("Yamaha")  ? 50 : 0;
        return precio;
    }

    public int calcularPuntosNoticia() {
        int puntos = 3;
        puntos += this.equipo.equalsIgnoreCase("Honda") || this.equipo.equalsIgnoreCase("Yamaha")  ? 3 : 0;
        return 0;
    }}
