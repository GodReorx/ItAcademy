package Instrumentos;

public class VientoInstrumento extends InstrumentosMusicales{

    public VientoInstrumento(String nombre, double precio){
        super(nombre,precio);
    }
    public void tocar() {
        System.out.println("Està sonant un instrument de vent");
    }
}
