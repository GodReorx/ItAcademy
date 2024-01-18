import coches.*;

public class Main {
    public static void main(String[] args) {
        Cotxe coche1 = new Cotxe(500);
        Cotxe coche2 = new Cotxe(150);

        coche1.acelerar();
        Cotxe.frenar();
    }
}