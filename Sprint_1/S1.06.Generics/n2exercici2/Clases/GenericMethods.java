package Clases;

import java.util.ArrayList;

public abstract class GenericMethods<T> {
    public static <T> void printGenerics (T... t){
        System.out.println("Listado :");
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
    }
}
