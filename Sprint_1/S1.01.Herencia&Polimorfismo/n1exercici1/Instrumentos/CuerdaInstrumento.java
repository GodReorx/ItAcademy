package Instrumentos;

public class CuerdaInstrumento extends InstrumentosMusicales{

    public CuerdaInstrumento(String nombre, double precio){
        super(nombre,precio);
    }
    public void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }
}
