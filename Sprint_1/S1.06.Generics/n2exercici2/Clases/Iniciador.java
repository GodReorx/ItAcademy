package Clases;

import java.util.ArrayList;

public class Iniciador {
    public static void startApp(){
        Persona persona1 = new Persona("Perico", "Palotes", 200);
        Persona persona2 = new Persona("Paca", "Garcia", 150);
        Persona persona3 = new Persona("Pepe", "Tormenta", 89);
        Persona persona4 = new Persona("Pepa", "Exposito", 189);

        GenericMethods.printGenerics(persona1);
        GenericMethods.printGenerics(persona2, persona3);
        GenericMethods.printGenerics(persona4, persona1);
        GenericMethods.printGenerics(persona1, persona3, persona2, persona4);
    }
}
