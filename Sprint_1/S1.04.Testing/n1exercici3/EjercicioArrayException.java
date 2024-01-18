package org.example;

public class EjercicioArrayException {

    public static void recorreArray(Integer[] numbers, int size){
        try{
            for (int i = 0; i < size; i++) {
                numbers[i] += 1;
            }
            System.out.println("Array modificado correctamente.");
            for (int i = 0; i < size; i++) {
                System.out.println(numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Fuera de rango");
        }
    }
}
