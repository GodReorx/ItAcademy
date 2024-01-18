package Clases;

public class BasquetNoticias extends Noticias{
    private String competicion;
    private String club;

    public BasquetNoticias(String titular, String competicion, String club){
        super(titular);
        this.competicion = competicion;
        this.club = club;
    }

    public String getCompeticion() {
        return competicion;
    }
    public String getClub() {
        return club;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }
    public void setClub(String club) {
        this.club = club;
    }

    public int calcularPrecioNoticia() {
        int precio = 250;
        precio += this.competicion.equalsIgnoreCase("Eurolliga") ? 75 : 0;
        precio += this.club.equalsIgnoreCase("Madrid") || this.club.equalsIgnoreCase("Barça") ? 100 : 0;
        return precio;
    }

    public int calcularPuntosNoticia() {
        int puntos = 4;
        puntos += this.competicion.equalsIgnoreCase("Eurolliga") ? 3 : 0;
        puntos += this.competicion.equalsIgnoreCase("ACB") ? 2 : 0;
        puntos += this.club.equalsIgnoreCase("Madrid") || this.club.equalsIgnoreCase("Barça") ? 1 : 0;
        return 0;
    }
}
