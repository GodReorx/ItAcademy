package Clases;

public class FutbolNoticia extends Noticias {
    private String competicion;
    private String club;
    private String jugador;

    public FutbolNoticia(String titular, String competicion, String club, String jugador) {
        super(titular);
        this.competicion = competicion;
        this.club = club;
        this.jugador = jugador;
    }

    public String getCompeticion() {
        return competicion;
    }
    public String getClub() {
        return club;
    }
    public String getJugador() {
        return jugador;
    }
    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }
    public void setClub(String club) {
        this.club = club;
    }
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public int calcularPrecioNoticia() {
        int precio = 300;
        precio += this.competicion.equalsIgnoreCase("Liga de Campeones") ? 100 : 0;
        precio += this.club.equalsIgnoreCase("Madrid") || this.club.equalsIgnoreCase("Barça") ? 100 : 0;
        precio += this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema") ? 50 : 0;
        return precio;
    }

    public int calcularPuntosNoticia() {
        int puntos = 5;
        puntos += this.competicion.equalsIgnoreCase("Liga de Campeones") ? 3 : 0;
        puntos += this.competicion.equalsIgnoreCase("Liga") ? 2 : 0;
        puntos += this.club.equalsIgnoreCase("Madrid") || this.club.equalsIgnoreCase("Barça") ? 1 : 0;
        puntos += this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema") ? 1 : 0;
        return 0;
    }
}
