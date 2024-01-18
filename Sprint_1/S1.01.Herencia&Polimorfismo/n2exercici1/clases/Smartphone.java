package clases;

public class Smartphone extends Telefono implements APPS.Camara,APPS.Reloj{

    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    public void fotografiar() {
        System.out.println("Se está haciendo una foto.");
    }

    public void alarma() {
        System.out.println("Esta sonando la alarma.");
    }
}
