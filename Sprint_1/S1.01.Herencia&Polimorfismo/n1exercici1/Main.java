import Instrumentos.*;

public class Main {
    public static void main(String[] args) {
        CuerdaInstrumento cuerdaInstrumento = new CuerdaInstrumento("Violin",50);
        PercusionInstrumento percusionInstrumento = new PercusionInstrumento("Tambor",60);
        VientoInstrumento vientoInstrumento = new VientoInstrumento("Flauta",30);

        vientoInstrumento.tocar();
        System.out.println(vientoInstrumento.toString());

        percusionInstrumento.tocar();
        System.out.println(percusionInstrumento.toString());
    }
}