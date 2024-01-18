package clases;

public class Telefono{
    private String marca;
    private String modelo;

    public Telefono (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    //Metodos
    public void llamar(String numTelf){
        System.out.println("Se está llamado a " + numTelf);
    }
}
