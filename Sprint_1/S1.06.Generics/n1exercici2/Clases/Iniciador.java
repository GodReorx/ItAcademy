package Clases;

public class Iniciador {
    public static void startApp(){
        Persona persona = new Persona("Perico", "Palotes", 200);
        String residencia = "Apartamento";
        char letra = 'Z';

        GenericsMethods.printGenerics(persona,residencia, letra);
        GenericsMethods.printGenerics(letra,persona, residencia);
    }
}
