package Clases;

public class Iniciador {
    public static void startApp(){
        Persona persona = new Persona("Perico", "Palotes", 200);
        String residencia = "Apartamento";
        char letra = 'Z';
        GenericMethods.printGenerics(persona,residencia,letra);
        GenericMethods.printGenerics(residencia,persona,'a');
    }
}
