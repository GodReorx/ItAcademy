package Clases;

public class TenisNoticias extends Noticias{
    private String competicion;
    private String tenista;

    public TenisNoticias (String titular, String competicion, String tenista){
        super(titular);
        this.competicion = competicion;
        this.tenista = tenista;
    }

    public String getCompeticion() {
        return competicion;
    }
    public String getTenista() {
        return tenista;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }
    public void setTenista(String tenista) {
        this.tenista = tenista;
    }

    public int calcularPrecioNoticia() {
        int precio = 150;
        precio += this.tenista.equalsIgnoreCase("Federer") || this.tenista.equalsIgnoreCase("Nadal") || this.tenista.equalsIgnoreCase("Djokovic") ? 100 : 0;
        return precio;
    }

    public int calcularPuntosNoticia() {
        int puntos = 4;
        puntos += this.tenista.equalsIgnoreCase("Federer") || this.tenista.equalsIgnoreCase("Nadal") || this.tenista.equalsIgnoreCase("Djokovic") ? 3 : 0;
        return 0;
    }
}
