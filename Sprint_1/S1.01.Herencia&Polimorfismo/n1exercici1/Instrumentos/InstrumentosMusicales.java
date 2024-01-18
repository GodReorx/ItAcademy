package Instrumentos;

public abstract class InstrumentosMusicales{

    //Atributos
    private String nombre;
    private double precio;

    //Constructor
    public InstrumentosMusicales(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getter
    public String getNombre(){
        return this.nombre;
    }
    public  double getPrecio(){
        return this.precio;
    }

    //Setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    //Metodos generales
    public abstract void tocar();

    //Metodo propios
    public String toString(){
        return "El instrumento " + this.nombre + " tiene un coste de " + this.precio + " euros.";
    }
}
