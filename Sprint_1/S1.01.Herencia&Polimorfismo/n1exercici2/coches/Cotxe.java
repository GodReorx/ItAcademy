package coches;

public class Cotxe {

    /*Static pertenece a la clase no al objeto, si modificas --> se modifican para todos, si es publica puedes usarla
    sin necesidad de crear el objeto. No puedes init desde el constructor */

    //final bloquea la variable para que no se pueda modificar en ningun momento, se puede inicializar desde el constructor.

    //static final hace el combo de ambas, poder usarla y no dejará modificarla, no puedes init del constructor
    public static final String marca = "Dodge";
    public static String modelo = "Challenger";
    private final double potencia;

    public Cotxe(double potencia) {
        this.potencia = potencia;
    }

    public static void setModelo(String modelo) {
        Cotxe.modelo = modelo;
    }
    public static String getModelo() {
        return modelo;
    }
    public double getPotencia() {
        return potencia;
    }

    //Metodos
    //Se llama a la funcion sin usar el objeto, usando la clase Cotxe.frenar()
    public static void frenar(){
        System.out.println("El coche esta frenando");
    }
    //Necesita un objeto creado para poder llamarla
    public void acelerar(){
        System.out.println("El coche esta acelerando");
    }

    public String toString(){
        return "El coche " + marca + " modelo " + modelo + " tiene una potencia de " + potencia;
    }
}
