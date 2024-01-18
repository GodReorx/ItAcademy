package Instrumentos;

public class PercusionInstrumento extends InstrumentosMusicales{

    public PercusionInstrumento(String nombre, double precio){
        super(nombre,precio);
    }
    public void tocar() {
        System.out.println("Està sonant un instrument de percussio");
    }
}
